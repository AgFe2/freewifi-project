<%@page import="db.WiFiDB"%>
<%@page import="db.WiFi"%>
<%@page import="db.Location"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
#WifiDetail {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#WifiDetail td, #WifiDetail th {
	border: 1px solid #ddd;
	padding: 8px;
}

#WifiDetail tr:nth-child(even) {
	background-color: #f2f2f2;
}

#WifiDetail tr:hover {
	background-color: #ddd;
}

#WifiDetail th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<%
	WiFiDB wifidb = new WiFiDB();
	List<String[]> historys = wifidb.dbHistorySelect();
	%>

	<h1>위치 히스토리 목록</h1>

	<a href="WiFiHome.jsp">홈</a> |
	<a href="WiFiHistory.jsp">위치 히스토리 목록</a> |
	<a href="WiFiListImport.jsp">Open API 와이파이 정보 가져오기</a>

	<table id="WifiDetail">
		<thead>
			<tr>
				<th>ID</th>
				<th>X좌표</th>
				<th>Y좌표</th>
				<th>조회일자</th>
				<th>비고</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (String[] history : historys) {
			%>
			<tr>
				<td><%=history[0]%></td>
				<td><%=history[1]%></td>
				<td><%=history[2]%></td>
				<td><%=history[3]%></td>
				<td><input type="button" value="삭제"></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>


