$(document).ready(function() {
    $("#tweets_list").change(function () {
        var str = "";
        $("select option:selected").each(function () {
            str += $(this).text() + " ";
            });
        $("#selected_tweet").text(str);
        $("#tweet_text").val(str);
        }).change();
});

//window.onload = function() {
//$(document).ready(function() {
//	var dateFrom = <%= model.getFromDate() %>;
//	var dateTo = <%= model.getToDate() %>;
//
//	if (dateFrom && dateTo && dateFrom != "null" && dateTo != "null") {
//		document.getElementById('datePickerFrom').value = dateFrom;
//		document.getElementById('datePickerTo').value = dateTo;			
//	} else {
//		var date = new Date();
//		document.getElementById('datePickerFrom').value = date.getFullYear() + "-" + (date.getMonth()+1) + "-" + date.getDate();
//		document.getElementById('datePickerTo').value = new Date();		
//	}
//});

function processDate() {
	var dateFrom = document.getElementById('datePickerFrom').value;
	var dateTo = document.getElementById('datePickerTo').value;
	if (dateFrom && dateTo) {
		location.href = "/BreakingSportsWeb/statistics/backend_stats.html?dateFrom=" + dateFrom + "&dateTo=" + dateTo;
	} else {
		alert('Please choose both dates!')
	}
}
