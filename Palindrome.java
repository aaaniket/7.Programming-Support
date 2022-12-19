package com.mycompany.palindrome;

import java.util.*;

// Public Main class   
public class Palindrome {
    public static void main(String args[]) {
        // Getting scanner object
        Scanner s = new Scanner(System.in);
        
        // Getting input
        System.out.println("Enter a string value and press enter: ");
        String input = s.next();
        
        // Checking if string is Palindrome
        boolean isPalindrome = checkPalindrome(input);
        
        // If isPalindrome is true the String is Palindrome
        if(isPalindrome) {
            System.out.println("String '"+input+"' is a Palindrome");
        }
        else {
            System.out.println("String '"+input+"' is not a Palindrome");
        }
    }
    
    // Function to check if the string is palindrome or not
    public static boolean checkPalindrome(String s) {
        // String is empty or null, than not a palindrome
        if(s==null || s.equals("")) {
            return false;
        }
        
        // Initializing variables for start and end points of string
        int low = 0;
        int high = s.length() - 1;
        
        // Checking character from start and end and incrementing/decrementing values
        while(low<=high) {
            // If any character is not equals than not a palindrome
            if(s.charAt(low) != s.charAt(high)) {
                return false;
            }
            
            // incrementing low value, decrementing high value to scan through string
            low++;
            high--;
        }
        
        // No character mismatch found so string is palindrome
        return true;
    }
}
