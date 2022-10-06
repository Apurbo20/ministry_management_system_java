
package ministrymanagementsystem;


abstract public class Employee {
        String name;
        String designation;
        double salary;
        int id;
        int age;
        String qualification;
        
        abstract void getBonus();
        abstract void offday();
        abstract void dutyday();
        
        void displayInformation(){
            System.out.println("Age: " +age);
            System.out.println("Qualification: " +qualification);
        }
        
}
