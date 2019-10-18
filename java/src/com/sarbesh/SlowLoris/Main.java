package com.sarbesh.SlowLoris;

import java.util.Scanner;

public class Main {

    Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {

        if (args.length!=4){
            System.out.println("Example usage:\n\tjava SlowLoris TARGET PORT CONNECTIONS_PER_THREADS TIMER\n\t\tTARGET the address or DNS Name of the target\n\t\tPORT the port on the target server to connect to\n\t\tCONNECTIONS_PER_THREADS how many connections per threads the program should create. Default is 200 associated connections\n\t\tTIMER how long the attack should last in minutes. Use 0 for forever");
            System.out.println("Enter Target IP or DnsName");
        }
    }
}
