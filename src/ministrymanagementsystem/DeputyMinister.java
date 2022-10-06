
package ministrymanagementsystem;


public class DeputyMinister implements Iwork{
    String name;
    private String designation;
    double salary;

    public void giving_duty() {
        System.out.println("Giving Duty in Ministry on behalf of Minister");
    
    }
    String attendingOnlineSeminar() {
        return "Attending online seminars with Minister";
    }
    DeputyMinister(String n, double s, String d){
        name=n;
        salary=s;
        designation=d;
    }
     String getDesignation(){
         return designation;
     }
     void setDesignation(String a){
         designation =a;
     }
}
