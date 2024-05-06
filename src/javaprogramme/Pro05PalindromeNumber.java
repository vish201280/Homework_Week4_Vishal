package javaprogramme;

public class Pro05PalindromeNumber {
    // Write a method called isPalindrome with one int parameter called number.
    //The method needs to return a boolean.
    //It should return true if the number is a palindrome number otherwise it should return false.
    //Check the tips below for more info about palindromes.
    //Example Input/Output
    //isPalindrome(-1221); → should return true
    //isPalindrome(707); → should return true
    //isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
    //11212.

    public static int oneDigit(int num) {

        if ((num >= 0) && (num < 10))
            return 1;
        else
            return 0;
    }

    public static int isPalUtil
            (int num, int dupNum) throws Exception {

        // base condition to return once we
        // move past first digit
        if (num == 0) {
            return dupNum;
        } else {
            dupNum = isPalUtil(num / 10, dupNum);
        }

        // Check for equality of first digit of
        // num and dupNum
        if (num % 10 == dupNum % 10) {
            // if first digit values of num and
            // dupNum are equal divide dupNum
            // value by 10 to keep moving in sync
            // with num.
            return dupNum / 10;
        } else {
            // At position values are not
            // matching throw exception and exit.
            // no need to proceed further.
            throw new Exception();
        }

    }

    public static int isPal(int num)
            throws Exception {

        if (num < 0)
            num = (-num);

        int dupNum = (num);

        return isPalUtil(num, dupNum);
    }

    public static void main(String args[]) {

        int n = -1221;
        try {
            isPal(n);
            System.out.println("Yes");
        } catch (Exception e) {
            System.out.println("No");
        }
        n = 707;
        try {
            isPal(n);
            System.out.println("Yes");
        } catch (Exception e) {
            System.out.println("No");
        }

        n = 11212;
        try {
            isPal(n);
            System.out.println("Yes");
        } catch (Exception e) {
            System.out.println("No");
        }
    }
}
