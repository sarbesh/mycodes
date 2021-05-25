import java.util.*;
import java.lang.*;
import java.io.*;

// Java code for the above program
class GFG{
		
// function to count the
// ordered triplets (R, G, B)
static int countTriplets(String color)
{
	int result = 0, Blue_Count = 0;
	int Red_Count = 0;
	int len = color.length();
	int i;
	
	// count the B(blue) colour
	for (i = 0; i < len ; i++)
	{
		if (color.charAt(i) == 'B')
			Blue_Count++;
	}

	System.out.println(Blue_Count);

	for (i = 0; i < len ; i++)
	{
		if (color.charAt(i) == 'B')
			Blue_Count--;
		if (color.charAt(i) == 'R')
			Red_Count++;
		if (color.charAt(i) == 'G')
			result += Red_Count * Blue_Count;
		System.out.println(Blue_Count+" "+Red_Count+" "+result);	
	}
	return result;
}

// Driver Code
public static void main (String[] args)
{
	// String color = "RRGGBBRGGBB";
	String color = "RRGB";
	System.out.println(countTriplets(color));
}

}

// This code is contributed by AnkitRai01
