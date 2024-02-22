package org.example;

import java.util.ArrayList;

import java.util.List;

public class FizzBuzz {

    public boolean validateInput(int i) {

        if (i > 0 && i < 1000) return true;

        return false;
    }

    public List<String> getResult(int range) throws Exception {
        boolean isValidInput = validateInput(range);

        if (!isValidInput) {

            throw new Exception("Invalid Input");

        }
        ArrayList<String> result = new ArrayList<>();


        for (int i = 0; i < range; i++) {


            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {

                result.add(i, "fizzbuzz");
            } else if ((i + 1) % 3 == 0) {
                result.add(i, "fizz");
            } else if ((i + 1) % 5 == 0) {
                result.add(i, "buzz");
            } else {
                result.add(i, "" + (i + 1));
            }
        }


        return result;

    }


}

