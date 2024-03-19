package JavaForPythonDev2;

//import java.util.Scanner;

public class StartUp {
    static int classLocal;
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius " + circle.radius);
        
        //Circle circle2 = new Circle();
        System.out.println("Circle 2s radius " + circle.radius);

        circle.radius = 10;
        //System.out.println("Circle 2s radius " + circle.radius);

        int radius = 5;
        System.out.println("radius1 " + radius);

        int radius2 = radius;
        System.out.println("radius2 " + radius2);

        String name = "Adam";
        String name1 = "Adam";
        String name3 = "Benjamin";

        System.out.println("Are these names equal? " + name == name1);
        System.out.println(name == name1);

        System.out.println(name.toUpperCase());
        System.out.println(name1.replace(name1, name3));
    
        Student student = new Student();
        System.out.println(student.name);
        student.name = "Cyclops";
        System.out.println(student.name);
        //System.out.println(classLocal);

        
    }

    public static double harmonic(int n) {
        int local = 0;
        System.out.println(local);
        System.out.println(classLocal);

        for(int i = 0; i < 3; i++) {
            int forLoopLocal = 1;
            System.out.println(forLoopLocal);
        }
        
        return n;

        
    }

//public static int returnVowels(int v) {
    //System.out.println("Enter any word and I will tell you how many vowels it contains, excluding 'y'");
    //Scanner bruce = new Scanner(System.in);
    //char[] charArray = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
    //for (int x = 0; x < bruce.length(); x++) {
        //if (bruce.contains(charArray))


//}
}
