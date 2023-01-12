package Lab06;

import java.util.Scanner;

public class TestLan6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Employee [] emp = new Employee[5];
        //Obj Sale 
        Employee   s1  = new  Sale ("Jame",15000.0,5000.0);
        Employee  s2 = new Sale("Bell", 20000.0, 8000.0);
        //Kept data in array
        Employee m = new Manager("Perter", 40000.0, "40-19");
        Employee p1 = new Programer("Ann",30000.0,new String[] {"Java","C"}, 0);
        Employee p2 = new Programer("Bank", 40000.0, new String [] {"Java , php , python"}, 0);
        emp[0] = s1;
        emp[1] = s2 ;
        emp[2] = m;
        emp[3] = p1 ;
        emp[4] = p2;
        for (int i = 0 ; i < 5 ; i++){
            System.out.println( emp[i].toString());
        }
        System.out.println("\n====================== Test 2 ========================\n");
        System.out.print("Enter number of person : ");

        int personNumber = kb.nextInt();
        Employee emp2 [] = new Employee[personNumber];
        Employee sale2 [] = new Sale[personNumber];
        Employee manager [] = new Manager[personNumber];
        Employee programer [] = new Programer[personNumber];
        
        for (int i  = 0 ; i < personNumber ; i++){
            System.out.print("Enter informaiton of person : "+"("+(i+1)+")"+": ");
            int typeOfPerson = kb.nextInt();
            System.out.print("type of person : " +typeOfPerson+"\n");
            if (typeOfPerson==1){
                System.out.print("Enter Employee information "+"("+(i+1)+")"+" [name , salary] : "+"\n");
                String nameEmp = kb.next(); 
                double salaryE = kb.nextDouble();
                emp2[i] = new Employee(nameEmp,salaryE);

            }
            else if (typeOfPerson == 2){
                System.out.print("Enter Sale information "+"("+(i+1)+")"+" [name , salary , commission] : "+"\n");
                String nameEmp = kb.next(); 
                double salaryE = kb.nextDouble();
                double commission = kb.nextDouble();
                sale2[i] = new Sale(nameEmp,salaryE,commission);
                emp2[i] = sale2[i];

            }
            else if (typeOfPerson == 3){
                System.out.print("Enter Manager information  "+"("+(i+1)+")"+" [name , salary , Park-No ] : "+"\n");
                String nameEmp = kb.next(); 
                double salaryE = kb.nextDouble();
                String parkNo = kb.next();
                manager[i] = new Manager(nameEmp,salaryE,parkNo);
                emp2[i] = manager[i];

            }
            else if (typeOfPerson == 4){

                System.out.print("Enter  Programer information "+"("+(i+1)+")"+" [name ,salary  , OT ] : "+"\n");
                String nameEmp = kb.next(); 
                double salaryE = kb.nextDouble();
                int ot = kb.nextInt();

                System.out.print("Enter number of Programing language : ");

                int proAbility = kb.nextInt();

                String [] proSkills = new String [proAbility];
                programer [i] = new Programer(nameEmp, salaryE,proSkills, ot);
            
                for (int k = 0 ; k < proAbility;k++){
                    System.out.print("Enter name : ");
                    String language =kb.next();
                    proSkills[k] = language;
                
                }
                emp2 [i] = programer[i];
                
            }
        }
        System.out.println("<===========Detail of person==========>");
        for(int i = 0 ; i  < personNumber ; i++){
            System.out.println();
            System.out.println(emp2[i].toString());
        }
    }
}
