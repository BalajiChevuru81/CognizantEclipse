package map;
import java.util.*;

public class MapEmp { 
   public static void main(String args[]) {  
	   
	   HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
	   HashMap map=new HashMap<Integer,String>();  
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");            
	      map.put(100,"Anil");    
	      map.put(101,"Uday");    
	      map.put(102,"Raju");
	      map.put(103, "Gaurav");  
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
    System.out.println("Initial list of elements: "+map);      
    map.remove(100);  
    System.out.println("Updated list of elements: "+map);  
    map.remove(101);  
    System.out.println("Updated list of elements: "+map);  
    map.remove(102, "Rahul");  
    System.out.println("Updated list of elements: "+map);  
    
   }      
}  
	   