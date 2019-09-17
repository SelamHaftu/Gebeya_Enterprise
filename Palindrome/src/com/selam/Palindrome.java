package com.selam;

public class Palindrome  {


    public boolean isPalindrome(String original) {


        String  reverse = ""; // Objects of String class

        String input = original.toLowerCase().replaceAll("\\s+", "");
        int length = input.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + input.charAt(i);
        if (input.equalsIgnoreCase(reverse) && input.matches("^([a-zA-Z- ]+)?$")){
            System.out.println("Palindrome");
            return true;}

        else{
            System.out.println("Not Palindrome");
            return false;}


    }


    public boolean CheckPalindrome() {
        return true;
    }
}
