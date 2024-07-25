package FourthProblem;

public class Main {
    /*
    Write a recursive function that determines whether an array is a palindrome, where the array and its size are given as parameters.
    returns 1 if a[] is a palindrome, 0 otherwise
    int ispalindrome(char a[], int n)


    * */

    public static void main(String[] args) {
       // char array [] = {'a','n','a','n','a'};
       // char array [] = {'p','e','r','r','o'};
        char array [] = {'l','o','l'};
       if (isPalindrome(array, 3).equals(String.copyValueOf(array))){
           System.out.println("palindrome");
       }
       else System.out.println("not palindrome");

    }


    /*
    * THE CORRECT WAY OF DOING THIS WOULD HAVE BEEN STRIPPING THE WORD UNTIL IT DIDNT MATCH, EXAMPLE
    *  ANANA, AS THE FIRST AND LAST LETTERS ARE EQUAL WE STRIP THE FIRST AND LAST, SO NOW WE HAVE
    *   NAN, NOW THE FIRST AND LAST LETTERS ARE EQUAL TOO, SO WE STRIP IT AGAIN
    *   N , SINCE WE HAVE N, THAT MEANS IS A PALYNDROME BECAUSE IT ONLY WAS ONE LETTER.
    *   IF THE FIRST AND LAST LETTER ARE NOT EQUAL IS NOT A PALYNDROME
    *
    *   LIKE THIS :
    *
    *    // Base case: if array size is 0 or 1, it is a palindrome
        if (n <= 1) {
            return 1;
        }

        // Base case: if first and last characters are different, it is not a palindrome
        if (a[0] != a[n - 1]) {
            return 0;
        }

        // Recursive case: check the subarray excluding the first and last characters
        char[] subArray = new char[n - 2];
        System.arraycopy(a, 1, subArray, 0, n - 2);
        return isPalindrome(subArray, n - 2);
    }
    *
    * */


    public static String isPalindrome(char array[], int size){
        if (size == 1){
            return String.valueOf(array[0]);
        }
       return  array[size-1] + isPalindrome(array, size-1) ;

    }


}
