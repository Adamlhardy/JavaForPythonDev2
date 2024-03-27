package JavaForPythonDev2;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name = "Rogue";
    double GPA = 4.00;
    boolean isAVeteran;
    int luckyNumber = 7;
    Major major; // ComputerScience, Business, Psychology, Communications
    LocalDate dateOfBirth;

    public String toString(){
        return name + " " + major;
    }

    public String toString(String addionalsString) {
        return name + " " + major + " " + addionalsString;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }     
}
