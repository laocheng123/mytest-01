<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试数据</title>

</head>
<body>

    <a href="${pageContext.request.contextPath}/item/insertTbitem">增加一条商品数据，用TbItem来接收</a></br>
    <a href="${pageContext.request.contextPath}/item/insertMap">增加一条商品数据，用map来接收</a></br>


    <a href="${pageContext.request.contextPath}/item/deleteById">删除一条数据(基本数据类型接收)</a></br>
    <a href="${pageContext.request.contextPath}/item/deleteByIdMap">删除一条数据（map）</a></br>


    <a href="${pageContext.request.contextPath}/item/updateTbItem">更新一条数据（tbItem接收）</a></br>
    <a href="${pageContext.request.contextPath}/item/updateMap">更新一条数据（用map来接收）</a></br>


    <a href="${pageContext.request.contextPath}/item/getItemByIdList">查询所有商品并分页（用list响应给前端页面）</a></br>
    <a href="${pageContext.request.contextPath}/item/getItemByIdListMap">查询所有商品并分页（用map响应给前端页面）</a></br>


    <a href="${pageContext.request.contextPath}/item/getByIdTbItem">查询一条商品记录（用tbItem接收）</a></br>
    <a href="${pageContext.request.contextPath}/item/getByIdMap">查询一条商品记录（用map来接收前端传递过来的参数）</a></br>

</body>
</html>