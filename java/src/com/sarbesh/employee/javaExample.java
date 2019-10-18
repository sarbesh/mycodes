package com.sarbesh.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaExample {
    public static void main(String[] args) {

/*
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(2);
        Employee emp3 = new Employee(3,25);
        Employee emp4 = new Employee(4,27, 2500);
        System.out.println(emp1.toString());;
        System.out.println(emp2.toString());;
        emp3.toString();
        System.out.println(emp4.toString());;
        List<Employee> lst = new ArrayList<Employee>();
        lst.add(new Employee(1,25,2500));
        lst.add(new Employee(2,23,3450));
        lst.parallelStream().forEach(i -> System.out.println(i.toString()));
*/

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scn.nextInt();
        System.out.println("Enter a String");
//        String b = scn.nextLine();      //Does not read this line and skips cursor
        String b = scn.next();          //This works
        System.out.print("You have entered:- "
                + a + " " + "and name as " + b);

/*
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter an integer");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter a String");
        String b = br.readLine();
        System.out.printf("You have entered:- " + a +
                " and name as " + b);
*/
    }
}
