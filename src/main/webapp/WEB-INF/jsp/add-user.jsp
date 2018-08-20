<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
	<h1>Add user:</h1>
	<form:form method="post" modelAttribute="user">
		<form:hidden path="id"/>
		
		<fieldset class="form-group row">
			<form:label path="username">Username</form:label>
			<form:input path="username" type="text" class="form-control" required="required"/> 
			<form:errors path="username" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="form-group row">
			<form:label path="password">Password</form:label>
			<form:input path="password" type="password" class="form-control" required="required"/> 
			<form:errors path="password" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="form-group row">
			<form:label path="firstName">First name</form:label>
			<form:input path="firstName" type="text" class="form-control" required="required"/> 
			<form:errors path="firstName" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="form-group row">
			<form:label path="lastName">Last name</form:label>
			<form:input path="lastName" type="text" class="form-control" required="required"/> 
			<form:errors path="lastName" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="form-group row">
			<form:label path="role">Role</form:label>
			<form:select path="role" class="form-control">
				<form:option value="ROLE_USER">USER</form:option>
				<form:option value="ROLE_ADMIN">ADMIN</form:option>
			</form:select>
			<form:errors path="role" cssClass="text-warning"/>
		</fieldset>
		<button type="submit" class="btn btn-success">Add</button>
	</form:form>
</div>

<%@ include file="common/footer.jspf" %>