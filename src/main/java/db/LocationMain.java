package db;

public class LocationMain {
	public static void main(String[] args) throws Exception {
		String latitude = "37.57453752202114";
		String longitude = "126.93275787190242";

		Location gps = new Location(latitude, longitude);
		System.out.println(gps.getRegionAddress());
	}
}