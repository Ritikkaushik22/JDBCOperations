package com.wipro.learn2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	System.out.println("Welcome to Student Management App");
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		System.out.println("PRESS 1 to ADD student");
    		System.out.println("PRESS 2 to DELETE student");
    		System.out.println("PRESS 3 to DISPLAY student");
    		System.out.println("PRESS 4 to EXIT app");
    		int c =Integer.parseInt(br.readLine());
    		if(c==1) {
    			//add student
    			System.out.println("Enter user name :");
    			String name=br.readLine();
    			System.out.println("Enter user phone :");
    			String phone=br.readLine();
    			System.out.println("Enter user city :");
    			String city=br.readLine();
    			//create student object to store student
    			Student st=new Student(name, phone, city);
    			System.out.println(st);
    			
    			boolean answer=StudentDao.insertStudentToDB(st);
    			if(answer) {
    				System.out.println("Student is added successfully...");
    			}
    			else
    			{
    				System.out.println("Something went wrong try again...");
    			}
    		}
    		else if(c==2) {
    			//delete student
    			System.out.println("Enter Student id to delete: ");
    			int userId=Integer.parseInt(br.readLine());
    			boolean f=StudentDao.deleteStudent(userId);
    			if(f) {
    				System.out.println("Student is deleted successfully...");
    			}
    			else
    			{
    				System.out.println("Something went wrong try again...");
    			}
    			
    		}
    		else if(c==3) {
    			//display student
    			StudentDao.showAllStudents();
    		}
    		else if(c==4) {
    			break;
    		}
    		else {
    			
    		}
    	}
    	System.out.println("Thankyou for using my application....");
    	System.out.println("See you soon... bye bye");
    }
}
