
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeItem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] item_list = new String[5];
		item_list[0] = "TV";
		item_list[1] = "Laptop";
		item_list[2] = "Speakers";
		item_list[3] = "Telephone";
		item_list[4] = "Mobile Phone";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("TV", "32 inch color screen with internet enabled");
		map.put("Laptop", "Dell Innspiron 7000 latest series with 4GB NVIDI GTX960");
		map.put("Speakers", "AudioBeats with high volume woofers");
		map.put("Telephone", "Two SIMS phone with 15 km wireless range");
		map.put("MobilePhone", "LUMIA 520 with dual SIM touch");
		
		
		
		
		System.out.println("Printing List of Items...");
		for(int i=0;i<item_list.length;i++){
			System.out.println((i+1)+"  "+item_list[i]);
			
		}
		
		System.out.println();
		System.out.println("Enter your choice from the above (1,2,3,4,5): ");
		int n = input.nextInt();
		String item = null;
		switch(n){
			
		case 1:
			item = "TV";
			break;
		case 2:
			item = "Laptop";
			break;
		case 3:
			item = "Speakers";
			break;
		case 4:
			item = "Telephone";
			break;
		case 5:
			item = "MobilePhone";
			break;
		default:
			System.out.println("Invalid choice");
				
		
		}
		
		if(item!=null){
			
			System.out.println(map.get(item));
		}
		
		
		
		

	}

}
