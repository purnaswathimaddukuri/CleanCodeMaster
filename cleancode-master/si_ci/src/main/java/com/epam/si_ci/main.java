package com.epam.si_ci;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class main {
	public static void main( String[] args ) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("Choose either option 1 or 2 :"+"\n");
    	bw.write("1.Simple Interest"+"\n");
    	bw.write("2.Compound Interest"+"\n");
    	bw.flush();
    	simpleInterest simpleInterest = new simpleInterest();
    	compoundInterest compoundInterest = new compoundInterest();
    	int choice = sc.nextInt();
    	switch(choice){
    		case 1:simpleInterest.readInput();
    			   simpleInterest.computeSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readInput();
			       compoundInterest.computeCompoundInterest();
			       compoundInterest.displayAmount();
			       break;
			default:bw.write("Please enter valid option");
    	}
    	bw.flush();
    }

}
