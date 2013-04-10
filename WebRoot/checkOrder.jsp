<%@ page language="java" import="java.util.*" import="po.Order" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>ALL ORDER INFORMATION</title>
    <jsp:include page="/script.jsp" />
  </head>
  
  <body>
  <div id="northpanel">
		<jsp:include page="/main.jsp" flush="true"></jsp:include>
		</div>
		<div id="centerpanel">
    <div align="center"><font face="微软雅黑" size="5">ALL ORDER INFORMATION</font></div>
    <br><br>
     <table align="center" width="1000" bgColor="#FFFFFF">
     <tr>
     <td align="center" valign="middle" width="100">TRANSACTIONID</td>
     <td align="center" valign="middle" width="100">PLACEONDATE</td>
     <td align="center" valign="middle" width="100">BOOKSKU</td>
     <td align="center" valign="middle" width="100">QUANTITY</td>
     <td align="center" valign="middle" width="100">AMOUNT</td>
     <td align="center" valign="middle" width="100">STATUS</td>
     </tr>
     <logic:iterate id="order" name="pc" property="smallList">
     <tr>
     <td align="center" valign="middle" width="100"><bean:write name="order" property="transactionId"/> </td>
     <td align="center" valign="middle" width="100"><bean:write name="order" property="placeOnDate"/> </td>
     <td align="center" valign="middle" width="100"><bean:write name="order" property="sku"/> </td>
     <td align="center" valign="middle" width="100"><bean:write name="order" property="quantity"/> </td>
     <td align="center" valign="middle" width="100"><bean:write name="order" property="amount"/> </td>
     <td align="center" valign="middle" width="100"><bean:write name="order" property="status"/> </td>
     <td align="center" valign="middle" width="100"><html:link action="/checkDetails.do" paramId="id" paramName="order" paramProperty="id">order details</html:link></td>
     </tr>
     </logic:iterate>
     </table>
     <div align="center">
      <html:link action="checkOrder.do?PageIndex=1">start</html:link>
     <logic:equal name="pc" property="firstPage" value="false">
     <html:link action="checkOrder.do"paramId="PageIndex" paramName="pc" paramProperty="previousPageIndex">previous</html:link>
     </logic:equal>
     <logic:equal name="pc" property="lastPage" value="false">
     <html:link action="checkOrder.do"paramId="PageIndex" paramName="pc" paramProperty="nextPageIndex">next</html:link>
     </logic:equal>
     <html:link action="checkOrder.do"paramId="PageIndex" paramName="pc" paramProperty="pageCount">end</html:link>
     <br><br><br>
     <font style="color: rgb(255, 0, 0);" size="5">
		<logic:equal name="success" value="1">
		delete operation successful
		</logic:equal>
		</font>
     </div>
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
	 </div>
  </body>
   

</html>
