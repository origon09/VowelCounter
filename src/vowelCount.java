import java.util.Scanner;

public class vowelCount {

    /**
     * Project Takes in a String and Will let the user know how many vowels are inside.
     * @param args
     */

    public static void main(String[] args) {
        countVow();

    }

    /**
     * Method contains a scanner for user input and empty string to house input.
     * Will set string to lowercase for easier counting of vowels with toLower() method.
     * For loop will iterate through string, if statement will look for specific char in string
     */
    public static void countVow(){

        Scanner sc = new Scanner(System.in);
        String testString;
        System.out.println("Input your sentence: ");
        testString = sc.nextLine().toLowerCase();
        int totalVowels = 0;
        for(int i= 0; i < testString.length(); i++){

            char ch = testString.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y'){
                totalVowels ++;
            }

            }
        System.out.println("The total vowels are : "+ totalVowels);


        }





    }