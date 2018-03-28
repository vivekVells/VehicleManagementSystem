<%-- 
    Document   : admin_login
    Created on : Jan 12, 2015, 5:04:28 PM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMINSTRATOR PAGE</title>
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
        <br><br></td></tr>
<tr>   <td> <form name="login_page_public" action="login_page.jsp" method="POST">
            <input type="submit"  style="text-align: match-parent" value="LOG OUT" name="log_out_public" /></form></td></tr>
 <tr><td><br>
            <a href="admin_vehicle_details_view.jsp">VEHICLE OWNER DETAILS</a><br>
            <br><a href="admin_fine_details_view.jsp">FINE PAYMENT DETAILS</a><br>
            <br><a href="admin_license_details_view.jsp">LICENSE RENEWAL DETAILS</a><br>
            <br><a href="admin_feedback_details_view.jsp">FEEDBACK DETAILS</a><br>
            <br><a href="admin_fine_entry_view.jsp">FINE ENTRY</a><br>
            <br><a href="admin_complaint_details_view.jsp">COMPLAINTS DETAILS</a>
           
           <!-- <br><a href="public_complaint_registration.jsp">COMPLAINT REGISTRATION</a><br>
           --> <td></tr>
            
</table>
        
    </body>
</html>

