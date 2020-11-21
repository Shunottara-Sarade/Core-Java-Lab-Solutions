package com.capg.training.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidFullNameException extends Exception {

    public InvalidFullNameException(String messge) {
        super(messge);
        System.out.println(messge);
    }
    
    
}
public class ValidateName {
    
    
    public static boolean validateFullName(String fullName) throws InvalidFullNameException
    {
        
        Pattern pattern = Pattern.compile("^[a-zA-Z]{4,}(?: [a-zA-Z]+){2}$");
        Matcher matcher = pattern.matcher(fullName);
        boolean found = matcher.find();
        if (found)
        return found;
        else 
        throw new InvalidFullNameException("please enter valid full name");
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you full name");
        String fullName=sc.nextLine();
        try{
        System.out.println(ValidateName.validateFullName(fullName));
        }
        catch(InvalidFullNameException ex)
        {
            ex.printStackTrace();
            
        }
         catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}