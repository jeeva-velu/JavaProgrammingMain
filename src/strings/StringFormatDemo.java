package strings;

public class StringFormatDemo {
    public static void main(String[] args) {
        String message = "My name is %s,My age age is %d";
        String msgJeeva = String.format(message,"Jeeva",20);
        String msgHarsha = String.format(message,"Harsha",1);
        System.out.println(msgJeeva);
        System.out.println(msgHarsha);

        String message2 = "The price is %.2f";      //To avoid more precision values give %.2 to get 2 precision vale
        String priceMessage1 = String.format(message2,17.99);
        String priceMessage2 = String.format(message2,50.54);
        System.out.println(priceMessage1);
        System.out.println(priceMessage2);

        String message3 = "The number is %5d";
        String msg1 = String.format(message3,15);
        System.out.println(msg1);

    }

}
