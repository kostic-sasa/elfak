<%@page import="utils.Utils"%>
<%@ page import="servlets.model.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% Model model = Model.getInstance(); %>	

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="icon" href="images/favicon.png">
	<title>Tweet Senser</title>
	
	<!-- JS imports -->
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
	
	<!-- JS files -->
	<script src="js/util.js"></script>
		
</head>

<body bgcolor="#f0f2f5">
	<a href="http://localhost:8080/TweetSenser/">
		<img alt="Tweet Senser Logo" src="images/logo.png" width="300px" vspace="20px">
	</a>
	
<%-- 	<% System.out.println(model); %> --%>
	
	<form action="SenserServlet" method="get">
		Search terms:
		<br/>
		<input type="text" name="terms" size="150px" value="Lady Gaga"/>
		<br/>
		from <input type="date" name="dateFrom" id="datePickerFrom" value=<%=model.getDateFrom() %> />&ensp;
<%-- 		to <input type="date" name="dateTo" id="datePickerTo" value=<%=model.getDateTo()%> />&ensp; --%>
		<input type="submit" value="Collect Tweets">
	</form>
	
	<br/>
	<%= (model.getTweetData().getTweetTexts().size() == 0) ? "" : model.getTweetData().getTweetTexts().size() %> Tweets found:
	<br/>
	<select id="tweets_list" size="8" style="width: 1000px">
		<% 	for (String tweetText : model.getTweetData().getTweetTexts()) { %>
			    <option><%=tweetText%></option>
		<% } %>
	</select>
	
	<br/><br/>
	Selected Tweet:
	<br/>
	<textarea disabled id="selected_tweet" rows="3" style="width: 1000px"></textarea>
	
	<form action="NlpServlet" method="get">
		<input type="hidden" id="tweet_text" name="tweet_text" value="" size="150px"/>
		<input type="submit" value="Analyse Tweet"/>
	</form>
	
	<br/>
	<%
		if(!Utils.isNullOrEmpty(model.getTweetText(), model.getSentimentType())) { 
			out.append("Analysed Tweet: <br/> <textarea disabled id='analysed_tweet' rows='3' style='width: 1000px'>" + model.getTweetText() + "</textarea>");
			out.append("<br/><b> Result: " + model.getSentimentType() + "</b>");
		}
	%>
	
	<br/><br/>
	Result bubble chart: <br/>
	<div style="width: 1000px">
		<canvas id="bubble-chart"></canvas>
	</div>
	
	<br/><br/>
	Result bar chart: <br/>
	<div style="width: 1000px">
		<canvas id="bar-chart"></canvas>
	</div>
	
	<script src="js/bubble-chart.js"></script>
	<script src="js/bar-chart.js"></script>
</body>
</html>