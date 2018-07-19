<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生信息列表</title>
<style type="text/css">
<!--
body {
	margin-left: 3px;
	margin-top: 0px;
	margin-right: 3px;
	margin-bottom: 0px;
}
.STYLE1 {
	color: #e1e2e3;
	font-size: 12px;
}
.setting_ {
	color: #000000;
	font-size: 12px;
	font-weight: bold;
}
.STYLE6 {color: #000000; font-size: 12; }
.STYLE10 {color: #000000; font-size: 12px; }
.STYLE19 {
	color: #344b50;
	font-size: 12px;
}
.STYLE21 {
	font-size: 12px;
	color: #3b6375;
}
.STYLE22 {
	font-size: 12px;
	color: #295568;
}
-->
</style>
<script>
var  highlightcolor='#d5f4fe';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
<script type="text/javascript">
	function check(){
	
	if(form.stu_name.value=="" || form.stu_name.value==null){
	alert("学生姓名不能为空");
	form.username.focus();
	}
}
	function atSumbit_query(){
		form_.submit();
	}
	
	
</script>
</head>

<body>

<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="40">
    <form name="form" action="/StuInfoList" method="get" onsubmit="return check()">
	    <table width="100%" border="0" cellspacing="0" cellpadding="0">
	      <tr>
	        <td height="30" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	          <tr>
	            <td width="40%"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	              <tr>
	                <td width="6%" height="19" valign="bottom"><div align="center"><img src="<%=path%>/indexpage/images/tb.gif" width="14" height="14" /></div></td>
	                <td width="94%" valign="bottom"><span class="STYLE1"> 学生信息列表</span></td>
	              </tr>
	            </table></td>
	            
	             <td class="STYLE1">学生名称：<input type="text" name="stu_name" placeholder="请输入学生姓名"/>
	             	<!-- <img src="<%= path %>/images/search.gif" style="cursor:hand" border="0" onclick="atSumbit_query()"> -->
					<input type="submit" name="submit" value="查 询">
	             </td>
	            </form>
	              <form action="/StuInfoList" method="post">
	              <td>
	             	<input class="setting_" type="submit" name="submit" value="查询全部学生信息"/>
	             </td>
	             </form>
	             <td>
	             	<a href ="index.jsp"><input type ="button" name ="setting_" value="返回"/></a>
	          </tr>
	        </table></td>
	      </tr>
	    </table>
    </td>
  </tr>
  <tr>
    <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
      <tr>
      	<td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">序号</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">姓名</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">性别</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">学号</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">班级</span></div></td>
        </tr>
       
        <c:forEach  items="${studentAll}" var="student" >
       <tr>
      	<td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">${student.studentId}</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">${student.studentName}</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">${student.studentSex}</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">${student.studentId}</span></div></td>
        <td width="12%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">${student.studentClass}</span></div></td>
        </tr>
       </c:forEach>
    </table></td>
  </tr>
  
</table>
</body>
</html>
