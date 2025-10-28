
import java.util.Scanner;

public class patient extends Person { 
	
 private  String pid, pname, disease, sex, admit_status;
 private int age;
 
 public patient(String pid ,String pname, String disease, String sex, String admit_status, int age)
 {
 	
 	this.setId(pid);
 	this.setName(pname);
 	this.disease = disease;
 	this.sex =sex;
 	this.admit_status=admit_status;
 	this.age =age;
 }
 
 

public void newPatient()

 {
     Scanner input = new Scanner(System.in);

     System.out.print("Id:-");
     pid = input.nextLine();
     this.setId(pid);
     
     System.out.print("Name:-");
     pname = input.nextLine();
     this.setName(pname);

     System.out.print("Disease:-");
     disease = input.nextLine();

     System.out.print("Sex:-");
     sex = input.nextLine();

     System.out.print("Admit_status:-");
     admit_status = input.nextLine();

     System.out.print("Age:-");
     age = input.nextInt();

 }

 public void ShowPatientInfo()
 {
 	System.out.println(this.getId() + "\t" + this.getName() + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
 }
 
 
}
