package com.tcs.handson;

import java.util.*;
import java.io.*;
import java.lang.*;


class script{

	public static void main(String[] args) {
		
	}

	static boolean isValid(){
		String val1 = "true";
		String val3 = "true";
		String val2 = "true";
		if("true".equals(val1) || "false".equals(val3) || "true".equals(val2)){
			System.out.println("valid");
			return true;
		} else {
			System.out.println("invvalid");
			return false;
		}
	}

}