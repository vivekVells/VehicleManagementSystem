<%-- 
    Document   : admin_feedback_details_view
    Created on : Jan 12, 2015, 5:24:23 PM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DETAILS VIEW PAGE</title>
    </head>
   <body style="background-color: #fdcba0">
           <table width="1000" align="center" cellpadding="0" cellspacing="0" class="tblbody" > 
            <tr>
   <td colspan="2"> 
   <img src="TNbanner.jpg"  width="1000" height="145" alt="TNbanner" border="0"/>
</td>
</tr> 

    
     <tr> <td><img src="logo3.jpg" align="left" width="108" height="120" alt="logo2"/><div id="caption">
    <h1 style="color: black" align="center">TAMIL NADU POLICE - CITIZEN SERVICES</h1>
  <h2 style="color: black" align="center">Vehicle Tracking Network & Systems (VTNS)</h2>
   <h3 style="black" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      Empowering citizens through Information Technology</h3>
             </div></td></tr>

    <tr><td>
        <h1 style="text-align: center;color: black">    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ADMIN QUERY PAGE</h1>
        <h2 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STATE VEHICLE RECORDS BUREAU</h2>
  <h3 style="text-align: center;color: black"> &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;   &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FEEDBACK DETAILS</h3>

        <br><br></td></tr>
      <tr><td>  <form action="feedback_view_servlets" method="POST">
            <input type="submit" value="SHOW DETAILS" style="font-weight: bold" />
        </form>
        <form name="admin_login" action="admin_login.jsp" method="POST">
            <br> <input type="submit" value="BACK" name="admin_login_go_back" style="font-weight: bold"/>
        </form></td></tr>
           </table>
    </body>
</html>