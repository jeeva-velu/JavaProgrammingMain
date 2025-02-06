package exceptionhandling;

import java.util.InputMismatchException;
import java.util.logging.Logger;

public class MultipleCatchBlocks {

    static Logger logger = Logger.getLogger(MultipleCatchBlocks.class.getName());

    public static void main(String[] args) {
        String name = null;
     try{
         name = "Jeeva";
         logger.info(name.substring(1,10));
         name = name.toUpperCase();
         logger.info(name);
     }catch (NullPointerException ex){
        logger.severe("Cannot perform String operation to an null object");
        ex.getStackTrace();
     }catch (StringIndexOutOfBoundsException ex){
         logger.severe("Enter valid index value to perform String operations");
         ex.getStackTrace();
         ex.getMessage();
     }catch (InputMismatchException | ArithmeticException ex){  //We can give the different exceptions in same catch block using pipe symbol | .
         logger.severe("Give the suitable input");
     } catch (Exception ex){             //This is an Generic catch block.It handles all type of exception...
         logger.severe("An exception occurred.Please check your program");
     }
    }
}
