
import java.util.*;

public class GernericExample {

	public static void main(String args[]) {

		//List list = new ArrayList(); Object타입을 받으므로 예외의 가능성 존재 
		List<Integer> list = new ArrayList<Integer>(); 
		// Integer객체만 받는 List 로 선언합니다. 
		//list.add("1"); // String Error 
		//list.add("a"); // String Error 
		list.add(1);
		list.add(20);
		
		for(Integer o : list) {
			System.out.println(o); 
		}
		
		Map<String, Integer> pointMap = new HashMap<String, Integer>(); 
		pointMap.put("name", 1);
		
		List<Map<String, Integer>> dataList 
				= new ArrayList<Map<String, Integer>>(); 
 	
		
		
	}
	
}







