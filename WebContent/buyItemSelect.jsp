<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolber" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>BuyItemSelect画面</title>

<style type="text/css">
/*========TAG LAYOUT========*/
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}
/*========ID LAYOUT========*/
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

#main {
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	width: 100%;
	position: fixed;
	bottom: 0;
	height: 30px;
	background-color: black;
	clear: both;
	height: 30px;
	height: 30px;
}

#text-right {
	display: inline-block;
	text-align: right;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemSelect</p>
		</div>
		<h3>ご購入される商品にチェックを入れてください。</h3>
		<s:form action="BuyItemSelectAction" theme="simple">
			<table border="1">
				<tr>
					<th>商品名</th>
					<th>値段</th>
					<th>在庫数</th>
					<th>個数</th>
					<th>購入</th>
				</tr>
				<s:iterator value="itemList">
					<tr>
						<td><s:property value="itemName" /></td>
						<td><s:property value="itemPrice" /> <span>円</span></td>
						<td><s:property value="itemStock" /> <span>個</span></td>
						
						<td><select name="count">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
						</select></td>
						<td><input type="checkbox" name="select"></td>
					</tr>
				</s:iterator>
			</table>
			
			<tr>
				<td><span>支払い方法</span></td>
				<td><input type="radio" name="pay" value="1" checked="checked">現金払い
					<input type="radio" name="pay" value="2">クレジットカード</td>
			</tr>
			<br>
			<br>
			<tr>
				<td><s:submit value="購入"/></td>
			</tr>
		
		</s:form>
		<div id="text-right">
			<p>
				Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a>
			</p>
		</div>

	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>


