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
public class license_renew_servlet extends HttpServlet {

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
                    Connection con;
        Statement st;
        PrintWriter out = response.getWriter();
        
        
        try {
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
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RENEWAL STATUS</h3></center></td></tr>");
     
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:crms_ver4_db", "dd", "dd");
            st = con.createStatement();
            
            String query1=new String("select * from user_details_table where REG_ID="+id);
               ResultSet rs = st.executeQuery(query1);
              boolean check1=rs.next();
               if(!check1)
               {
                out.println("<h1><font color='red'>Invalid Request!! try again</font></h1>");
                out.println("<a href='public_login.jsp'>Go To Main Page</a>");   
               }
               else{
                 
           String acno=rs.getString("Acc_No");
           String date1=rs.getString("RE_DATE");
           String std="RENEWED";
           String query2=new String("select * from Banking_user where ACC_NO="+"'"+acno+"'");
           
               ResultSet rs1 = st.executeQuery(query2);
              boolean check2=rs1.next();
              if(check2)
              {
                  int bal=rs1.getInt("Amount");
                  bal=bal-500;
                  if(600<=bal)
                  {
                      bal=bal-100;
                      String   query3 = new String(" update Banking_user" + " set Amount=" + "'" + bal + "'" + " WHERE ACC_NO=" +"'"+acno+"'" );
                      int x=st.executeUpdate(query3);
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Available Balance is : "+ bal+"</h3></center></td></tr>");

                      
                      String a[]=date1.split("-");
                int b[]=new int[10];
                for(int i=0;i<a.length;i++)
                {
                    b[i]=Integer.parseInt(a[i]);
                }
                DateFormat d=new SimpleDateFormat("dd-MM-yyyy");
                Calendar date2=Calendar.getInstance();
                date2.set(b[2], b[1], b[0]);
                date2.add(Calendar.DATE, 180);
                String indate=d.format(date2.getTime());
                String query = " update user_details_table" + " set STATUS=" + "'" + std + "'" + " WHERE REG_ID=" + id;
                
                  st.executeUpdate(query);
                  String query5 = " update user_details_table" + " set RE_DATE=" + "'" + indate + "'" + " WHERE REG_ID=" + id;
                  st.executeUpdate(query5);
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Validity upto "+ indate);
out.println("<tr><td><center><h4> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RENEWAL UPDATE RECEIVED</h4></center></td></tr>");
   
out.println("<tr><td><center><h4> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='public_login.jsp'>EXIT</a></center></td></tr>");

                  } else{
            out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;NO AVAILABLE BALANCE IN YOUR ACCOUNT TO RENEW YOUR LICNSE <br>DEPOSIT MONEY IN YOUR ACCOUNT TO PROCEED ");
      out.println("<tr><td><center><h4> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='public_login.jsp'>EXIT</a></center></td></tr>");

              }
              }
              
              
            st.close();
            con.close(); 
            out.println("</body>");
            out.println("</html>");
           
               }
        }
        
        catch (Exception e) {
            out.println(e);

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
