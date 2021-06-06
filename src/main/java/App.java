import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print( "What is the quote? " );
        String str1= sc.nextLine();
        System.out.print( "Who said it? " );
        String str2= sc.nextLine();
        System.out.print(" "+str2+" ");
        System.out.print("says, ");
        System.out.print("\""+str1+"\"");
    }
}

