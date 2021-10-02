package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    List <Integer> numbers = new ArrayList<>();
    List <Integer> even = new ArrayList<>();
    List <Integer> odd = new ArrayList<>();


    public OddNumbersExterminator () {
    }

    public List<Integer> exterminate(List<Integer> numbers){
        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) %2 == 0) {
                even.add(numbers.get(n));
            } else {
                odd.add(numbers.get(n));
            }

        }
        if (even.size() == 0 && odd.size() == 0) {
            System.out.println("List is empty");
        }
        return even;
    }

    public List<Integer> getOdd() {
        return odd;
    }

    public List<Integer> getEven() {
        return even;
    }

}


