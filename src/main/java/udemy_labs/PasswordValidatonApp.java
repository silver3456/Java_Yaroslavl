package udemy_labs;

import java.io.*;

public class PasswordValidatonApp {
    public static void main(String[] args) {

        //Read a file of passwords
        String filename = "/Users/alexander/SDET_Files/Passwords.txt";
        String[] passwords = new String[13];

        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Could not open file");
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file");
        }

        //Test against our criteria
        for (String password : passwords) {
            System.out.println("*****\n" + password);

            boolean hasNumber = false;
            boolean hasLetter = false;
            boolean hasSpecialChar = false;
            boolean hasInvalidChar = false;

            for (int n = 0; n < password.length(); n++) {
                //Condition 1: contains number
                if ("0123456789".contains(password.substring(n, n + 1))) {
                    hasNumber = true;
                    //System.out.println("Position " + n + " contains a number");
                    //Condition 2: contains letter
                } else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n + 1).toLowerCase())) {
                    hasLetter = true;
                    //System.out.println("Position " + n + " contains a letter");
                    //Condition 3: contains special character, !@#$
                } else if ("!@#$%^&*()-_+".contains(password.substring(n, n + 1))) {
                    hasSpecialChar = true;
                    //System.out.println("Position " + n + " contains a character");
                } else
                    try {
                        throw new InvalidCharacterException(password.substring(n, n + 1));
                    } catch (InvalidCharacterException e) {
                        e.toString();
                    }
            }
            //Test & Exception Handling

            try {
                if (!hasNumber) {
                    throw new NumberCriteriaException(password);
                } else if (!hasLetter) {
                    throw new LetterCriteriaException(password);
                } else if (!hasSpecialChar) {
                    throw new SpecialCharCriteriaException(password);
                } else {
                    System.out.println("Valid password");
                }
            } catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
                System.out.println("Invalid password");
                System.out.println(e.toString());
            }

        }
    }
}


class InvalidCharacterException extends Exception {
    String ch;

    public InvalidCharacterException(String ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "InvalidCharacterException " + ch;

    }
}

class NumberCriteriaException extends Exception {
    String password;

    public NumberCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NumberCriteriaException: " + password;
    }
}

class LetterCriteriaException extends Exception {
    String password;

    public LetterCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LetterCriteriaException: " + password;
    }
}

class SpecialCharCriteriaException extends Exception {
    String password;

    public SpecialCharCriteriaException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SpecialCharCriteriaException: " + password;
    }
}








