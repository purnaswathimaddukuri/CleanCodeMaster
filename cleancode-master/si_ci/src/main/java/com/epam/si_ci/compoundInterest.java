package com.epam.si_ci;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class compoundInterest {
	float principleAmount,rate,time,compoundInterest,n;
	void readInput() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		bw.write("Enter Principle Amount : ");
		bw.flush();
		principleAmount = sc.nextFloat();
		bw.write("Enter Rate : ");
		bw.flush();
		rate = sc.nextFloat();
		bw.write("Enter Time Period : ");
		bw.flush();
		time = sc.nextFloat();
	}
	void computeCompoundInterest(){
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
	}
	void displayAmount() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Total Amount : "+compoundInterest);
		bw.flush();
	}
}