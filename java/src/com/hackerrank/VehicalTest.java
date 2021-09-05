import java.lang.*;
import java.util.*;

class Vehical
{
	public void make(){
		System.out.println("Vehical");
	}
}

class Bike extends Vehical
{
	private void make(){
			System.out.println("Bike");
	}
}

class VehicalTest{
	public static void main(String[] args){
		Vehical vc = new Bike();
		vc.make();
	}
}
