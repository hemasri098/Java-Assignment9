package com.company.JavaAssignment9;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

class PatternChecking {
    public static Logger LOGGER = Logger.getAnonymousLogger();
    public static boolean isContainsPattern(String sentence) {
        if( Pattern.compile("[A-Z](.*)[.?!]$"). matcher(sentence).matches()) {
            return true;
        }
         return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "*linux*";
        try {
            while ((sentence = sc.nextLine()).length() > 0) {
                if(isContainsPattern(sentence)){
                    LOGGER.info("Yes, it starts with capital letter and ends with period");
                }
                else {
                    LOGGER.info("No, it is not starting with capital letter and not ending with period");
                }
            }
        }
        catch (Exception e) {
            LOGGER.info("Exception: " + e);
        }

    }


}

