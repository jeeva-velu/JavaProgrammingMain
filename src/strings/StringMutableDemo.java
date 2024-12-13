package strings;

import java.io.CharArrayWriter;
import java.io.IOException;

public class StringMutableDemo {
    public static void main(String[] args) throws IOException {

        //Approach 1--StringBuilder class (No thread safety)

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("World");
        stringBuilder.insert(0,"Hello ");
        stringBuilder.deleteCharAt(4);
        stringBuilder.insert(4,'o');
        stringBuilder.setLength(5);
        stringBuilder.reverse();
        String st = stringBuilder.toString();       //Converting StringBuilder class to String class
        System.out.println(st);

        //Approach 2--StringBuffer class  (Thread safety)

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("World");
        stringBuffer.insert(0,"Hello ");
        stringBuffer.deleteCharAt(4);
        stringBuffer.insert(4,'o');
        stringBuffer.setLength(5);
        stringBuffer.reverse();
        String st1 = stringBuffer.toString();
        System.out.println(st1);

        //Approach 3--CharArrayWriter class  --Rarely used class by developers

        CharArrayWriter cw = new CharArrayWriter();
        cw.write("Hello");
        cw.write(" World");
        String st2 = cw.toString();
        System.out.println(st2);



    }

}
