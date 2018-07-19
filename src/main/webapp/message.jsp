<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>操作结果</title>
</head>
<body>
<center>
<%
	String message = (String)request.getAttribute("message");
	if("success".equals(message)){
		out.print("<h1>操作成功!</h1>");
	}else if("nolist".equals(message)){
	    out.print("<h1>还未插入学生课程信息!</h1>");
	}else if("nostu".equals(message)){
		out.print("<h1>没有相关信息！</h1>");
	}else{
		out.print("<h1>操作失败!</h1>");
	}
%>

<!--  <a href="main.jsp">返回主页面</a>-->
<script type="text/javascript"> 
var t=3;
setInterval("refer()",1000); 
function refer(){ 
 if(t==0){ 
 location.href="index.jsp";
 } 
 document.getElementById('show').innerHTML=""+t+"秒后跳转到主页面";
 t--;
} 
</script> 
<span id="show"></span> 
</center>
</body>
</html>