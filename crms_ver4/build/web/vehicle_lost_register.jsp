<%-- 
    Document   : vehicle_lost_register
    Created on : Jan 23, 2015, 10:59:35 AM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VEHICLE LOST REGISTRATION PAGE</title>
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
        <h3 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;COMPLAINT REGISTRATION PAGE</h3>
        <h3 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VEHICLE LOST COMPLAINT REGISTER PAGE</h3>

        </td></tr>
        <form action="vehicle_lost_servlet" method="POST" style="text-align: center">
                
                    <tr>
                        <td><br>VEHICLE NUMBER&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    <input type="text" name="vehicle_number" placeholder="TN XXXX" value="" /></td>
                    </tr>
                    <tr><td><br>TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="type">
                                <option>TWO WHEELER</option>
                                <option>FOUR WHEELER</option>
                            </select></td>
                    </tr>
                    <tr>
                      <td><br>DATE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="text   " name="datelost"> &nbsp;(dd-mm-yyyy)</font>
                     </td></tr>
                    <tr><td><br>CONTACT NUMBER &nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="contact" value="" /></td>
                    </tr>
                    <tr><td><br><input type="submit" value="REGISTER" /></td>
                    </tr>

        </form>
       <form name="public_vehicle_registration" style="text-align: center" action="complaint_registration.jsp" method="POST">
        <table style="text-align: center" >
            <center>   <tr><td style="text-align: center"> <br><br><input type="submit" value="BACK" name="fine_pay" /></td></tr>
        </table>
        </form>
        </table>
    </body>
</html>
