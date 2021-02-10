package com.codechef.FEB21C;

import java.util.Scanner;

public class MEET {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while(T>0){
            StringBuilder result = new StringBuilder();
            int[] meetingTime = format(sc.nextLine());
            int n = Integer.parseInt(sc.nextLine());
            while(n>0){
                String available = sc.nextLine();
                int splitIndex = available.indexOf("M");
                int[] start = format(available.substring(0,splitIndex+1));
                int[] end = format(available.substring(splitIndex+2));
                if ((meetingTime[0]>=start[0] && meetingTime[1]>=start[1]) &&
                        (meetingTime[0]<=end[0] && meetingTime[1]<=end[1])){
                    result.append("1");
                } else {
                    result.append("0");
                }
                n--;
            }
            System.out.println(result);
            T--;
        }
        sc.close();
    }

    public static int[] format(String input){
        String[] timearr = input.split(" ");
        String[] time = timearr[0].split(":");
        int hrs = Integer.parseInt(time[0]);
        if (timearr[1].equals("PM") && !time[0].equals("12")){
            hrs = Integer.parseInt(time[0])+12;
        }
        if (timearr[1].equals("AM") && time[0].equals("12")){
            hrs = 0;
        }
        return new int[]{hrs,Integer.parseInt(time[1])};
    }
}
