
import java.util.ArrayList;
import java.util.Scanner;

public class staff extends Person {
	   private String sid,sname, desg, sex;
	   private int salary;
	  
	   private ArrayList<facility> facilitylist;
	    	  
	   
	   public staff(String sid ,String sname, String desg, String sex, int salary)
	    {
	    	
	    	this.setId(sid);
	    	this.setName(sname);
	    	this.desg = desg;
	    	this.sex=sex;
	    	this.salary =salary;
	    	facilitylist = new ArrayList<facility>();	
	    }
	   
	   
	   
	   public boolean addfacility(facility c){      
			boolean success = true;
			if(facilitylist.size() < 20)
			{
			   if(!facilitylist.contains(c)) {
				facilitylist.add(c);
				success = c.addstaff(this);		
				if(!success)
					facilitylist.remove(c);		
			     }		
			return success;
			}
			else
				return false;
		}
	   
		public String getFacilityName() {  
			StringBuilder str = new StringBuilder();
			for(int i=0; i<facilitylist.size(); i++)
				str.append(facilitylist.get(i).getFacName());
			return str.toString();
		} 
	   
	   
	    public void new_staff()
	    {
	    	
	        Scanner input = new Scanner(System.in);

	        System.out.print("id:-");
	        sid = input.nextLine();
	        this.setId(sid);

	        System.out.print("name:-");
	        sname = input.nextLine();
	        this.setName(sname);

	        System.out.print("desigination:-");
	        desg = input.nextLine();

	        System.out.print("sex:-");
	        sex = input.nextLine();

	        System.out.print("salary:-");
	        salary = input.nextInt();
	    }

	   public void staff_info()

	    {
	        System.out.println( this.getId() + "\t" + this.getName()+ "\t" + desg + "     \t" + sex + "\t" + salary);
	    }






}

