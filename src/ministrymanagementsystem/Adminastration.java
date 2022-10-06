
package ministrymanagementsystem;

public class Adminastration {
    
    void givingSalaries(Minister ab){
        if(ab.salary>50000)
            System.out.println("Ministers salary is" + " " + ab.salary);
    
    }
    void givingSalaryClearence(Minister s){
        if(s.salary>=70000)
            System.out.println("Salary given succesfully of" + " " + s.getName());
    }
    void givingSalaries(DeputyMinister ab){
        if(ab.salary>40000)
            System.out.println("Deputy Ministers salary is" + " " + ab.salary);
    
    }
    void givingSalaryClearence(DeputyMinister s){
        if(s.salary>=50000)
            System.out.println("Salary given succesfully of" + " " + s.name);
    }
    void givingSalaries(Assistant ab){
        if(ab.salary>20000)
            System.out.println("Assistants salary is" + " " + ab.salary);
    
    }
    void givingSalaryClearence(Assistant s){
        if(s.salary>=30000)
            System.out.println("Salary given succesfully of" + " " + s.name);
    }
    void givingSalaries(Driver ab){
        if(ab.salary>10000)
            System.out.println("Drivers salary is" + " " + ab.salary);
    
    }
    void givingSalaryClearence(Driver s){
        if(s.salary>=20000)
            System.out.println("Salary given succesfully of" + " " + s.name);
    }
}
