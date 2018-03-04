<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "SrchStu" method = "POST">
   Student ID: <input type = "text" name = "snm" />
   <input type="submit" value="SUBMIT"/>
</form>


<c:choose>
<c:when test="${retStuObjReq != null}">
	<c:forEach items="${retStuObjReq}" var="element">
    ID: ${element.getsId()}<br/>
    NAME: ${element.getsNm()}<br/>
	</c:forEach>
</c:when>
<c:otherwise>
	<c:out value="${appMsg}"></c:out>
</c:otherwise>
</c:choose>

</body>
</html>