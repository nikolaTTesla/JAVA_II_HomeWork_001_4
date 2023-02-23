import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, insert 3 integers that will represent length of the sids of triangle.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert value for the first side.");
        int iFirstSide = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert value for the second side.");
        int iSecondSide = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert value for the third side.");
        int iThirdSide = Integer.parseInt(scanner.nextLine());

        //Checking is it possible to build triangle out of these sides.
        if((iFirstSide < iSecondSide + iThirdSide) && (iSecondSide < iFirstSide + iThirdSide) &&(iThirdSide < iFirstSide + iSecondSide))
        {
            System.out.println("You can form triangle out of these length.");
        }
        else
        {
            System.out.println("You can't form triangle out of these length.");
        }


    }
}