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
<title>AmminMain.jsp</title>
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
	function atSumbit_query(){
		form_.submit();
	}
</script>
</head>

<body>

<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="40">
    <form action="" name="form_">
	    <table width="100%" border="0" cellspacing="0" cellpadding="0">
	      <tr>
	        <td height="30" bgcolor="#353c44">
	        <table width="100%" border="0" cellspacing="0" cellpadding="0">
	          <tr>
	            <td width="40%"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	              <tr>
	                <td width="6%" height="19" valign="bottom"><div align="center"><img src="images/tb.gif" width="14" height="14" /></div></td>
	                <td width="94%" valign="bottom"><span class="STYLE1"> 学生信息列表</span></td>
	              </tr>
	            </td>
	          </tr>
	        </table></td>
	      </tr>
	    </table>
    </form>
    </td>
  </tr>
  <tr>
  	
    <td>
    <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#C0C0C0" onmouseover="changeto()"  onmouseout="changeback()">
    <tr>
      <form action="/SCServlet" method="get">
      <tr class="select" width="100%" cellspacing="0" cellpadding="0" bordercolor="#C0C0C0">
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="studentId" placeholder="请输入学生学号"/></span></div></td>
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="studentName" placeholder="请输入学生姓名"/></span></div></td>
        <td width="5%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="studentSex" placeholder="请输入学生性别"/></span></div></td>
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="studentCourse" placeholder="请输入学生班级"/></span></div></td>
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="courseId" placeholder="请输入课程号"/></span></div></td>
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="courseName" placeholder="请输入课程名称"/></span></div></td>
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<input type="text" name="grade" placeholder="请输入成绩"/></span></div></td>
        <td width="12%" height="20" class="STYLE6"><div align="center"><span class="STYLE10">
        	<a href = "Searchall"><input type="submit" name="submit" value="查 询"></a>
        	<a href = "index.jsp"><input type="button"  value="返回首页"/></a>
        		</span></div>
        		</td>
	  </tr>
	  </form>
	  </tr>
      <tr>
      	<td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">学号</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">姓名</span></div></td>
        <td width="5%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">性别</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">班级</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">课程号</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">课程名称</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">课程成绩</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">操作</span></div></td>
      </tr>
       
        <c:forEach  items="${studentAll}" var="sc" >
       <tr>
       
      	<td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.studentId}</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.studentName}</span></div></td>
        <td width="5%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.studentSex}</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.studentClass}</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.courseId}</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.courseName}</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">${sc.grade}</span></div></td>
        <td width="12%" height="20" bgcolor="#C0C0C0" class="STYLE6"><div align="center"><span class="STYLE10">
			<a href="UpdateScore.jsp">修改</a>&nbsp;<a href="DeleteScore.jsp">删除</a></span></div></td>
			</tr>
       </c:forEach>
    </table></td>
  </tr>
  
</table>
</body>
</html>