<%-- 
    Document   : complaint_registration
    Created on : Jan 23, 2015, 10:50:01 AM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>COMPLAINT REGISTERATION PAGE</title>
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
        <h2 style="text-align: center;color: black">    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PUBLIC QUERY PAGE</h2>
        <h3 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VEHICLE RECORDS BUREAU</h3>
        <h3 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;COMPLAINT REGISTERATION PAGE</h3>

        </td></tr>
             <form action="complaint_servlet" method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <td>
                            <br><br><b>REGISTER YOUR COMPLAINTS HERE</b>
                        </td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <br><br> <a href="vehicle_lost_register.jsp">VEHICLE LOST</a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br><br>  <a href="other_issue.jsp">OTHER ISSUES</a>
                        </td>
                    </tr>
                  
                </tbody>
            </table>

        </form>
        <form name="public_vehicle_registration" action="public_login.jsp" method="POST">
        <table style="text-align: left">
                  <br><br><input type="submit" value="BACK" name="fine_pay" />
            
        </table>
        </form>
        </table>
        
    </body>
</html>
