package JavaBasics;

public class Methods {
    static void main(String[] args) {
        //Methods
        int addition = add(2, 4);
        System.out.println("Addition value is " + addition);
        int addition2 = add(2, 4, 6);
        System.out.println("Addition value is " + addition2);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

}
