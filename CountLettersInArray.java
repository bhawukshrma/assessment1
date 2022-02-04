package com.atcs.main2;
import java.util.Random;
 public class CountLettersInArray{
   public static void main(String args[]) {
     // Declare and create an array
      char[] chars = createArray();
     // Display the array
     System.out.println("The lowercase letters are as follows:");
      displayArray(chars);
     // Count the occurrences of each letter
     int[] counts = countLetters(chars);
     System.out.println();
     System.out.println("The occurrences of each letter are:");
      displayCounts(counts);
   }
   public static char[] createArray() {

     char[] chars = new char[100];
     Random generator = new Random();
     String S ="abcdefghijklmnopqrstuvwxyz";
     for (int i = 0; i < chars.length; i++)
       chars[i] = (char) S.charAt(generator.nextInt(26));
    return chars;
   }

 public static void displayArray(char[] chars) {
     // Display the characters in the array 20 on each line
     for (int i = 0; i < chars.length; i++) {
       if ((i + 1) % 20 == 0)
         System.out.println(chars[i] + " ");
       else
        System.out.print(chars[i] + " ");
            }
          }
          /* Count the occurrences of each letter */
          public static int[] countLetters(char[] chars) {
            // Declare and create an array of 26 int
            int[] counts = new int[26];
            for (int i = 0; i < chars.length; i++)
             counts[chars[i] - 'a']++;
            return counts;
          }
          public static void displayCounts(int[] counts) { 
            for (int i = 0; i < counts.length; i++) {
              if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
              else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
          }
       }
