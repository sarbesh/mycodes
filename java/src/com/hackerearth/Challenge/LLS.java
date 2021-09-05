import java.util.*;
import java.lang.*;

class LLS{
	public static void main(String args[]){
		LinkedList<String> ls = new LinkedList<String>();

		ls.add("nabin");
		ls.addLast("yogi");
		ls.add("swetha");
		ls.addFirst("jahnavi");
		ls.add(0,"sarbesh");

		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}

		List<String> al = new ArrayList<String>();
		al.add("sarbesh");
		al.add("yougi");
		al.add("nabin");

		Iterator itrs = al.iterator();
		while(itrs.hasNext()){
			System.out.println(itrs.next());
		}
	}
}
