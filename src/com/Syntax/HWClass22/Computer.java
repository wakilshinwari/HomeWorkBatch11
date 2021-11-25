package com.Syntax.HWClass22;

public class Computer {
        /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
         */
        String name;
        String model;
        int  storage;

        Computer(String name, String model, int storage){

            this.name=name;
            this.model=model;
            this.storage=storage;
        }
        void displayQualityPicture(){
            System.out.println(name+" displays quality picture");
        }
        void runsOnAOperatingS(){
            System.out.println(name+ " runs on an operating system");
        }
    }
    class Apple extends Computer{
        Apple(String name, String model, int storage){
            super(name, model, storage);
        }
        void displayQualityPicture(){
            System.out.println("Apple computers display a better quality");
        }
        void runsOnAOperatingS(){
            System.out.println("Apply computers run on an MAC OS operating system");
        }
    }
    class Lenovo extends Computer{
        Lenovo(String name, String model, int storage){
            super(name, model, storage);
        }
        void displayQualityPicture(){
            System.out.println("Lenova computers display a better quality");
        }
        void runsOnAOperatingS(){
            System.out.println("Lenova computers run on an Windows operating system");
        }
    }
    class HP extends Computer{
        HP (String name, String model, int storage){
            super(name, model, storage);
        }
        void displayQualityPicture(){
            System.out.println("HP computers display a better quality");
        }
        void runsOnAOperatingS(){
            System.out.println("HP computers run on an Windows operating system");
        }
    }
    class Dell extends Computer{
        Dell (String name, String model, int storage){
            super(name, model, storage);
        }
        void displayQualityPicture(){
            System.out.println("Dell computers display a better quality");
        }
        void runsOnAOperatingS(){
            System.out.println("Dell computers run on an Windows operating system");
        }
    }

    class ComputerTester<computers> {
            Computer[] computers={new Apple("MacBook Pro 13.3", "AppleM1chip", 256), new HP("Linux Ubuntu",
                    "HP ENVY", 800), new Lenovo("Windows 10", "Lenova1", 600), new Dell("Windows 98", "intellDell", 800)};

    }
