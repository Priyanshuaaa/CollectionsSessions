package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {
//Array list is a dynamic array,size is not fixed.
//Arrays are static,size is fixed,to resolve this problem we used dynamic array,i.e Array List.
	
public static void main(String[] args) {
	
	//int i[]=new int[4];//Static array,size is fixed.
	//Dynamic Array----Array List
	//Dynamic array will have duplicate values.--1st Property.
	//Dynamic array is synchronized--aray list is slow.
	//Dynamic array maintains insertion order.
	//It allows random access to fetch any element because it stores the values on the basis of indexes.
	//Retrieving the values is very easy.
	//If you are not giving data type of an array list,it will be treated as "Non-Generics"
	ArrayList ar=new ArrayList();
	//ar.set(6,"TRACKER");
	ar.add(10);//0
	ar.add(10);//1
	ar.add(20);//2
	ar.add(30);//3
	ar.add("Priyanshu");//4
	ar.add('A');//4
	ar.add(true);//5
	//We can store all sort of data type values into an array list. 


	System.out.println(ar);
	System.out.println("Size of the dynamic Array is:"+ar.size());//use to determine the size of an array,add(),addall(),remove() and size() methods are defined in Collection Interface.
	//to get the value from an index
	
	//To print all the values from an array list,we will always use for loop because it stores the values in the form of an index.
	//or we can use iterator as well--will discuss it later.
	
	for(int i=0;i<ar.size();i++)
	{
		System.out.println(ar.get(i));
	}
	
	//Non-Generics vs Generics
	//Use Generics=Define the data type of an Array.
	ArrayList<Integer> ar1=new ArrayList<Integer>();
    ar1.add(100);
    ar1.add(120);
    ar1.add(1,200);
    ar1.set(2,250);
	for(int i=0;i<ar1.size();i++)
	{
		System.out.println(ar1.get(i));
	}
    //ar1.add("Priyanshu");--This is not allowed.
    //ArrayList<String> ar2=new ArrayList<String>();
    //ArrayList<Charset> ar3=new ArrayList<Charset>();

	ArrayList ar2=new ArrayList();//If you are not sure whcih data type you are getting.
	
	Employee E1=new Employee("Priyanshu","QA",31);
	Employee E2=new Employee("TOM","Admin",32);
	Employee E3=new Employee("DEPT","HR",33);
	
	//You can store any object into array list,here employee is the user defined class object and we are storing into array list.
	ArrayList<Employee> empar=new ArrayList<Employee>();
	empar.add(E1);
	empar.add(E2);
	empar.add(E3);
	//using iterator to iterate to the values(just like for loop)---for loop wors over with theindex,here every element is point to an object in Employee Class
	//Iterator is use to traverse the values
	Iterator<Employee> itr=empar.iterator();//empar.iterator() method will return the 
	while(itr.hasNext())
	{
		Employee emp=itr.next();
		System.out.println("Employee name is "+emp.empname);
		System.out.println("Employee age is "+emp.age);
		System.out.println("Employee department is "+emp.dept);	
	}

	//Add All Method Usage---to merge the array list.
	
    ArrayList<String> ar3=new ArrayList<String>();
    ar3.add("Selenium");
    ar3.add("QTP");
   
    
    ArrayList<String> ar4=new ArrayList<String>();
    ar4.add("RFT");
    ar4.add("SOAPUI");
    
    ar3.addAll(ar4);
    
    for(int i=0;i<ar3.size();i++)
  	{
  		System.out.println(ar3.get(i));
  	}
    
	//Remove All Method Usage---to merge the array list.

    ar3.removeAll(ar4);
    for(int i=0;i<ar3.size();i++)
  	{
  		System.out.println(ar3.get(i));
  	}
    
    
    //Retain All
    System.out.println("Retain All Method Usage");
    ArrayList<String> ar5=new ArrayList<String>();
    ar5.add("Selenium");
    ar5.add("QTP");
   
    
    ArrayList<String> ar6=new ArrayList<String>();
    ar6.add("Selenium");
    ar6.add("SOAPUI");
    ar5.retainAll(ar6);
    for(int i=0;i<ar5.size();i++)
  	{
  		System.out.println(ar5.get(i));
  	}
    
    List<Integer> ar7=new ArrayList<Integer>();
    ar7.add(100);
    ar7.add(120);
    ar7.add(1,200);
    ar7.set(2,250);
    ar7.add(1000);
	for(int i=0;i<ar7.size();i++)
	{
		System.out.println(ar7.get(i));
	}
        

}

	
}
