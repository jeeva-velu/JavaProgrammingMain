package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

public class TryCatchBlockDemo2 {

    private static Logger logger = Logger.getLogger(TryCatchBlockDemo.class.getName());

    public static void main(String[] args) {

        //This try-catch block is to handle ArrayIndexOutOfBoundsException...
        String filePath = "C:\\Users\\jeeva\\IdeaProjects\\JavaProgrammingMain\\output\\test.txt";

        try {
            //createFile(filePath);
            divide(1,0);
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[1]);

        } catch (ArrayIndexOutOfBoundsException ex) {  //You can also mention Exception simply in place of ArrayIndexOutOfBoundsException to handle all exceptions...
            //System.out.println("Enter the valid index value...");
            String message = ex.getMessage();
            //Instead of using sout statement we can use Logger statement to show more details about the exception...
            logger.info("Enter the valid index value..." + message);
            //ex.printStackTrace();
//        } catch (IOException e) {
//            logger.info("IOException occurred while creating new file : " + filePath + " : " + e.getMessage());
//        }
        } catch (Exception e) {
            logger.info(" Exception occurred while running main() method : " + e.getMessage());
        } finally {
            logger.info("I will always execute..");
        }
    }

    private static void createFile(String filePath) throws IOException {
        Files.createFile(Path.of(filePath));
    }

    static int divide(int a, int b) {

        logger.info("a: "+ a);
        logger.info("b: "+ b);

        if (b <= 0) {
            throw new RuntimeException("Invalid denominator provided");
        }

        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            logger.info("ArithmeticException occurred, " + e.getMessage());
        }
        return result;
    }
}
