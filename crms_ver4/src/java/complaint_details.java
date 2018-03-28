/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.Date;
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
import sun.security.pkcs11.wrapper.Functions;
import java.lang.NullPointerException;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
/**
 *
 * @author arunkumar
 */
public class complaint_details extends HttpServlet {
    private String regid;

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
        PrintWriter out = response.getWriter();
        Connection con;
        
      //  try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet vehicle_details</title>");            
            out.println("</head>");
            out.println("<body >");
    
        try {
          
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet complaint_details</title>");            
            out.println("</head>");
            out.println("<body >");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:crms_ver4_db", "dd", "dd");
            Statement st = con.createStatement();
                        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                       
String query1="select REG_ID,REG_NAME,LICENSE_ID,DOB,ADDRESS,MOBILE_NO from user_details_table";               
ResultSet rs1 = st.executeQuery(query1);
              
              // ResultSet rs;
                    out.println("<td><h1>VEHICLE OWNERS DETAILS</h1></td>");

               boolean check1=rs1.next();
               if(!check1)
               {
                out.println("<h1><font color='red'>Sorry! No DATAS Are Available</font></h1>");
                out.println("<a href='pre_admin_login_page.jsp'>Go To Main Page</a>");   
               }
              else
             {
            out.println("<table width=\"100%\" cellpadding=\"5\" cellspacing=\"5\">"); 
            out.println("<tr>");
            out.println("<th style='text-align: left'>REG ID</th>");
            out.println("<th style='text-align: left'>REG NAME</th>");
            out.println("<th style='text-align: left'>LICENSE ID</th>");
            out.println("<th style='text-align: left'>DOB</th>");
            out.println("<th style='text-align: left'>ADDRESS</th>");
            out.println("<th style='text-align: left'>MOBILE NO</th>");
            out.println("</tr>");   do
               {
                    out.println("<tr>");
                    out.println("<td>"+rs1.getString("REG_ID")+"</font></td>");
                    out.println("<td>"+rs1.getString("REG_NAME")+"</font></td>");
                    out.println("<td>"+rs1.getString("LICENSE_ID")+"</font></td>");
                    out.println("<td>"+rs1.getString("DOB")+"</font></td>");
                    out.println("<td>"+rs1.getString("ADDRESS")+"</font></td>");
                    out.println("<td>"+rs1.getString("MOBILE_NO")+"</font></td>");
                    out.println("</tr>");
               }while(rs1.next());
            out.println("</table>");
            }
                 out.println("</body>");
            out.println("</html>");
        }
        
        catch(Exception e)
        {
            out.println(e);
        }
        finally {            
            out.close();
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
