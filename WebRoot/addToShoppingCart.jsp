<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for AddToShoppingCartForm form</title>
	</head>
	<body>
		<html:form action="/addToShoppingCart">
		<table>
		<tr>
		<td>ISBN:</td>
		<td><bean:write name="searchBook" property="isbn"/></td>
		</tr>
		<tr>
		<td>Book title:</td>
		<td><bean:write name="searchBook" property="booktitle"/></td>
		</tr>
		<tr>
		<td>Price:</td>
		<td><bean:write name="searchBook" property="unitprice"/></td>
		</tr>
		<tr>
		<td>Stock:</td>
		<td><bean:write name="searchBook" property="stockquantity"/></td>
		</tr>
		<tr>
		<td>Quantity:</td>
		<td><html:text property="quantity"></html:text></td>
		</tr>
		</table>
	    <html:submit value="Add to Cart"/>
		</html:form>
	</body>
</html>

