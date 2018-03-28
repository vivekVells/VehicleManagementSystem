<%-- 
    Document   : new_reg_login
    Created on : Jan 13, 2015, 12:57:37 PM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Registeration Page</title>
    </head>
       <body style="background-color: #fdcba0">
           <%
            boolean isset = (request.getParameter("error") == null);
        %>
 <table width="1000" align="center" cellpadding="0" cellspacing="0" class="tblbody" >
 <tr>
   <td colspan="2"> 
   <img src="TNbanner.jpg"  width="1000" height="145" alt="TNbanner" border="0"/>
</td>
</tr> 

<div id="header_wrapper">
     <div align="center" id="header"> 
     <tr> <td><img src="logo2.jpg" align="left" width="108" height="120" alt="logo2"/><div id="caption">
    <h1 style="color: black" align="center">TAMIL NADU POLICE - CITIZEN SERVICES</h1>
  <h2 style="color: black" align="center">Vehicle Tracking Network & Systems (VTNS)</h2>
   <h3 style="black" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      Empowering citizens through Information Technology</h3>
             </div></td></tr>
     
     <%
             isset = (request.getParameter("error") == null);
        %>
        
        <tr><td>
        <h1 style="text-align: center;color: black">    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PUBLIC QUERY PAGE</h1>
        <h2 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STATE VEHICLE RECORDS BUREAU</h2>
 <h3 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;REGISTRATION PAGE</h3>

        <br><br>
       <form name="form_new_reg_login" action="NewServlet2" method="post" style="alignment-adjust: central">
            <table border="0" style="alignment-adjust: central">
                
                <tbody> 
                   <!-- <tr>
                      <td> <br>REG. ID. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" maxlength="7" name="new_reg_id_login" value="" /><br>
            <br> 
                        </td></tr>
                    <tr>-->
                        <td> REG. NAME &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name" /><br>
            <br>
                        </td>  </tr>
                                      </tr>
                    <tr>
                      <td>
                        PASSWORD&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password" value="" /><br><br>
                      </td>
                    </tr>
              <!--      <tr>
                      <td>
                        REENTER PASSWORD<input type="password" name="reenter_password" value="" />
                        <br><br>
                         
                      </td>
                    </tr>-->
                      
                    <tr>
                        <td>D.O.B. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="text" name="bdate"> &nbsp;(dd-mm-yyyy)</font>
                    <br><br> </td></tr>
                    <tr>
                      <td>
                        
                      </td>
                    </tr>
                    <tr>
                        <td>ADDRESS &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address" value="" /><br><br>
                        </td></tr>
                    <tr>
                      <td>MOBILE NO &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="mobile" value="" maxlength="10"/><br><br>
                        </td></tr>
                    <tr>
                        <td>TYPE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="type">
                <option>TWO WHEELER</option>
                <option>FOUR WHEELER</option>
                <option>BOTH</option>
            </select><br>
            <br></td>
                    </tr>
                    <tr>
                        <td>LICENSE ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="license_id" value="" /><br><br>
                        </td></tr>
                     <tr>
                        <td>ACC NO &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="acno" value="" /><br><br>
                        </td></tr>
                     <tr>
                      <td>
                            <input type="submit" value="REGISTER" name="form_new_reg_login" />
                            
                        </td>
                    </tr>
         </td></tr> 
     <tr><td style="text-align: center">
             <br>  <a href="pre_public_login_page.jsp" style="text-align: center">BACK</a></td></tr>
                </tbody>
            </table>

        </form>

        <%
           if (!isset) {
                  out.println("<font color='blue'>Please Enter The Details Correctly! Try Again!</fond>");
                               }
           %>
            <%
           if (!isset) {
                  out.println("<font color='blue'>Enter The Credentials Correctly</fond>");
                               }
           %>
    </body>
</html>
