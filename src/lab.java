
import java.util.Scanner;

public class lab {
    private String facility;
    private int lab_cost;
    
    public lab(String facility ,int lab_cost)
    {
    	this.facility = facility;
    	this.lab_cost = lab_cost;
    }
    
    public String getfacility()
    {
    	return facility;
    }
    
    public int getlabcost()
    {
    	return lab_cost;
    }
    
    public void new_lab()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("lab:-");
        facility = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextInt();

    }

    public void lab_list()
    {
        System.out.println(facility + "\t\t\t" + lab_cost);

    
    }
}
