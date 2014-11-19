/**
 * 
 */
var milesToKmReturnArray = function(miles) {
	var DistanceUtilsType = Java.type("com.wall.steve.demo.DistanceUtils");
	var label = new DistanceUtilsType().getLabelInstance();
	return {
		"label" : label,
		"km" : (miles * 1.6)
	}
}

var milesToKmReturnJson = function(miles) {
	var DistanceUtilsType = Java.type("com.wall.steve.demo.DistanceUtils");
	var label = new DistanceUtilsType().getLabelInstance();
	return {
		"label" : label,
		"distances" : {
			"miles" : miles,
			"km" : (miles * 1.6)
		}
	}
}
