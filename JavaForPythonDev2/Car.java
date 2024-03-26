package JavaForPythonDev2;
enum PowerType {ELECTRIC, UNLEADED, DIESEL}
enum CarStyle {SEDAN, COUPE, TRUCK, SUV}
enum CarMake {TOYOTA, KIA, FORD, NISSAN}
enum CarModel {SELTOS, MUSTANG, SEABRING, SONATA}


public class Car {
    int horsePower;
    private PowerType powerType;
    private CarStyle carStyle;
    private CarMake carMake;
    private CarModel carModel;
    private double milage;
    static int numberOfCars;
    final int year;

    public double ConvertMilageToKilometers(){
        return milage * 1.609;
    }

    //this is a public getter/accessor
    public int getHorsePower(){
        return horsePower;
    }

    //this is a public setter/mutator
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }


    //this is a public getter/accessor
    public PowerType getPowerType(){
        return powerType;
    }

    //this is a public setter/mutator
    public void setPowerType(PowerType powerType){
        this.powerType = powerType;
    }


    //this is a public getter/accessor
    public CarStyle getCarStyle(){
        return carStyle;
    }

    //this is a public setter/mutator
    public void setCarStyle(CarStyle carStyle){
        this.carStyle = carStyle;
    }

    public CarMake getCarMake(){
        return carMake;
    }

    public void setCarMake(CarMake carMake){
        this.carMake = carMake;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel){
        this.carModel = carModel;
    }

    public Car (CarMake carMake, CarModel carModel, int year) {
        this.carMake = carMake;
        this.carModel = carModel;
        numberOfCars++;
        this.year = year;
    }

    // public String toString(){
    //     System.out.println();
    // }

    public void Drive(double addMilage){
        milage = addMilage + milage;
    }

    public void Honk(){
        System.out.println("HONK");
    }
}
