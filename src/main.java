import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = (int)(Math.random()*10+1);
        System.out.println("I have chosen a number between 1 and 10. Guess which one it is!");
        int guess = input.nextInt();
        while (guess != num)
        {
            System.out.println("That's not it, try again!");
            guess = input.nextInt();
        }
        System.out.println("That's right! Good job.");
    }
}
