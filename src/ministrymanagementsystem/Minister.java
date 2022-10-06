
package ministrymanagementsystem;


public class Minister implements Iwork {
    private String name;
    String designation;
    double salary;

   public void giving_duty() {
        System.out.println("Giving Duty in Ministry");
    
    }
    String attendingOnlineSeminar() {
        return "Attending online seminars";
    }
    Minister(String n, double s, String d){
        name=n;
        salary=s;
        designation=d;
     }
          String getName(){
          return name;
      }
      void setName(String a){
          name =a;
      }

}
