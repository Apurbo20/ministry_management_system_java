
package ministrymanagementsystem;

import java.util.ArrayList;

public class MinistryManagementSystem {

    public static void main(String[] args) {
        Minister dipu = new Minister("Dr. Dipu Moni", 70000, "(Education Minister)" );
        System.out.println(dipu.getName() + " " + dipu.designation);
        dipu.giving_duty();
        System.out.println(dipu.attendingOnlineSeminar());
        DeputyMinister mohibul  = new DeputyMinister("Mohibul Hasan Chowdhury", 50000, "(Deputy Education Minister)");
        System.out.println(mohibul.name + " " + mohibul.getDesignation());
        mohibul.giving_duty();
        System.out.println(mohibul.attendingOnlineSeminar());
        Assistant akbar  = new Assistant("Akbar Hossain", 30000, "(Ministers Assistant)", 11);
        System.out.println(akbar.name + " " + akbar.designation + " " + "EmpId=" + akbar.id);
        akbar.giving_duty(dipu);
        akbar.giving_duty(mohibul);
        akbar.setting_meeting(dipu);
        akbar.setting_meeting(mohibul);
        akbar.getBonus();
        akbar.dutyday();
        akbar.offday();
        System.out.println(akbar.attendingCalls());
        Driver jakir  = new Driver("Jakir Mia", 20000, "(Ministers Driver)", 12);
        System.out.println(jakir.name + " " + jakir.designation + " " + "EmpId=" + jakir.id);
        jakir.giving_duty(dipu);
        System.out.println(jakir.drivingsafely());
        Adminastration ad = new Adminastration();
        ad.givingSalaries(dipu);
        ad.givingSalaryClearence(dipu);
        ad.givingSalaries(mohibul);
        ad.givingSalaryClearence(mohibul);
        ad.givingSalaries(akbar);
        ad.givingSalaryClearence(akbar);
        akbar.getBonus();
        akbar.dutyday();
        akbar.offday();
        akbar.age = 27;
        akbar.qualification = "Honours Professional";
        akbar.adress = "Chittagong";
        akbar.displayInformation();
        ad.givingSalaries(jakir);
        ad.givingSalaryClearence(jakir);
        jakir.getBonus();
        jakir.dutyday();
        jakir.offday();
        jakir.age = 29;
        jakir.adress = "Cumilla";
        jakir.displayInformation();
        
        ArrayList<Contact> list = new ArrayList<>();
        
        list.add(new Contact("Dr. Dipu Moni", "Robi-0181912163142", "Airtel-01612163416"));
        list.add(new Contact("Mohibul Hasan Chowdhury", "Robi-0181912163143", "Airtel-01612163415"));
        list.add(new Contact("Akbar Hossain", "Robi-0181912163144", "Airtel-01612163414"));
        list.add(new Contact("Jakir Mia", "Robi-0181912163145", "Airtel-01612163413"));
        
        for(Contact ob : list){
            
            System.out.println("Contact:");
            System.out.println("Name: " +ob.name);
            System.out.println("Num1: " +ob.num1);
            System.out.println("Num2: " +ob.num2);
            
            System.out.println("-------------------------");
        }
    }
    
}
