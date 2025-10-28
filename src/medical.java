
import java.util.Scanner;

public class medical {

	private String med_name, med_comp, exp_date;
    private int med_cost, count;
    
    
    public medical(String med_name ,String med_comp, String exp_date, int med_cost, int count)
    {
    	
    	this.med_name = med_name;
    	this.med_comp = med_comp;
    	this.exp_date = exp_date;
    	this.med_cost = med_cost;
    	this.count = count;
    
    }
    
    public String getmedName()
    {
    	return med_name;
    }
    
    public String getmedComp()
    {
    	return med_comp;
    }
    
    public String getexp_date()
    {
    	return exp_date;
    }
    
    public int getmed_cost()
    {
    	return med_cost;
    }
    
    public int getmed_count()
    {
    	return count;
    }
    
    public void new_medi()
    {

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        med_name = input.nextLine();

        System.out.print("comp:-");
        med_comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        med_cost = input.nextInt();

        System.out.print("no of unit:-");
        count = input.nextInt();

    }

   public void find_medi()
    {
        System.out.println(med_name + "     \t" + med_comp + "    \t" + exp_date + "  \t" + med_cost+ "  \t" + count);
    }
	
}
