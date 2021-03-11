<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*,com.ltts.demowebproject.model.*,com.ltts.demowebproject.Dao.*"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
TeamDao td=new TeamDao();
List<Team> li=td.getAllTeams();
%>
<table>
<tr>
<th>Team id</th>
<th>Team Name</th>

<th></th>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%=t.getTeamid() %></td>
<td><%=t.getTeamname() %></td>
<td><a href="editplayer.jsp?id=<%=t.getTeamid()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>