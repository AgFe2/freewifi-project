package db;

public class WiFiDBMain {
	public static void main(String[] args) {
		WiFiDB wifidb = new WiFiDB();
//		wifidb.dbSelect();
		
		wifidb.dbUpdate("37.5618839742693", "126.96669021575374", "강남구" );
//		wifidb.dbHistoryInsert("37.5618839742693", "126.96669021575374");
//		
//		Double lat1 = 126.96675;
//		Double lnt1 = 37.561924;
//		Double lat2 = 37.58779909420202;
//		Double lnt2 = 126.93093438693383;
//		Double coefficient = Math.cos(lat2) * 6400 * 2 * 3.14 / 360;
//		Double distX = coefficient * Math.abs(lnt1 - lnt2);
//		Double distY = 111 * Math.abs(lat1 - lat2);
//		Double dist = Math.sqrt(distX * distX + distY * distY);
//		String disT = dist.toString();
//		System.out.print(disT);
		
		
//		String result[] = new String[2];		
//		// 데이터 베이스 추가
//		for (int i = 1; i <= 14493; i += 1000) {
//			String startIndex = Integer.toString(i);
//			String endIndex;
//			if (i != 14001) {
//			endIndex = Integer.toString(i + 999);
//			} else {
//				endIndex = result[0];
//			}
//			
//			System.out.println(startIndex + "," + endIndex);
//			result = wifidb.dbInsert(startIndex, endIndex);			
//		}
		
	}
}
