package JavaBasics;

public class Basics {
    void main() {

        String greeting = "Hello World!";
        System.out.println(greeting);

        String[] cars = {"Volvo", "BMW", "KIA"};
        System.out.println(cars[0]);
        cars[0] = "New Car";

        //Creating empty array
        String[] newArray = new String[4];
        newArray[0] = "Anuj";
        newArray[1] = "4Father";

        for (String s : newArray) {
            System.out.println(s);
        }


        //Access the character
        char a = greeting.charAt(0);
        System.out.println(a);

        //Comparing strings
        String text1 = "Hi";
        String text2 = "Hi";
        System.out.println(text1.equals(text2));

        //Concat
        System.out.println(text1.concat(text2));

        //Switch
        int value = 10;
        switch (value) {
            case 11:
                System.out.println("Value is 10");
                break;
            case 10:
                System.out.println("Value is 11");
                break;
            default:
                System.out.println("Value is default");
        }

        //While loop
        System.out.println("-----------While loop--------");
        int i = 0;

        while (i < 5) {
            System.out.println("Value is " + i);
            i++;
        }

        int j = 10;

        do {
            System.out.println("j is " + j);
            j--;
        } while (j > 5);

        //For loop
        System.out.println("----------For loop---------");
        for (int k = 0; k < 5; k++) {
            System.out.println("Value is " + k);
        }


    }
}