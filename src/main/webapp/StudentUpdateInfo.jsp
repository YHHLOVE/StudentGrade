<%@ page language="java" contentType = "text/html ;charset = UTF-8" pageEncoding = "UTF-8" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd

">
 <html>
 <head>
 <title>
 <center><h1>学生信息修改</h1></center>
 </title>
 
 </head>
 <body>
 <body background = "/images/StuAdd.jpg">
 <form action="/UpdateStuIfo" method="get">
 <center>
 <font size="10" face="arial" color="white">学生信息修改</font><br>
 <table>
 <tr>
     <td><font size="10" color=#000000>学&nbsp;号：</font></td>
     <td><input type="text" style="width:200px; height:40px;" placeholder="请输入学号" name = "id"></td>
 </tr>
 <tr>
     <td><font size="10" color=#000000>密&nbsp;码：</font></td>
     <td><input type="text" style="width:200px; height:40px;" placeholder="请输入密码" name = "password"></td>
 </tr>
 <tr>
     <td><font size="10" color=#000000>姓&nbsp;名：</font></td>
     <td><input type="text" style="width:200px; height:40px;" placeholder="请输入姓名" name = "name"></td>
 </tr>
 <tr>
     <td><font size="10" color=#000000>性&nbsp;别：</font></td>
     <td><input type="radio" style="width:30px; height:40px;" name="sex" value="男" checked="checked">
     <font size="10" color=#238E68>男</font>
     <input type="radio" style="width:30px; height:40px;" name="sex" value="女">
     <font size="10" color=#238E68>女</font></td>
 </tr>
 <tr>
     <td><font size="10" color=#000000>班&nbsp;级：</font></td>
     <td><input type="text" style="width:200px; height:40px;"placeholder="请输入班级"  name = "class"></td>
 </tr>

 <tr>
    <td><input type="submit" style="width:200px; height:40px;" name = "提交"></td>
 	<td><input type="reset" style="width:200px; height:40px;" name = "重置"></td>
 	<td><a href ="index.jsp"><input type="button" style="width:200px; height:40px;" value="返回"></a></td>	
 </tr>
 </table>
 </center>
 
 </form>
 </body>
 
 </html>
