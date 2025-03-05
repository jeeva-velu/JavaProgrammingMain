package functionalprogrammingusinglambdaexpression;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        //This Supplier interface does not accept any input data but returns the output data...

        Supplier<Integer> getCurrentMonth = () ->LocalDate.now().getMonthValue(); //No input parameter...
        System.out.println("The current month number is : "+getCurrentMonth.get());

        Supplier<Integer> getCurrentDateOfMonth = () ->LocalDate.now().getDayOfMonth(); //No input parameter...
        System.out.println("The current date of the month is : "+getCurrentDateOfMonth.get());

        Supplier<String> getCurrentDayOfWeek = () ->LocalDate.now().getDayOfWeek().name(); //No input parameter...
        System.out.println("The current day of the current week is : "+getCurrentDayOfWeek.get());
    }
}
