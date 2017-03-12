<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table class="table table-bordered table-hover table-striped">
  <thead>
    <tr>
      <td>User Names</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <c:forEach items="${users}" var="user">
        <td>${user.name}</td>
      </c:forEach>
    </tr>
  </tbody>
</table>