# Password Checker App

A simple Java console application that checks the strength and validity of user passwords. This beginner-friendly app validates passwords based on length, character types, and similarity to common bad passwords.

## Features

- Password length validation (minimum 12 characters)
- Checks for uppercase letters, lowercase letters, digits, and special characters
- Detects spaces in passwords and rejects them
- Compares user password against a list of common bad passwords (loaded from a file)
- Provides detailed feedback on password strength requirements

## How to Use

1. Run the application.
2. Enter your password when prompted.
3. The program will tell you if the password is strong or if it fails any checks.
4. If the password is invalid, you will be asked to retry until a strong password is entered.

## Requirements

- Java 8 or higher
- `BadPasswords.txt` file with common passwords in the project directory

## How It Works

The program reads common bad passwords from a file and compares the entered password to ensure it’s not too similar. It then checks for the presence of uppercase, lowercase, digit, and special characters. If all criteria are met, the password is accepted as strong.

## Future Improvements

- Add a graphical user interface (GUI)
- Implement password hashing for storage (for learning purposes)
- Provide options for password suggestions

## How to Run

You can compile and run the app from the command line or import it into an IDE like Eclipse:

```bash
javac Main.java Password.java
java Main
