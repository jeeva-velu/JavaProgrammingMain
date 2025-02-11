package exceptionhandling;

import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);      //try-with-resources block to avoid finally block to close objects.
             BufferedReader bf = new BufferedReader(isr);){
            System.out.println("Please enter a value");
            String input = bf.readLine();               //It gives an IOException
            System.out.println("The user entered a value:"+input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void fileReader() {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\jeeva\\IdeaProjects\\JavaProgrammingMain\\src\story.txt");
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
