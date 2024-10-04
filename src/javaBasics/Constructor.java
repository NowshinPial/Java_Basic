package javaBasics;

public class Constructor {

    /* A constructor is a special type of method that is used to initialize an object. 
       A constructor has the same name as the class. A constructor can be public or private, 
       it also can have parameters or be empty. */
    
    public static void main(String[] args) {

        // Object created using the constructors
        Car mycar = new Car();
        Car2 yourcar = new Car2("red", "Sedan", 4);  // "Sedan" as type

        // Print out the values
        System.out.println("My car's color: " + mycar.colour);
        System.out.println("My car's model: " + mycar.model);
        System.out.println("Your car's type: " + yourcar.type);
    }

    // Constructor with no parameters
   static class Car {

        String colour;
        String model;

        public Car() {
            this.colour = "blue";
            this.model = "Toyota";
        }
    }

    static class Car2 {

        String type;  

        public Car2(String color, String type, int tireNumber) {
            this.type = type;
        }
    }
}
