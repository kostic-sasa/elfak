

var ctx = document.getElementById("bar-chart");

var myChart = new Chart(ctx,
		{
			type : 'bar',
			data : {
				labels : [ "Label1", "Label2", "Label3", "Label4",
						"Label5" ],
				datasets : [ {
					label : "Data (level)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				legend : {
					display : false
				},
				title : {
					display : true,
					text : 'Description text'
				}
			}
		});