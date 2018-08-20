<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
	<h1>Add product:</h1>
	<form:form method="post" modelAttribute="product">
		<form:hidden path="id"/>
		
		<fieldset class="form-group row">
			<form:label path="name">Name</form:label>
			<form:input path="name" type="text" class="form-control" /> 
			<form:errors path="name" cssClass="text-warning"/>
		</fieldset>
		<fieldset class="form-group row">
			<form:label path="description">Description</form:label>
			<form:input path="description" type="text" class="form-control" /> 
			<form:errors path="description" cssClass="text-warning"/>
		</fieldset>
		<fieldset class="form-group row">
			<form:label path="quantity">Quantity</form:label>
			<form:input path="quantity" type="number" min="0" class="form-control" /> 
			<form:errors path="quantity" cssClass="text-warning"/>
		</fieldset>
		<fieldset class="form-group row">
			<form:label path="singleUse">Single Use</form:label>
			<form:select path="singleUse" class="form-control">
				<form:option value="true">Yes</form:option>
				<form:option value="false">No</form:option>
			</form:select> 
			<form:errors path="singleUse" cssClass="text-warning"/>
		</fieldset>
		<button type="submit" class="btn btn-success">Add</button>
	</form:form>
</div>

<%@ include file="common/footer.jspf" %>