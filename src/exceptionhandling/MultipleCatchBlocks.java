package exceptionhandling;

import java.util.logging.Logger;

public class MultipleCatchBlocks {

    Logger logger = Logger.getLogger(MultipleCatchBlocks.class.getName());

    public static void main(String[] args) {
        String name = null;
     try{
        name = name.toUpperCase();
     }catch (NullPointerException ex){

     }
    }
}
