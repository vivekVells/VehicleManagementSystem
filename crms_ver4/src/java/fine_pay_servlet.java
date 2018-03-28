/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Vivek Vellaiyappan
 */
public class fine_pay_servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          Cookie[] cookies=request.getCookies();
           int id;
        if(cookies!=null)
        {
            for(int j=0;j<cookies.length;j++)
            {
           if(cookies[j].getName().equals("id1")){
               id=Integer.parseInt(cookies[j].getValue());
               String type = request.getParameter("type");
               String amt=request.getParameter("amount");
                 Connection con;
        Statement st;
        PrintWriter out = response.getWriter();
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:crms_ver4_db", "dd", "dd");
            st = con.createStatement();
            String std1="NOT PAID";
            
            
            String query1=new String("select * from fine_make where REG_ID="+id);
               ResultSet rs1 = st.executeQuery(query1);
              boolean check1=rs1.next();
               if(!check1)
               {
 // out.println("<form action=\"no_fine_notify.jsp\" method=\"post\"><input type=\"submit\" value=\"CHECK\"></form>");
                    response.sendRedirect("no_fine_notify.jsp");
               }
               else{
                String name=rs1.getString("NAME_");
                String famt=rs1.getString("FINE_AMOUNT");
                String rsn=rs1.getString("REASON");
                String ref=rs1.getString("REFERENCE");
     
               out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddinPage</title>");
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
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FINE PAYMENT STATUS</h3></center></td></tr>");
       //out.println("COOKIE VALUE :"+id);
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FINE PAYMENT STATUS</h3></center></td></tr>");
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FINE DETAILS</h3></center></td></tr>");
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You are hereby stated to pay the sum of Rs."+famt+"</h3></center></td></tr>");
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;REASON : "+rsn+"</h3></center></td></tr>");
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;REFERENCE : "+ref+"</h3></center></td></tr>");


            out.println("<form action=\"fine_pay_servlet2\" method=\"post\"><input type=\"submit\" value=\"PAY\"></form>");
       
            out.println("</body>");
            out.println("</html>");
            st.close();
            con.close();
               }
        }
        
        catch (Exception e) {
            out.println(e);
                e.printStackTrace();

        }
               
           
           }
                       }
        
            
            
        
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
