<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<jsp:include page="common.jsp" />
<body>
	<div class="text-center">
		<h2>사용자 등록</h2>
	</div>
	
	<div class="container p-3">
	<form method="post">
		<table>
			<tr class="form-group">
				<th>사용자ID :</th>
				<td><input class="form-control" type="text" name="userid"></td>
			</tr>
			<tr class="form-group">
				<th>이름 :</th>
				<td><input class="form-control" type="text" name="name"></td>
			</tr>		
			<tr class="form-group">
				<th>성별 :</th>
				<td>
					<div class="form-control">
					<input type="radio" name="gender" value="남">남
					<input type="radio" name="gender" value="여">여
					</div>
				</td>
			</tr>		
			<tr class="form-group">
				<th>주소 :</th>
				<td>
					<select class="form-control" name="city">
						<c:forEach var="city" items="${cities}">
							<option value="${city}">${city}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr class="form-group">
				<td colspan="2">
					<input type="submit" value="등록" class="btn btn-primary">
				</td>
			</tr>		
		</table>
	</form>
	</div>
</body>
</html>