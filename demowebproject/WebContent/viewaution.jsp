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
AutionDao pd=new AutionDao();
List<Aution> li=pd.getAllAutions();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Country</th>
<th></th>
</tr>
<%
for(Aution a:li){
%>
<tr>
<td><%=a.getAutionid() %></td>
<td><%=a.getPlayerid() %></td>
<td><%=a.getTeamid() %></td>
<td><a href="editplayer.jsp?id=<%=a.getAutionid()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>