<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*,com.ltts.demowebproject.model.*,com.ltts.demowebproject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
List<Player> nli=new ArrayList<Player>();
String name=request.getParameter("teamname");
for(Player p: li){
	if(p.getCountry().equalsIgnoreCase(name)){
		nli.add(p);
	}
}
%>
<h1>Team Name: <%=name %> </h1>
<h2>Players are</h2>
<% for(Player p2:nli) {%>
<%=p2.getPlayerName() %> <br><br>
<%} %>
</body>
</html>