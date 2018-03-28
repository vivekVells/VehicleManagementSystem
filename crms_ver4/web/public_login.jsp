<%-- 
    Document   : public_login
    Created on : Jan 12, 2015, 2:21:05 PM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PUBLIC LOGIN PAGE</title>
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
        <br></td></tr>
<tr>   <td>    <br>
        <form action="d" style="text-align: left"> 
        </form>
        <%Cookie[] cookies=request.getCookies();
          String name;
           
        if(cookies!=null)
        {
            for(int j=0;j<cookies.length;j++)
            {
           if(cookies[j].getName().equals("name")){
               name=cookies[j].getValue();
           }}}
       
            
%>        <form name="login_page_public" action="logout_servlet1" method="POST">
            <a href="login_page.jsp">LOG OUT</a>
           
        </form>
        <table style="alignment-adjust: middle">
           
            <tr>
            <br><a href="public_fine_pay.jsp">FINE PAYMENT</a><br>
            <br><a href="public_license_renewal.jsp">LICENSE RENEWAL</a><br>
            <br><a href="public_feedback.jsp">FEEDBACK</a><br>
            <br><a href="complaint_registration.jsp">COMPLAINT REGISTER</a>
            
           <!-- <br><a href="public_complaint_registration.jsp">COMPLAINT REGISTRATION</a><br>
       --> </tr>
            
        </table>
        
    </body>
</html>
