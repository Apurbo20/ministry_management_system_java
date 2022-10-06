
package ministrymanagementsystem;


public class Assistant extends Employee{

    void giving_duty(Minister ab) {
        System.out.println("Taking care works of" + " " + ab.getName());
    }
    void giving_duty(DeputyMinister ab) {
        System.out.println("Taking care works of" + " " + ab.name);
    
    }
    void setting_meeting(Minister ab) {
        System.out.println("Scheduling meeting time of " + " " + ab.getName());
    }
    void setting_meeting(DeputyMinister ab) {
        System.out.println("Scheduling meeting time of " + " " + ab.name);
    
    }
    protected String attendingCalls() {
        return "Attending calls of Minister";
    }
    Assistant(String n, double s, String d, int i){
        name=n;
        salary=s;
        designation=d;
        id=i;
        
     }
    @Override
            void getBonus(){
                System.out.println("Assistants bonus is 7000 taka.");
            }
    @Override
            void offday(){
                System.out.println("Assistants off days are Friday & Saturday");
            }
    @Override
            void dutyday(){
                System.out.println("Assistants duty day is 22 days per month");
            }
            String adress;
            @Override
            void displayInformation(){
                System.out.println("Age: " +age);
                System.out.println("Qualification: " +qualification);
                System.out.println("Adress: " +adress);
        }
}
