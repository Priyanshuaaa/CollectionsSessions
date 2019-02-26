package MapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

import MapConcept.Employee;

public class HashmapConcept {
	public static void main(String[] args) {
	//Hashmap implements Map Interface and extends Abstract Map.
	//It contains only unique elements
	//Stores values on the basis of Key and Value Pairs.
	//It may have only null Key and Multiple NULL values we can store in Hash Map.
	//Hash table is a competitor of Hash Map.
	//It maintains No Order.
	//If you remove a specific key value pair,it will be NULL.
	//Hashmap is non-synchronized--hashmap can be accessible by multiple threads--if updation and insertion are happening on different threads then Fail--Fast Exception will come.
	//Concurrent Modification Exception--matches the fail--Fast Condition.	
	
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"Selenium");
	hm.put(2,"RFT");
	hm.put(3,"QTP");
	hm.put(4,"Test Complete");
	hm.put(5,"JAVA");
	hm.put(null,"STEVE");
	System.out.println(hm);
	String getm=hm.get(3);
	System.out.println(getm);
	

	
//use for loop to get all the values in a hashmap.
//Problem here is it will give you the values of each key not the combination of key and value,should need to use entry set for this purpose. 
	System.out.println(hm.size());
	for(int i=0;i<=hm.size();i++)
	{
		System.out.println("Hash map values are" +hm.get(i));
	}
	
	//Another concept to retrieve the values by using FOR-is loop--use entry set
	for(Entry m: hm.entrySet())
	{
		System.out.println("keys are  "+m.getKey()+ " and values are " +m.getValue());

	}

	hm.remove(3);
	System.out.println(hm);
	hm.put(3,"QTP");
	System.out.println(hm);
	hm.replace(3,"VB");
	System.out.println(hm);
	
	
	
	Employee E1=new Employee("Priyanshu","QA",31);
	Employee E2=new Employee("TOM","Admin",32);
	Employee E3=new Employee("MK","HR",33);
	
	HashMap<String,Employee> hm1=new HashMap<String,Employee>();
    hm1.put("ManagerName=Deepak Pandey",E1);
    hm1.put("Manager Name=Asheesh Barua",E2);
    hm1.put("Manager Name=Rajeev Singh",E3);
    
    for(Entry m: hm1.entrySet())
	{
    	Employee emp=(Employee) m.getValue();
    	
    	System.out.println("keys are  "+m.getKey()+ " and corresponding Employee details are as follows- " +emp.empname +"  "+emp.age + "  "+emp.dept);

	}
    
    Boolean key1=hm1.containsKey("ManagerName=Deepak Pandeyrgf");
    System.out.println(key1);
    
    
    
    
	
	}

}
