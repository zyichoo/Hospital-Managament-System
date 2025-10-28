
import java.util.Scanner;

public class doctor extends Person {
	
	 private  String did, dname, specilist, appoint, doc_qual;
	 private  int droom;
	
	 
	 public doctor(String did ,String dname, String specilist, String appoint, String doc_qual, int droom)
	    {
	    	
	    	this.setId(did);
	    	this.setName(dname);
	    	this.specilist = specilist;
	    	this.appoint =appoint;
	    	this.doc_qual=doc_qual;
	    	this.droom =droom;
	    
	    }
	 
	  public void newDoctor()

	    {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Id:-");
	        did = input.nextLine();
	        this.setId(did);

	        System.out.print("Name:-");
	        dname = input.nextLine();
	        this.setName(dname);

	        System.out.print("Specilization:-");
	        specilist = input.nextLine();

	        System.out.print("Work Time:-");
	        appoint = input.nextLine();

	        System.out.print("Qualification:-");
	        doc_qual = input.nextLine();

	        System.out.print("Room No.:-");
	        droom = input.nextInt();

	    }

	    public void showDoctorInfo() {
	        System.out.println(this.getId() + "\t" + this.getName() + "  \t" + specilist + "       \t" +  appoint + "    \t" + doc_qual + "       \t" + droom);
	    }
	 
}
