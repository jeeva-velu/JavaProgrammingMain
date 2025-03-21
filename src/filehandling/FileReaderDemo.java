package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderDemo {
    public static void main(String[] args) {

        //FileReader is used to read characters from the file.

        //Why we write code in try-catch block is when we face some issues like FileNotFound,FileMismatch etc and to handle that.

        try(FileReader fr = new FileReader("C:\\Users\\jeeva\\IdeaProjects\\JavaProgrammingMain\\src\\filehandling\\Hello.txt")) { //Giving the filename as i/p parameter.
            int letters = fr.read();
            while ((fr.ready())){
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
