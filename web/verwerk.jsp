<%-- 
    Document   : verwerk
    Created on : Mar 28, 2013, 10:46:23 AM
    Author     : Sven
--%>



<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <header>
        <title>test</title>
    </header>
    <article>
        <%
        Connection conn=null;
  String url="jdbc:mysql://localhost:3306";
  String dbName ="groep19_festivals";
  String userName="root";
  String password="root";
  try{
      String geb_naam = request.getParameter("geb_naam");
      String pwd = request.getParameter("pwd");
      System.out.println("geb_naam");
      System.out.println("pwd");
      
      conn = DriverManager.getConnection(url+dbName, userName, password);
      Statement stmt = conn.createStatement();
      ResultSet rs= stmt.executeQuery("SELECT gebr_naam,gebr_paswoord from geregistreerdegebruikers WHERE gebr_naam=" + geb_naam + " AND gebr_paswoord = " + pwd);
int count = 0;
      while (rs.next()){
        response.sendRedirect("index.jsp");
    count++;
}  
     
   
     
    
  
    
    
  }catch(Exception e){
      System.out.println("fout");
  }
  
  
  
    %>
   
        
            
 
    </article>
</html>
