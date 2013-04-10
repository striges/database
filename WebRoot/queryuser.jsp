<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 <jsp:directive.page import="po.User"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>All user information</title>
    
	<jsp:include page="/script.jsp" />
  </head>
  
  <body>
  <div id="northpanel">
		<jsp:include page="/employeeMain.jsp" flush="true"></jsp:include>
		</div>
		<div id="centerpanel">
    <div align="center"><font face="微软雅黑" size="5">ALL USER INFORMATION</font></div>
    <br><br>
     <table align="center" width="1000" bgColor="#FFFFFF">
     <tr>
     <td align="center" valign="middle" width="100">ID</td>
     <td align="center" valign="middle" width="200">createTime</td>
     <td align="center" valign="middle" width="100">username</td>
     <td align="center" valign="middle" width="100">Email</td>
     <td align="center" valign="middle" width="100">password</td>
     <td align="center" valign="middle" width="100">passwordsalt</td>
     <td align="center" valign="middle" width="100">defaultBillAddr</td>
     <td align="center" valign="middle" width="100">defaultShipAddr</td>
     </tr>
     <logic:iterate id="user" name="pc" property="smallList">
     <tr>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="ID"/> </td>
     <td align="center" valign="middle" width="200"><bean:write name="user" property="createTime"/></td>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="username"/></td>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="email"/></td>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="password"/></td>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="passwordSalt"/></td>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="defaultbillingAddress"/></td>
     <td align="center" valign="middle" width="100"><bean:write name="user" property="defaultShippingAddress"/></td>
     <td align="center" valign="middle" width="80"><html:link action="/deleteUser.do" paramId="USER" paramName="user" paramProperty="username" onclick="return del()">delete</html:link></td>
     </tr>
     </logic:iterate>
     </table>
     <div align="center">
      <html:link action="queryUser.do?PageIndex=1">start</html:link>
     <logic:equal name="pc" property="firstPage" value="false">
     <html:link action="queryUser.do"paramId="PageIndex" paramName="pc" paramProperty="previousPageIndex">previous</html:link>
     </logic:equal>
     <logic:equal name="pc" property="lastPage" value="false">
     <html:link action="queryUser.do"paramId="PageIndex" paramName="pc" paramProperty="nextPageIndex">next</html:link>
     </logic:equal>
     <html:link action="queryUser.do"paramId="PageIndex" paramName="pc" paramProperty="pageCount">end</html:link>
     <br><br><br>
     <font style="color: rgb(255, 0, 0);" size="5">
		<logic:equal name="success" value="1">
		delete operation successful
		</logic:equal>
		</font>
     </div>
	 </div>
  </body>
   <script language="JavaScript">
       function del()
       {
        if(confirm("confirm?")){
        alert("operate delete")
        return true
        }else{
        return false
        }
        }
     </script>
  </body>
</html>
