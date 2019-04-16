<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css}/bootstrap-superhero-theme.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

<script type="text/javascript"
	src="http://gc.kis.v2.scr.kaspersky-labs.com/F5ABFBA5-1A81-BB4A-B486-57866677F51B/main.js"
	charset="UTF-8"></script>
</head>

<body>

	<div class="wrapper">
		<!-- navigation moved to shared folder -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- page content -->

				<div class="content">
						<c:if test="${userClickHome == true }">
							<%@include file="home.jsp"%>
						</c:if>
			
						<!-- Load only when user clicks about -->
						<c:if test="${userClickAbout == true }">
							<%@include file="about.jsp"%>
						</c:if>
			
						<!-- Load only when user clicks contact -->
						<c:if test="${userClickContact == true }">
							<%@include file="contact.jsp"%>
						</c:if>
						
						<!-- Load only when user clicks all products or category products -->
						<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true }">
							<%@include file="ListProducts.jsp"%>
						</c:if>
				</div>
		<!-- footer comes here -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Jquery -->
		<script src="${js}/jquery.js"></script>
		<!-- bootstrap core javascript -->
		<script src="${js}/bootstrap.js"></script>

		<!-- self coded java script -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
