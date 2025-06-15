import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		//variables
		Scanner kb = new Scanner(System.in);
		String input;
		Password p;
		do
		{
			System.out.println("🔐 Welcome to the password checker!");
			System.out.print("Enter your password: ");
			input = kb.nextLine();
			p = new Password(input);
			if(p.getChecker()== false)
			{
				System.out.println("\nPlease retry!\n");
			}
			else
			{
				System.out.println("\nPassword successful and strong!\n");
			}
		}
		while(p.getChecker() == false);

	}

}
