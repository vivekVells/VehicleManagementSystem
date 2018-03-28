<%-- 
    Document   : admin_fine_entry_view
    Created on : Jan 20, 2015, 2:40:44 PM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FINE VIEW PAGE</title>
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
     
        <%
            boolean isset = (request.getParameter("error") == null);
        %>
        <tr><td>
        <h1 style="text-align: center;color: black">    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ADMIN QUERY PAGE</h1>
        <h2 style="text-align: center;color: black">    &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STATE VEHICLE RECORDS BUREAU</h2>
  <h3 style="text-align: center;color: black"> &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;   &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FINE ENTRY PAGE</h3>

        <br><br></td></tr>
        <tr><td>
        <form action="vehicle_details_alone" method="POST">
            <b>To View Candidates<input type="submit" value="CLICK HERE" /></b>
        </form></td></tr>
        <tr><td>       <form action="fine_entry" method="POST">
      
                    <tr><td><br>REG ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="regid" value="" /></td>
                    </tr>
                    <tr><td><br>FINE AMOUNT&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="fine_amount" value="" /><br></td>
                    </tr>
                    <tr><td><br>REASON &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="reason" value="" /><br></td>
                    </tr>
                    <tr><td><br>REFERENCE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="reference" value="" /><br></td>
                    </tr>
                    <tr><td><br>LOCATION &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="location" value="" /><br></td>
                    </tr>
                    <tr><td><br><input type="submit" value="SUBMIT" /></td>
                    </tr>
       
            

                <tr><td>     
                        
                            <br><br><center> <a href="admin_login.jsp">BACK</a> 
            </center>
                    </td></tr>        
       <%
           if (!isset) {
                  out.println("<font color='blue'>Please Enter The License Id Correctly! It Already Exists</fond>");
                               }
           %>
           </table>
    </body>
</html>
