package by.bntu.fitr.tnnf.javalabs.lab12;

import java.util.Scanner;

public class UsersInput {
    private static Scanner in = new Scanner(System.in);

    public static int inputInt(String msg)
    {
        View.print(msg);
        return in.nextInt();
    }

    public static float inputFloat(String msg)
    {
        View.print(msg);
        return in.nextFloat();
    }



    public static char inputChar(String msg)
    {
        View.print(msg);
        return in.next().charAt(0);
    }
}
