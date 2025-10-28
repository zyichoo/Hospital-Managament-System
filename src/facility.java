
import java.util.ArrayList;
import java.util.Scanner;

public class facility {
	private String fec_name;
	 medical m;
	 lab l;
	
	private ArrayList<staff> stafflist;
    
	public facility(String fec_name) {
		
		this.fec_name =fec_name;
		stafflist = new ArrayList<staff>();		
	}
	
     public facility(String fec_name, medical m, lab l) {
		
		this.fec_name =fec_name;
		this.m =m;
		this.l =l;
	}
	
	public String getFacName()
	{
		return fec_name;
	}
	
	 public void add_feci()

	  {

	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("facility:-");
	        fec_name = input.nextLine();
	         
	  }
	 
		public boolean addstaff(staff sta) { 
			
			if(stafflist.size() < 100)
			{		 
				if(!stafflist.contains(sta)) {
				stafflist.add(sta);
				sta.addfacility(this);	
			    }
				return true;
			}
			else
			     return false;
				
		 }
		

		public String getstaffNames() {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<stafflist.size(); i++)
				str.append(stafflist.get(i).getName() +"\n");
			return str.toString();
		}

	public void show_feci()
	    {
	        System.out.println(fec_name);
	    }
}
