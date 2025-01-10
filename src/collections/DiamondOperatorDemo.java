package collections;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorDemo {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Double> values = new ArrayList<Double>();
        List<Character> characters = new ArrayList<Character>();
        var numbers = new ArrayList<Integer>();
         */

        //To avoid repeatation we are using <> diamond operator

        ArrayList<Integer> nums = new ArrayList<>();    //We don't want to mention datatype two times on right also
        ArrayList<Double> values = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        var numbers = new ArrayList<Integer>();        //Here we cannot use because we are using datatype only one time.
    }
}
