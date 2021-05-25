import java.util.*;
import java.lang.*;
import java.io.*;

// Java code for the above program
class orderedtriplet{
		
// function to count the
// ordered triplets (H, S, L)
static int countTriplets(String color)
{
	int result = 0, L_Count = 0;
	int H_Count = 0;
	int len = color.length();
	int i;
	
	// count the H(Hue) colour
	for (i = 0; i < len ; i++)
	{
		if (color.charAt(i) == 'L')
			L_Count++;
	}

	for (i = 0; i < len ; i++)
	{
		if (color.charAt(i) == 'L')
			L_Count--;
		if (color.charAt(i) == 'H')
			H_Count++;
		if (color.charAt(i) == 'S')
			result += L_Count * H_Count;
		System.out.println(H_Count+" "+L_Count+" "+result);
	}
	return result;
}

// Driver Code
public static void main (String[] args)
{
	String color = "HHSL";
	System.out.println(countTriplets(color));
}

}

// This code is contributed by AnkitRai01
