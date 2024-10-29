class Car {
    String make;
    int year;
    Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Year: " + year);
    }
}
 class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        myCar.displayDetails();
    }
}
