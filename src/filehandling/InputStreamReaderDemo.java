package filehandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {

        //InputStreamReader is a subclass of Reader class which is a subclass of CharacterStream.
        //It converts a byte stream into a character stream.
        //Eg:System.in(InputStream-ByteStream)->CharacterStream.

        try(InputStreamReader isr = new InputStreamReader(System.in)) { //Byte InputStream as parameter.
            System.out.print("Enter some letters : ");
            int letters = isr.read();
            while ((isr.ready())){
                System.out.println((char) letters);     //54 -> 5 4 ->Gives as a each character.
                letters = isr.read();
            }
            System.out.println();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
