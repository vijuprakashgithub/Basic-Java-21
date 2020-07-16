package com.viju;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your date of birth in yyyy-mm-dd format please");
	String str = input.nextLine();
	LocalDate dob = LocalDate.parse(str);
	LocalDate thisday = LocalDate.now();
	int age = Period.between(dob, thisday).getYears();
	System.out.println("Your age is "+age);
	}
}
