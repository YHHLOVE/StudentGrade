<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<html>
<head>
 <style>
.input{width:125px;height:30px;font-size:18px; line-height:30px;background:url("images/yanzhengma.jpg");font-color:'#99999'}
</style>
  <title>login.jsp</title>
  <script language="javascript" type="text/javascript">  
function createCode()
    {
     var seed = new Array(
     'abcdefghijklmnopqrstuvwxyz',
     'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
     '0123456789'
     ); 
     var idx,i;
     var result = ''; 
     for (i=0; i<4; i++) 
     {
    	 idx = Math.floor(Math.random()*3); //获得随机数据的整数部分-获取一个随机整数
    	 result +=seed[idx].substr(Math.floor(Math.random()*(seed[idx].length)), 1);//根据随机数获取数据中一个值
    	 }
    	 return result; //返回随机结果
    }
function check(){
	
	
	if(form.Id.value=="" || form.Id.value==null){
	alert("工号不能为空");
	form.username.focus();
	
	}
	if(form.passWord.value=="" || form.passWord.value==null){
	alert("密码不能为空");
	form.password.focus();
	
	}
}
    </script>     
</head>
<body>
<body background = "/images/loginimage.jpg">

    <div align = "center">
    
	<font size="10" face="arial" color="black">学生成绩管理系统</font><br><br><br><br>
	<form name="form" action="/LoginServlet" method="get" onsubmit="return check()">
	     <table>     
	     <tr>
               <td> <font size="10" color=#5C3317>工&nbsp;号：</font></td>
                        
               <td><input  type="text" style="width:200px; height:40px;" placeholder="请输入工号" name="Id"></td>
         </tr> 
         
         <tr>
                <td> <font size="10" color=#5C3317>密&nbsp;码：</font></td>
                <td><input  type="password" style="width:200px; height:40px;" placeholder="请输入密码" name="passWord"></td>
         </tr>
         <tr>
            <td> <font size="10" color=#5C3317>类&nbsp;型：</font></td>
            <td><select name="select" style="width:200px; height:40px;">
            	<option value="Student" >学生</option>
            	<option value="Admin">管理员</option>	
            </select></td>
         </tr>
  	
  	 
	<tr>
           <td> <font size="10" color=#5C3317>验证码：</font></td>
                        
           <td><input type="text" style="width:200px; height:40px;" placeholder="请输入验证码" name="inputRandom"></td>
                        
           <td><input name="random" class = "input" style="width:60px; height:40px;" value="" readonly="readonly" ></td>
	       <td><INPUT TYPE="button" style="width:100px; height:40px;" VALUE="获取验证码" ONCLICK="random.value=createCode()"></td>
    </tr>
    </table>
	<br>
	<input type="image" src="/images/timg (2).jpg" alt="Submit" style="width:250px; height:80px;" /> 
     </form>
	 </div>


   
</body>
</html>