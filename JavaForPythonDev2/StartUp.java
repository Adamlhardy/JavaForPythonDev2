package JavaForPythonDev2;

import java.time.LocalDate;

//import java.util.Scanner;

public class StartUp {

    public static void main(String[] args) {
        Student student = new Student();
        student.major = Major.COMPUTERSCIENCE;
        student.name = "Denim";
        student.dateOfBirth = LocalDate.of(2019, 12, 19);
        System.out.println(student);
        System.out.println(student.getAge());
        
        Student student2 = new Student();
        student2.major = Major.PSYCHOLOGY;
        student2.name = "Dennis";
        student2.dateOfBirth = LocalDate.of(2020, 5, 12);
        System.out.println(student2.toString("Amari"));
        System.out.println(student2.getAge());
        


        if(student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best");
        }

        //Having a lof of issues using the enum. I'm not sure where I deviated.
        Car car1 = new Car(CarMake.TOYOTA, CarModel.SEABRING, 2019);
        car1.horsePower = 14;
        car1.setCarStyle(CarStyle.COUPE);
        car1.setPowerType(PowerType.ELECTRIC);
        car1.setCarMake(CarMake.FORD);
        car1.Drive(140);
        car1.Honk();
        System.out.println(Car.numberOfCars);

        Car car2 = new Car(CarMake.KIA, CarModel.SELTOS, 2013);
        
        Car car3 = new Car(CarMake.NISSAN, CarModel.SONATA, 2024);
        car3.horsePower = 32;
        car3.Drive(195);
        System.out.println(car3.ConvertMilageToKilometers());

        System.out.println(car1.horsePower);
        System.out.println(car2.horsePower);
        System.out.println(car3.horsePower);
    }

    // public static double harmonic(int n) {
    //     int local = 0;
    //     System.out.println(local);
    //     System.out.println(classLocal);

    //     for(int i = 0; i < 3; i++) {
    //         int forLoopLocal = 1;
    //         System.out.println(forLoopLocal);
    //     }
        
    //     return n;

        
    // }

    //public static int returnVowels(int v) {
    //System.out.println("Enter any word and I will tell you how many vowels it contains, excluding 'y'");
    //Scanner bruce = new Scanner(System.in);
    //char[] charArray = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
    //for (int x = 0; x < bruce.length(); x++) {
        //if (bruce.contains(charArray))


//}
}
