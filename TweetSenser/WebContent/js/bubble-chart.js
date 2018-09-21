// Our labels along the x-axis
var years = [ 1500, 1600, 1700, 1750, 1800, 1850, 1900, 1950, 1999, 2050 ];
// For drawing the lines
var africa = [ 86, 114, 106, 106, 107, 111, 133, 221, 783, 2478 ];
var asia = [ 282, 350, 411, 502, 635, 809, 947, 1402, 3700, 5267 ];
var europe = [ 168, 170, 178, 190, 203, 276, 408, 547, 675, 734 ];
var latinAmerica = [ 40, 20, 10, 16, 24, 38, 74, 167, 508, 784 ];
var northAmerica = [ 6, 3, 2, 2, 7, 26, 82, 172, 312, 433 ];

var ctx = document.getElementById("bubble-chart");

var myChart = new Chart(
		ctx,
		{
			type : 'bubble',
			data : {
				labels : "Sentiment data",
				datasets : [ {
					label : [ $("#analysed_tweet").text() ],
					backgroundColor : "rgba(255,221,50,0.2)",
					borderColor : "rgba(255,221,50,1)",
					data : [ {
						x : 200,
						y : 100,
						r : 15
					} ]
				}, {
					label : [ $("#analysed_tweet").text() ],
					backgroundColor : "rgba(255,221,50,0.2)",
					borderColor : "rgba(255,221,50,1)",
					data : [ {
						x : 100,
						y : 200,
						r : 20
					} ]
				}, {
					label : [ $("#analysed_tweet").text() ],
					backgroundColor : "rgba(0,0,100,0.2)",
					borderColor : "rgba(255,221,50,1)",
					data : [ {
						x : 250,
						y : 150,
						r : 25
					} ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Sentiment visualization from collected tweets'
				},
				legend : {
					display : false
				},
				tooltips : {
					enabled : true
				},
				scales : {
					yAxes : [ {
						scaleLabel : {
							display : true,
							labelString : "← negative     Sentiment     positive →"
						}
					} ],
					xAxes : [ {
						scaleLabel : {
							display : true,
							labelString : "← less     Intensity     more →"
						}
					} ]
				},
				onClick : function(e) {
					var element = this.getElementAtEvent(e);

					// If you click on at least 1 element ...
					if (element.length > 0) {
						// Logs it
						console.log(element[0]);

						// Here we get the data linked to the clicked bubble ...
						var datasetLabel = this.config.data.datasets[element[0]._datasetIndex].label;
						alert(datasetLabel);

						// data gives you `x`, `y` and `r` values
						var data = this.config.data.datasets[element[0]._datasetIndex].data[element[0]._index];
					}
				}
			}
		});