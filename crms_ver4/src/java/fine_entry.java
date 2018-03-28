/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author HP
 */
public class fine_entry extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
       // String name1 = request.getParameter("name");
        String famt = request.getParameter("fine_amount");
        String rid=request.getParameter("regid");
        String rsn=request.getParameter("reason");
        String ref=request.getParameter("reference");
        String pass=request.getParameter("password");
String ln=request.getParameter("location");
        //HttpSession ss=request.getSession(true);
        Connection con;
        PrintWriter out = response.getWriter();
        try {
             int id1;
             id1=Integer.parseInt(request.getParameter("regid"));
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:crms_ver4_db", "dd", "dd");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_details_table where REG_ID="+id1);
            boolean found=rs.next();
            String name=rs.getString("REG_NAME");
            /* TODO output your page here. You may use following sample code. */
                       
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validation</title>");            
            out.println("</head>");
          out.println("<body style=\"background-color: #fdcba0\" >");
           out.println("<table width=\"1000\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"tblbody\" >"); 
          out.println("<tr>");
   out.println("<td colspan=\"2\">"); 
   out.println("<img src=\"TNbanner.jpg\"  width=\"1000\" height=\"145\" alt=\"TNbanner\" border=\"0\"/>\n" +
"</td>\n" +
"</tr> \n" +
"\n" +
"    \n" +
"     <tr> <td><img src=\"logo3.jpg\" align=\"left\" width=\"108\" height=\"120\" alt=\"logo2\"/><div id=\"caption\">\n" +
"    <h1 style=\"color: black\" align=\"center\">TAMIL NADU POLICE - CITIZEN SERVICES</h1>\n" +
"  <h2 style=\"color: black\" align=\"center\">Vehicle Tracking Network & Systems (VTNS)</h2>\n" +
"   <h3 style=\"black\" align=\"center\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
"       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
"      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
"      Empowering citizens through Information Technology</h3>\n" +
"             </div></td></tr>");
           if(!found)
            {
                out.println("Error has occurred. Try Again");
                out.println("to go back<a href='admin_fine_entry_view.jsp'>click here</a>");
                //RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("admin_fine_entry_view.jsp");
                //dispatcher.forward(request, response);
            }
            else
            {
                String std="NOT PAID";
    String query = "insert into fine_make(REG_ID,NAME_,FINE_AMOUNT,REASON,REFERENCE,STATUS,LOCATION)" + "values('" + rid + "','" + name +"','" + famt + "','" + rsn + "','" + ref + "','" + std + "','" + ln + "')";
            int d=st.executeUpdate(query);              
                
                 if(d==0)
            {
                out.println("<h1><font color='blue'>Please Check Your User Id</font></h1>");
                out.println();
            }
            else
            {
                out.println("<tr><td style='text-align=center'><h1><font color='black'>FINE PAYMENT INTIMATION PROVIDED SUCCESSFULLY<font></h1></td></tr>");
                out.println("<tr><td style='text-align=center'><h2><a href='admin_login.jsp'>BACK</a></h2></td></tr>");
            }   
               
            }
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            rs.close();//Close the result set
            st.close();//Close statement
            con.close();
        }
        catch(Exception e)
        {
            
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
