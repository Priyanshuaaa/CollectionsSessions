package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String[] args) {
	
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("QTP");
	ll.add("Selenium");
	ll.add("RFT");
	System.out.println(ll);
	ll.addFirst("Priyanshu");
	ll.addLast("Automation");
	System.out.println(ll);
	System.out.println(ll.getFirst());
	
	LinkedList<String> lll=new LinkedList<String>();
	lll.add("REGRESSION");
	lll.add("SANITY");
	lll.add("SMOKE");
	lll.add("FUNCTIONAL");
	lll.add("UI");
	lll.add("USABILITY");
	System.out.println(lll);
	ll.addAll(1,lll);
	System.out.println(ll);
	ll.removeFirst();
	System.out.println(ll);
	ll.removeLast();
	System.out.println(ll);
	ll.removeAll(lll);
	System.out.println(ll);
	int llsize=ll.size();
	System.out.println(llsize);
	//Advance for Loop
	System.out.println("*************Using Advance FOR loop*************");
	
	for(String str:ll)
	{
		System.out.println(str);
	}
	
	//Using Iterator
	
	System.out.println("*************Using Iterator*************");

	
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	
	}
	

}
