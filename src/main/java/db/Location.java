package db;

/**
 * GpsToAddress - GPS 위도 경도로 한글 주소로 변환 - google maps API
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Location{
	double latitude;
	double longitude;
	String regionAddress;
	String[] address;

	public Location(String latitude, String longitude) throws Exception {
		this.latitude = Double.parseDouble(latitude);
		this.longitude = Double.parseDouble(longitude);
		this.regionAddress = getRegionAddress(getJSONData(getApiAddress()));
		this.address = regionAddress.split(" ");
	}

	private String getApiAddress() {
		String apiURL = "https://maps.googleapis.com/maps/api/geocode/json?latlng="
				+ latitude + "," + longitude + "&language=ko&key=AIzaSyBG9w5SNWa8OdRYpIMVqDYlWIr_aNEYPLQ";
		return apiURL;
	}

	private String getJSONData(String apiURL) throws Exception {
		String jsonString = new String();
		String buf;
		URL url = new URL(apiURL);
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		while ((buf = br.readLine()) != null) {
			jsonString += buf;
		}
		return jsonString;
	}

	private String getRegionAddress(String jsonString) {
		JSONObject jObj = (JSONObject) JSONValue.parse(jsonString);
		JSONArray jArray = (JSONArray) jObj.get("results");
		jObj = (JSONObject) jArray.get(0);
		return (String) jObj.get("formatted_address");
	}

	public String getRegionAddress() {
		return regionAddress;
	}
	
	public String[] getAddress() {
		return address;
	}
}