<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<sf:form method="POST" modelAttribute="user">
		<fieldset>
			<table cellspacing="0">
				<tr>
					<th><label for="user_full_name">Full name</label></th>
					<td><sf:input path="fullName" size="30" id="user_full_name" /><br />
						<sf:errors path="fullName" cssClass="error" /></td>
				</tr>
				<tr>
					<th><label for="user_password">Password:</label></th>
					<td><sf:password path="password" size="30" showPassword="true"
							id="user_password" /> <small>6 characters or more please.</small><br />
						<sf:errors path="password" cssClass="error" /></td>
				</tr>
				<tr>
					<th><label for="user_email">Email Address:</label></th>
					<td><sf:input path="email" size="30" id="user_email" /> <small>In
							case you forget something</small><br />
						<sf:errors path="email" cssClass="error" /></td>
				</tr>
				<tr>
					<th></th>
					<td><input name="commit" type="submit" value="Create" /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
</body>
</html>