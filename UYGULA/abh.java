package UYGULA;

import java.util.Scanner;

public class abh {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please Enter Your Passvword: ");
	String password=input.nextLine();
	System.out.println(pcontrol(password.charAt(0)));
}
public static String pcontrol (char c) {
	if (Character.isUpperCase(c))
		return "First character is big";
	else if (Character.isLowerCase(c))
		return "First character is little";
	else if (Character.isDigit(c))
		return "First charcter is number";
	else
		return "First character is symbol";
}
}
