package javaprogramme;

//Write a program to input any number and check if it Armstrong number or not

public class Pro10ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

}
