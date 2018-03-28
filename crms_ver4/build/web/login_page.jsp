<%-- 
    Document   : login_page
    Created on : Jan 10, 2015, 11:03:46 AM
    Author     : arunkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
    </head>
    <body style="background-color: #fdcba0">
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
     
     <tr>   <td>     <form action="pre_public_login_page.jsp" method="post" style="text-align: center">
            <br>
            <input type="submit" value="PUBLIC LOGIN" /></form></td></tr>
        <tr>  <td><form action="pre_admin_login_page.jsp" method="post" style="text-align: center">
           <br>
            <input type="submit" value="ADMIN LOGIN" />
                </form></td></tr>
        <tr>  <td><form action="index.jsp" method="POST" style="text-align: center">
           <br> <input type="submit" value="HOME" />
                </form></td></tr>
  </table>      
    </body>
</html>
