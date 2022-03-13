<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<%@include file="header.jsp"%>
	</br>
	<h2>Hello World!22222</h2>
	</br>
	<%@include file="footer.jsp"%>
	<c:redirect url="/products" />
	<a href="${pageContext.request.contextPath}/products">Products</a>
</body>
</html>
