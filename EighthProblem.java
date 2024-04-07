package assignment1;

import java.util.Scanner;

public class EighthProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Time taken " + duration + " milliseconds");
        boolean b = allDigits(s);
        if(b = true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    /*
     *This method checks is there a digit in the String.
     *Time complexity: 0(n),where n is the length of the input string.
     *Complexity class:  linear
     *@param s The string that we inputed.
     *@return false The method returns false if we have another symbol than digits.
     *@rerutn true The method returns True if all symbols are digits.
     */
    public static boolean allDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

