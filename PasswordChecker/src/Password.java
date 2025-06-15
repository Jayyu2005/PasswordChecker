import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class Password {
	
	
	private boolean checker = false;
	
	// Constructor
	
	Password(String pass)
	{
		setPass(pass); // Set only if valid
	}
	
	public void setPass(String pass)
	{
		
		if(pass.isBlank())
		{
			System.out.print("Your password is empty!");
			return;
		}
		
		if(pass.length() < 12)
		{
			System.out.print("Your password is too short!");
			return;
		}
		
		if(pass.contains(" "))
		{
			System.out.print("Please enter a valid character (no spaces) ");
			return;
		}
		Set<String> badPasswords = loadCommonPasswords("BadPasswords.txt");
		for (String s : badPasswords)
		{
			
			double badlen = s.length();
			double match = 0;
			for(int i = 0; i < badlen; i++)
			{
				if(pass.toLowerCase().charAt(i) == s.toLowerCase().charAt(i))
				{
					match++;
				}
				else
				{
					break;
				}
			}
			if(match>0)
			{
				if(match/badlen > 0.5)		//checks if the password is 50percent similar to common bad passwords. if it is it returns the following message
				{
					System.out.print("Error, password is too common.");
					return;
				}
			}
			
		}
		if(isStrong(pass) == false)
		{
			return;
		}
		
		this.checker = true;

	}
	//method to check if the password contains these requirements using for loop;
	private boolean isStrong(String pass)
	{
		//special characters
		String specialChars = "!@#$%^&*()-_=+\\|{};:/?.><";
		
		
		boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        for(char c : pass.toCharArray())
        {
        	if(Character.isUpperCase(c))	//returns true if there is an upper
        	{
        		hasUpper = true;
        	}
        	else if(Character.isLowerCase(c))	//returns true if there is a lower
        	{
        		hasLower = true;
        	}
        	else if(Character.isDigit(c))	//returns true if there is a digit in the password
        	{
        		hasDigit = true;
        	}
        	else if(specialChars.indexOf(c) != -1)	//if the index of special character in the password is not found it is false;
        	{
        		hasSpecial = true;	//returns true if it is not -1.
        	}
        }
        
        
        //error messages
        if(hasUpper == false)
        {
        	System.out.println("Your password does not have uppercase letters!");
        }
        if(hasLower == false)
        {
        	System.out.println("Your password does not have lowercase letters!");
        }
        if(hasDigit == false)
        {
        	System.out.println("Your password does not have numbers (0-9)!");
        }
        if(hasSpecial == false)
        {
        	System.out.println("Your password does not have special digits!");
        }
        
        return hasUpper && hasLower && hasDigit && hasSpecial;

	}
	private Set<String> loadCommonPasswords(String filename)
	{
	    Set<String> badPasswords = new HashSet<>();
	    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            badPasswords.add(line.trim());
	        }
	    } catch (IOException e) {
	        System.out.println("Error reading bad password file: " + e.getMessage());
	    }
	    return badPasswords;
	}
	
	public boolean getChecker()
	{
		return checker;
	}

}



