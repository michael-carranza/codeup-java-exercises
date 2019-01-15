package src;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // CALL METHODS HERE

        // First Exercise
//    int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//    }
        // ARRAY INITIALIZED
        Object[] people = new Object[3];
        //PEOPLE GENERATED DIRECTLY INTO ARRAY
        people[0]= new Person(Input.getString("Please enter a name."));
        people[1] = new Person(Input.getString("Please enter a name."));
        people[2] = new Person(Input.getString("Please enter a name."));
        System.out.println(people.length);
        Object[] newPeople = addPerson(people);
        people = newPeople;
        System.out.println(people.length);
    }
        // BUILD METHODS HERE
        public static Object[] addPerson(Object[] people){
            System.out.println("Adding a new person now.");
        int length = people.length;
        Object[] newPeople = new Object[length+1];
        int i = 0;
        while (i<people.length) {
            newPeople[i] = people[i];
            i++;
        }
        newPeople[length]= new Person(Input.getString("Please enter a name."));
            return newPeople;
        }
        //END OF EVERYTHING
    }

