<%@page import="db.WiFiDB"%>
<%@page import="db.WiFi"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WiFi List Import</title>
</head>
<body>
	<%
	WiFiDB wifidb = new WiFiDB();

	String result[] = new String[2];

	// 데이터 베이스 추가
	for (int i = 1; i <= 14493; i += 1000) {
		String startIndex = Integer.toString(i);
		String endIndex;
		if (i != 14001) {
			endIndex = Integer.toString(i + 999);
		} else {
			endIndex = result[0];
		}
		
		result = wifidb.dbInsert(startIndex, endIndex);
		if (i == 1) {
			out.write(result[0] + "개의 WiFi 정보를 정상적으로 저장하였습니다." + "<br>");			
		}
	}
	%>
	
	<a href="WiFiHome.jsp"> 홈으로 가기 </a>
	
</body>
</html>