package MapInterfac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap <Integer,String>HM = new HashMap<Integer, String>();
		
		HashMap HM1 = new HashMap();
		
		HM.put(102, "David");     //pair -- key=value
		HM.put(105, "Rhit");
		HM.put(103, "John");
		HM.put(107, "Rahul");
		HM.put(104, "Rani");
		HM.put(103, "Patil");
		HM.put(106, "Rhit");
		
		System.out.println(HM);
		
		//insertion order is not preserved  duplicate keys are not allowed
		//duplicate values are allowed
		
		
		System.out.println(HM.get(102));   //retrives value at specified key
		
		System.out.println(HM.containsKey(103));   //returns true if specified key is present
		System.out.println(HM.containsKey(109));
		
		System.out.println(HM.containsValue("David"));   //returns true if specified value is present in hashmap
		System.out.println(HM.containsValue("Ketan"));
		
		System.out.println(HM.isEmpty());  //returns true if hashmap is empty
		System.out.println(HM1.isEmpty());
		
		System.out.println(HM.keySet());   //returns set of keys present
		System.out.println(HM.values());    //returns all values 
		
		
		//reading the elements
		for (Object obj : HM.keySet()) {
			System.out.println(obj);
		}
		for(Object obj: HM.values()) {
			System.out.println(obj);
		}

		//102 = David  to print in pair
		for (Object obj1 : HM.keySet()) {
			System.out.println(obj1+" "+HM.get(obj1));
		}
		
		System.out.println("*********");
		//Entry method
		
		for(Map.Entry entry : HM.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		 //iterator
		
		System.out.println("***********");
		
		Set s = HM.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		
		
		
		
	}

}
