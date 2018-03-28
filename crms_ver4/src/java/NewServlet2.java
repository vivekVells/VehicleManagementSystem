/*
 * To change this template, choose Tools | Templates
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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

/**
 *
 * @author arunkumar
 */
public class NewServlet2 extends HttpServlet {

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
  protected void processRequest(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
        res.setContentType("text/html");
    PrintWriter out=res.getWriter();
  //         req.getRequestDispatcher("public_login.jsp").include(req, res);  
    Calendar c=Calendar.getInstance();
    DateFormat d=new SimpleDateFormat("dd-MM-yyyy");
     HttpSession ss=req.getSession(true);
    Connection con,con1;
    
    
    String regname=req.getParameter("name");
       // out.println(regname);
    //String reguname=req.getParameter("reg_user_name");
    String regpwd=req.getParameter("password");
    String regdob=req.getParameter("bdate");
    //out.println(regdob);
    String regaddress=req.getParameter("address");
    String regmobno=req.getParameter("mobile");
    String regtype=req.getParameter("type");
    String reglicense=req.getParameter("license_id");
    String acno=req.getParameter("acno");
    String std="NOT RENEWED";
    String std1="NOT PAID";
   
    try {
      /*
       * TODO output your page here. You may use following sample code.
       */
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet NewServlet</title>");      
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
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;REGISTRATION STATUS</h3></center></td></tr>");
        try{  
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           con = DriverManager.getConnection("jdbc:odbc:crms_ver4_db", "dd", "dd");
Statement st7 = con.createStatement();
            ResultSet rs7 = st7.executeQuery("SELECT * FROM Banking_user where ACC_NO="+"'"+acno+"'"+"and Ac_name="+"'"+regname+"'");
            boolean found7=rs7.next();
      if(!found7)
            {
      res.sendRedirect("new_reg_login.jsp?error="+"Error");
            }
      else{      
           if(!reglicense.equals(rs7.getString("LICENSE_ID"))){
            //Statement st = con.createStatement();
res.sendRedirect("new_reg_login.jsp?error="+"error");
           }
      else
           {
           
      String date=String.valueOf(d.format(c.getTime()));

            String query = "insert into user_details_table(REG_NAME,PASSWORD,DOB,ADDRESS,MOBILE_NO,TYPE,LICENSE_ID,RDATE,RE_DATE,Acc_No)"
         + "values('" + regname + "','" + regpwd +"','" + regdob + "','" + regaddress + "','" + regmobno + "','" + regtype + "','" + reglicense + "','"+ date +"','"+ date +"','"+acno+"'  )";
             String   query5 = " update user_details_table" + " set STATUS=" + "'" + std + "'";
 //HttpSession session=req.getSession();  
        //session.setAttribute("REG_ID",);           
Statement st=con.createStatement();
int i=st.executeUpdate(query);
int w=st.executeUpdate(query5);
String query1="select * from user_details_table where LICENSE_ID=" + "'"+reglicense+"'";
//out.println(query1);
ResultSet rs=st.executeQuery(query1);

rs.next();
int id=rs.getInt("REG_ID");
//session.setAttribute("REG_ID", rs.getInt("REG_ID"));
//st.close();
//String query2=new String("select * from user_details_table where REG_ID=" + "'"+regid+"'");
rs.close();
            st.close();
            con.close();
if(0<i)
{
  out.println("<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>YOUR REG ID = "+ id +"</td></tr>" );
out.println("<tr><td><center><h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='pre_public_login_page.jsp'>BACK</a></h3></center></td></tr>");

}
else
  out.println("Unsuccessfull");     
           }
      }
 }
catch(Exception e)
{
  out.println(e);
//res.sendRedirect("new_reg_login.jsp?error="+"error");
}
        out.println("</table>");
      out.println("</body>");
      out.println("</html>");
        
            
    } finally {      
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
