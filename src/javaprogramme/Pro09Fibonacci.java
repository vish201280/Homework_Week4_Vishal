package javaprogramme;

//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Pro09Fibonacci {
    public static void main(String[] args) {

        int n = 8, firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
