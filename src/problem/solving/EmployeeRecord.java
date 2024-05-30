////Objective: To understand the usage and the implementation of Arrays in Java.
//Problem Description: A project unit in a company wants to keep track of five employees in the project and their salaries, and also find out the average of their salaries. They also want to find the number of employees who get a salary greater than the average salary and those who get lesser.
// 
//Consider that the salaries are stored in an array of double variables as given below:
//double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0}
//Create a class EmployeeRecord and write a program to implement the above requirement. Refer to the output given below:
//  
//Summary of this exercise:
//You have understood the usage and implementation of Array in Java.

package problem.solving;
import java.util.*;
public class EmployeeRecord {
	public static void main(String args[]) {
		double d=0;
		double h=0;
		int y=0;
		int u=0;
		double [] salary= {23500.0,25080.0,28760.0,22340.0,19890.0};
		for(int i=0;i<salary.length;i++) {
			d=d+salary[i];
			 h=d/salary.length;
		}
		System.out.println("the average salary is:"+h);
		for(int j=0;j<salary.length;j++) {
			if(salary[j]>h) {
				y=y+1;
			}
			else {
				u=u+1;
			}
		}
		System.out.println("the no of employees having salary higher than average salary is "+y);
		System.out.println("the no of employees having salary lesser than average salary is "+u);
		
	}

}
