<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<div align="right">
		    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
		        <a class="btn btn-primary" href="/add-product">Add new product</a>
		    </c:if>
		</div>
		<table class="table table-striped">
			<caption>Products:</caption>
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Quantity</th>
					<th>Single Use</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="product">
					<tr>
						<td>${product.name}</td>
						<td>${product.description}</td>
						<td>${product.quantity}</td>
						<td>${product.singleUse}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
<%@ include file="common/footer.jspf" %>