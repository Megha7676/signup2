package com.signup1;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import static java.lang.System.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	signup1validations sv= new signup1validations();
    	out.println("Welcome to Signup Page");
    	out.println("Enter Username ");
        String username=sc.next();
        try {
        	if(sv.checkUsername(username)) {
        		out.println("Enter Password");
        		String password=sc.next();
        		try {
        			if(sv.checkPassword(password))
        			{
        				out.println("Phone Number");
        				String phone=sc.next();
        				try {
        					if(sv.checkPhone(phone))
        					{
        						out.println("Signup successful");
        						out.println("username :"+username+"password"+password+"phone number"+phone);
        					}
        				}
        				catch(Exception e) {
        					out.println(e.getMessage());
        				}
        			}
        		}
        		catch(Exception e) {
        			out.println(e.getMessage());
        		}
        	}
        }
        catch(Exception e){
        	out.println(e.getMessage());
        }
    }
}


        		