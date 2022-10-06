
package ministrymanagementsystem;

 public class Driver extends Employee  {

    void giving_duty(Minister cd) {
        System.out.println("Driving car of" + " " + cd.getName());
    
    }
    protected String drivingsafely() {
        return "Driving the car of vip safely";
    }
    Driver(String n, double s, String d, int i){
        name=n;
        designation=d;
        salary=s;
        id=i;
     }
     @Override
            void getBonus(){
                System.out.println("Drivers bonus is 7000 taka.");
            }
    @Override
            void offday(){
                System.out.println("Drivers off days are Friday & Saturday");
            }
    @Override
            void dutyday(){
                System.out.println("Drivers duty day is 22 days per month");
            }
            String adress;
            @Override
            void displayInformation(){
                System.out.println("Age: " +age);
                System.out.println("Adress: " +adress);
        }
}
