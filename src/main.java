import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guessNum= 1;
        System.out.println("Would you like to guess my number, or should I guess yours? Type mine or yours to choose.");
        String choice = input.nextLine();
        while (!choice.equals("yours") && !choice.equals("mine"))
        {
            System.out.println("Sorry, I don't understand. Please type either yours or mine.");
            choice = input.nextLine();
        }
        if (choice.equals("yours"))
        {
            System.out.println("Ok, you can guess my number!");
            int num = (int) (Math.random() * 10 + 1);
            System.out.println("I have chosen a number between 1 and 10. Guess which one it is!");
            int guess = input.nextInt();
            while (guess != num)
            {
                System.out.println("That's not it, try again!");
                guessNum++;
                guess = input.nextInt();
            }
            System.out.println("That's right! Good job. You got it on guess number "+guessNum+".");
        }
        if (choice.equals("mine"))
        {
            System.out.println("Ok I will try to guess your number. Make sure it is between 0 and 100.");
            int min = 0;
            int max = 100;
            int guess = 50;
            String response = "";
            while (!response.equals("correct"))
            {
                guess = (min+max)/2;
                System.out.println("Is your number "+guess+"?");
                response = input.nextLine();
                if (!response.equals("lower") && !response.equals("higher") && (!response.equals("correct")))
                {
                    System.out.println("Sorry, I don't understand your response. Please choose either correct, higher, or lower.");
                }
                if (response.equals("lower"))
                {
                    max = guess;
                    guessNum = guessNum+1;
                }
                if (response.equals("higher"))
                {
                    min = guess;
                    guessNum = guessNum+1;
                }

            }
            if(guessNum != 1)
            {
                System.out.println("I got it! Your number is " + guess + "! That took me " + guessNum + " tries to get right!");
            }
            else
            {
                System.out.println("I got it! Your number is "+guess+"! That took me "+guessNum+" try to get right!");
            }

        }
    }
}
