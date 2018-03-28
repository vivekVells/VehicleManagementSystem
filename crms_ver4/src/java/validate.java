/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
public class validate extends HttpServlet {

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
        String pass = request.getParameter("password");
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
            /* TODO output your page here. You may use following sample code. */
                       
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validation</title>");            
            out.println("</head>");
            out.println("<body>");
           if(!found)
            {
                response.sendRedirect("pre_public_login_page.jsp?error="+"Error");
            }
            else
            {
               //if((id1==(rs.getInt("REG_ID")))&&(password1.equals(rs.getString("PASSWORD"))))
                if(pass.equals(rs.getString("PASSWORD")))
                {      
                    //String regid=request.getParameter("regid"); //got the entered id
                    Cookie ck=new Cookie("id1",String.valueOf(id1));  //cookie being set to track the user
                    response.addCookie(ck);
                     // HttpSession session=request.getSession();  
                //session.setAttribute("regidtrack",id2);  
                    out.println("REG_ID value :"+id1);
                    out.println("Cookie value :" +ck);
                    Cookie cname=new Cookie("name",rs.getString("REG_NAME"));
                    response.addCookie(cname);
                 response.sendRedirect("public_login.jsp?error="+"error");
                  //  out.println("<h1>Servlet validate at " + request.getContextPath() + "</h1>");
                    //ss.setAttribute("ID",id1);
                  //out.println("<h1><font color='red'>Login Susccessfull</font><h1>");  
                //out.println("<h3><a href='EditDetails.jsp'>Edit Your Personal Details</a></h3>");
               // out.println("<a href='Firstpage.jsp'>Click here to exit page</a>");
                }
                else
                response.sendRedirect("pre_public_login_page.jsp?error="+"error");
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
