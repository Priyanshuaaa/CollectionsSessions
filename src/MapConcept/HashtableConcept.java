package MapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {
//Hashtable is Synchronised--means threadsafe---you cannot access the same object at the same time.
//Stores the values in the basis of key--Value.
//key-->Object(each object has unique identifier stored in the form of hashcode)-->is having a Hashcode-->Value will be stored in Hashcode
//Each object is having some unique identifier which is a 32 bit code,this unique code is known as hash code.
//Hashcode key,value pairs will always be Unique.
//No NULL Key and Value.
//Generics are also defined.
	public static void main(String[] args) {
		
	Hashtable hsh=new Hashtable();
	hsh.put(1,"TOM");
	hsh.put(2,"MICHEAL");
	hsh.put(3,"STEVE");
	hsh.put(3,"STEVE");
	hsh.put(null,"STEVE");
	System.out.println(hsh);
	
	//Create a clone copy of hashtables.
	Hashtable hsh1=new Hashtable();
	hsh1=(Hashtable)hsh.clone();
	System.out.println(hsh);
	System.out.println(hsh1);
	hsh.clear();
	System.out.println(hsh);
	System.out.println(hsh1);
	System.out.println(hsh.hashCode());
	System.out.println(hsh1.hashCode());
	//How to print all the values by using Enumeration
	Hashtable hsh2=new Hashtable();
	hsh2.put("A","MICHEAL");
	hsh2.put("B","KYLE");
	hsh2.put("C","SHANE");
	Enumeration e=hsh2.elements();
	System.out.println("Print values from hssh2 ");
	
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}

	//get all the values by using entry set.
    Set s=hsh2.entrySet();
    System.out.println(s);
    Hashtable hsh3=new Hashtable();
	hsh3.put("A","MICHEAL");
	hsh3.put("B","KYLE");
	hsh3.put("C","SHANE");
	System.out.println(hsh2.equals(hsh3));
	System.out.println(hsh3.hashCode());
	}

}
