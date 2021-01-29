package com.tcs.ion;
import java.util.*;

//Given values of distance covered in a marathon by individual in new line and terminate on reading "q".
// Find the top 3 marathon distance covered apart from the finishers.
//Marathon distance: 42.195 km
//Exp  data:- 41 42.195 42.05 40 42.185 42.195 40 (Each data in new line)
//output:- 42.185 42.05 41 (Each output in new line)

public class marathod {
	
	public static void main(String[] args) {
		double d = 42.195;
		List<Double> ranges = new ArrayList<Double>();
		System.out.println("(press q to terminate)");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			if ("q".equalsIgnoreCase(input)) {
				sc.close();
				break;
			}
			ranges.add(Double.parseDouble(input));
		}
		ranges.stream().filter(x -> x<d).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
