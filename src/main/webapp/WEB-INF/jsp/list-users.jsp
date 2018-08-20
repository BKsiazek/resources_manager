<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<div align="right">
		    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
		        <a class="btn btn-primary" href="/add-user">Add new user</a>
		    </c:if>
		</div>
		<table class="table table-striped">
			<caption>Users:</caption>
			<thead>
				<tr>
					<th>Username</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Role</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.username}</td>
						<td>${user.firstName}</td>
						<td>${user.lastName}<!--<fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/>--></td>
						<td>${user.role}</td>
						<!--<td><a type="button" class="btn btn-success"
							href="/update-todo?id=${todo.id}">Update</a></td>-->
						<td><a type="button" class="btn btn-warning"
							href="/delete-user?id=${user.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<!-- <a class="button" href="/add-todo">Add a Todo</a> -->
		</div>
	</div>
<%@ include file="common/footer.jspf" %>