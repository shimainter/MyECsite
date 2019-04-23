<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" Content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>管理者ページ</title>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
	margin: 0px auto;
}

#main {
	text-align: center;
	margin: 0 auto;
}
/*========ecsite LAYOUT========*/
#top {
	width: 780px;
	margin: 30px auto;
	border: 1px solid #333;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#text-left {
	border: 1px solid #888;
	width: 200px;
	height: 240px;
	text-align: center;
	display: inline-block;
	margin-right: 15px;
}

#text-right {
	border: 1px solid #888;
	width: 200px;
	height: 240px;
	text-align: center;
	display: inline-block;
	margin-left: 15px;
}

input[type="submit"] {
	margin-top: 25px;
}

#footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: black;
	clear: both;
	width: 100%;
}

#text-center {
	displaty: inline-block;
	text-align: center;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div> 
	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>
		<div id="text-left">
			<p>商品</p>
			<s:form action="ItemCreateAction">
				<input type="submit" value="新規登録" />
			</s:form>
			<p></p>
			<s:form action="ItemListAction">
				<input type="submit" value="一覧" />
			</s:form>
		</div>
		<div id="text-right">
			<p>ユーザー</p>
			<s:form action="UserCreateAction">
				<input type="submit" value="新規登録" />
			</s:form>
			<p></p>
			<s:form action="UserListAction">
				<input type="submit" value="一覧" />
			</s:form>
	
		</div>
			<p>
				Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a>
			</p>
	</div>
		
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>