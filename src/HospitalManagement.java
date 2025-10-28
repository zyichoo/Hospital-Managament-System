



import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Calendar;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HospitalManagement extends Application{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   launch(args);
		    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			System.out.println(dtf.format(now)); 
	 
			int count1 = 5, count2 = 5, count3 = 5, count4 = 5, count5 = 5, count6 = 5;

	        System.out.println("\n================================================================================================");
	        System.out.println("        	    *** Welcome to Hospital Management System(HMS) ***");
	        System.out.println("================================================================================================");
	        System.out.println("===================");
			System.out.println("Group Member Name:\nNgan Zhi Hong\nChoo Zhen Yi\nWong Zhen Zong");
			System.out.println("===================");
	       
	        Scanner input = new Scanner(System.in);

	        int selection;
	     
	        int Contition = 1;
	     
	        doctor[] d = new doctor[25];
	        for (int i = 0; i < 25; i++)
	            d[i] = new doctor(null, null, null, null, null, 0);
	        
	        d[0] = new doctor("462", "Dr.Ngan Zhi Hong", "ENT", "3-7AM", "MBBS,MD",22);
		    d[1] = new doctor("688", "Dr.Choo Zhen Yi", "Surgeon", "12-6AM", "MBBS,MD",53);
		    d[2] = new doctor("571", "Dr.Wong Zhen Zong", "Cardiology", "3-12AM", "MBBS,MS",43);
		    d[3] = new doctor("421", "Dr.Tan Ah Fatt", "Medicine", "11-2AM", "MBBS,Ms",40);
		    d[4] = new doctor("513", "Dr.Lim Choon Mun", "Medicine", "1-6AM", "MBBS,MS",60);
		    
		    
		    
		    patient[] p = new patient[100];
	    	for (int i = 0; i < 100; i++) {
	    	    p[i] = new patient(null, null, null, null, null, 0);
	    	}

	        p[0] = new patient("400", "Ngan Zhi Hong", "Hot", "Male", "y",21);
			p[1] = new patient("655", "Choo Zhen Yi", "Cold", "Male", "y",20);
			p[2] = new patient("432", "Wong Zhen Zong", "Malaria", "Male", "y",45);
			p[3] = new patient("562", "Kong Kah Kit", "Diabetes", "Male", "y",25);
			p[4] = new patient("154", "Chong Chi Yuan", "Mumps", "Female", "n",25);
			
			
			medical[] m = new medical[100];
			for (int i = 0; i < 100; i++) {
            m[i] = new medical(null, null, null, 0, 0);
			}
			
			m[0] = new medical("Corex", "Cino pvt", "9-5-16", 55, 8);
		    m[1] = new medical("Nytra", "Ace pvt", "4-4-15", 500, 5);
		    m[2] = new medical("Brufa", "Reckit", "12-7-17", 50, 56);
		    m[3] = new medical("Pride", "DDF pvt", "12-4-12", 1100, 100);
		    m[4] = new medical("Aspirin", "Bayer", "9-30-23", 5, 10);
		    
		    
		    lab[] l = new lab[20];
		    for (int i = 0; i < 20; i++) {
	            l[i] = new lab(null, 0);
		    }
		    
		    l[0] = new lab("X-ray ", 800);
			l[1] = new lab("CT Scan ", 1200);
		    l[2] = new lab("OR Scan" , 500);
			l[3] = new lab("Blood Bank", 50);
			l[4] = new lab("Pathology Lab", 60);
		    
		    
			
			facility[] f = new facility[20];
	    	for (int i = 0; i < 20; i++) {
	    	    f[i] = new facility(null);
	    	}
	
	    	f[0] = new facility("Ambulance");
			f[1] = new facility("Admit Facility ");
		    f[2] = new facility("Canteen");
			f[3] = new facility("Emergency");
			f[4] = new facility("Diagnostic");
			
			
			staff[] s = new staff[100];
	    	for (int i = 0; i < 100; i++) {
	    		 s[i] = new staff(null, null, null, null, 0);
	    	}

	    	s[0] = new staff("462", "Ngan Zhi Hong", "Worker", "Male", 8000);
		    s[1] = new staff("688", "Choo Zhen Yi", "Nurse", "Male", 8000);
		    s[2] = new staff("571", "Wong Zhen Zong", "security", "Male", 5000);
		    s[3] = new staff("224", "Tan Mun Xian", "Nurse", "Female", 4000);
		    s[4] = new staff("124", "Kong Xin Yi", "staff", "Female", 3000);
	    	
		    
		    
		    

	        while (Contition == 1) {
	            System.out.println("\n          MENU");
	            System.out.println("========================");
	            System.out.println("1. Doctor");
	            System.out.println("2. Patient");
	            System.out.println("3. Medicine");
	            System.out.println("4. Laboratories");
	            System.out.println("5. Facilities");
	            System.out.println("6. Staff");
	            System.out.println("========================");
	            System.out.print("Enter your choice: ");
	            selection = input.nextInt();
	            
	         

	            if (selection == 1) {
	                // Doctor Section
	                System.out.println("================================================================================================");
	                System.out.println("                      **DOCTOR SECTION**");
	                System.out.println("================================================================================================");
	                int C1 = 1;
 
			        while (C1 == 1) {
			            System.out.println("1. Add New Doctor");
			            System.out.println("2. Existing Doctors List");
			            System.out.print("Enter your choice: ");
			            int s1 = input.nextInt();

			            if (s1 == 1) {
			            	d[count1++].newDoctor();
			            	
			                System.out.println("Doctor added successfully!");
			            } else if (s1 == 2) {
			                System.out.println("================================================================================================");
			                System.out.println("Below are the Details of the Doctor!");
			                System.out.println("================================================================================================");
			                System.out.println("Id \t 	Name\t 	Specialist \tTiming \t 	Qualification \tRoom No.");
			                System.out.println("================================================================================================");
			                for (int j = 0; j < count1; j++)
		                    {
		                        d[j].showDoctorInfo();
		                    }
			            } else {
			                System.out.println("Invalid choice. Please enter 1 to add a new doctor or 2 to view the list.");
			            }

			            System.out.println("\nPress 1 for Return Back and Press 0 for Main Menu");
			            C1 = input.nextInt();
			        }
	                
	            } else if (selection == 2) {
	                // Patient Section
	                System.out.println("================================================================================================");
	                System.out.println("                     PATIENT SECTION");
	                System.out.println("================================================================================================");
	                int C2 = 1;
			    	
			    	while (C2 == 1) {
			    	    System.out.println("1. Add New Patient");
			    	    System.out.println("2. Existing Patient List");
			    	    System.out.print("Enter your choice: ");
			    	    int s1 = input.nextInt();

			    	    if (s1 == 1) {
			    	        p[count2++].newPatient();
			    	        
			    	        System.out.println("Patient added successfully!");
			    	    } else if (s1 == 2) {
			    	        System.out.println("================================================================================================");
			    	        System.out.println("Below are the Details of the Patient!");
			    	        System.out.println("================================================================================================");
			    	        System.out.println("Id \t Name \t 	Disease \tSex      Admit Status  Age");
			    	        System.out.println("================================================================================================");
			    	        for (int j = 0; j < count2; j++) {
			    	            p[j].ShowPatientInfo();
			    	        }
			    	    } else {
			    	        System.out.println("Invalid choice. Please enter 1 to add a new patient or 2 to view the list.");
			    	    }

			    	    System.out.println("\nPress 1 for Return Back and Press 0 for Main Menu");
			    	    C2 = input.nextInt();
			    	}

	            } else if (selection == 3) {
	            	
	            	// medical Section
	                System.out.println("================================================================================================");
	                System.out.println("                       MEDICAL SECTION");
	                System.out.println("================================================================================================");
	            	
	            	 int C3 = 1;
	            	 
				        while (C3 == 1) {
				            System.out.println("1. Add New Medical");
				            System.out.println("2. Existing Medical List");
				            System.out.print("Enter your choice: ");
				            int s1 = input.nextInt();

				            if (s1 == 1) {
				            	m[count3++].new_medi();
				            	
				                System.out.println("Medical added successfully!");
				            } else if (s1 == 2) {
				                System.out.println("================================================================================================");
				                System.out.println("Below are the Medical of the Doctor!");
				                System.out.println("================================================================================================");
				                System.out.println("Name    \t 	    Company     \t 	    exp_date \t    cost   \t count.");
				                System.out.println("================================================================================================");
				                for (int j = 0; j < count3; j++)
			                    {
			                        m[j].find_medi();
			                    }
				            } else {
				                System.out.println("Invalid choice. Please enter 1 to add a new medical or 2 to view the list.");
				            }

				            System.out.println("\nPress 1 for Return Back and Press 0 for Main Menu");
				            C3 = input.nextInt();
				        }
	            	
	            }else if (selection ==4) {
	            	
	            	// Lab Section
	                System.out.println("================================================================================================");
	                System.out.println("                       LAB SECTION");
	                System.out.println("================================================================================================");
	            	
	            	 int C4 = 1;
	            	 
				        while (C4 == 1) {
				            System.out.println("1. Add New Lab");
				            System.out.println("2. Existing Lab List");
				            System.out.print("Enter your choice: ");
				            int s1 = input.nextInt();

				            if (s1 == 1) {
				            	l[count4++].new_lab();
				            	
				                System.out.println("Lab added successfully!");
				            } else if (s1 == 2) {
				                System.out.println("================================================================================================");
				                System.out.println("Below are the Lab of the Doctor!");
				                System.out.println("================================================================================================");
				                System.out.println("Facility   \t         Cost  ");
				                System.out.println("================================================================================================");
				                for (int j = 0; j < count4; j++)
			                    {
			                        l[j].lab_list();
			                    }
				            } else {
				                System.out.println("Invalid choice. Please enter 1 to add a new Lab or 2 to view the list.");
				            }

				            System.out.println("\nPress 1 for Return Back and Press 0 for Main Menu");
				            C4 = input.nextInt();
				        }
	 
	            } else if (selection == 5) {
	                // Facility Section
	                System.out.println("================================================================================================");
	                System.out.println("                       FACILITY SECTION");
	                System.out.println("================================================================================================");
	                int C5 = 1;
	
			    	while (C5 == 1) {
			    	    System.out.println("1. Add New Facility");
			    	    System.out.println("2. Existing Facility List");
			    	    System.out.println("3. Add or display staff work in one facility ");
			    	    System.out.println("4. display medical and lab is part of the Facility ");
			    	    System.out.print("Enter your choice: ");
			    	    int s1 = input.nextInt();

			    	    if (s1 == 1) {
			    	        f[count5++].add_feci();
			    	        
			    	        System.out.println("Facility added successfully!");
			    	    } else if (s1 == 2) {
			    	        System.out.println("================================================================================================");
			    	        System.out.println("Below are the Details of the Facility!");
			    	        System.out.println("================================================================================================");
			    	        System.out.println("Hospital facility are");
			    	        System.out.println("================================================================================================");
			    	        for (int j = 0; j < count5; j++) {
			    	            f[j].show_feci();
			    	        }
			    	    }else if (s1==3) {
			    	    
			    	    	int choose, indexoffaci,indexofstaff;
	                    	
	                  	    Scanner input1 = new Scanner(System.in);
	              	        
	              	        System.out.print("Enter 1 (add) or  2 (display) :-");
	              	        choose = input1.nextInt();
	              	     
	              	        
	              	        if (choose == 1) {
	              	        	                           	
	                            System.out.println();
	        
	                            Scanner input2 = new Scanner(System.in);
	                          
	                            
	                            for (int j = 0; j < count6 ; j++) {
	                        		  System.out.print(j + ".");
	                                  s[j].staff_info();
	                            }
	                            
	                        	System.out.println();
	                          	System.out.println("add one staff work with one facility:");
	                          	indexofstaff= input2.nextInt();
	                            
	                            
	                          	System.out.println();
	                            for (int j = 0; j < count5; j++) {
	                          		  System.out.print(j + ".");
	                                    f[j].show_feci();
	                            }
	                          	  
	                          	System.out.println();
	                          	System.out.println("add one facility staff work with:");
	                          	indexoffaci= input2.nextInt();
	                             
	                             
	              	        	f[indexoffaci].addstaff(s[indexofstaff]);
	              	        	
	              	        	System.out.println("added successfully");
	              	        	
	              	        }
	              	        else if (choose ==2)
	              	        {
	              	        	int indexoffaci1;
	              	        	
	              	        	Scanner input3 = new Scanner(System.in);
	              	        	 
	              	        	System.out.println();
	                          	for (int j = 0; j < count5; j++) {
	                          	System.out.print(j + ".");
	                            f[j].show_feci();
	              	        	}
	                          	
	                          	
	              	        	System.out.println("Select and displays one facility staff work with :");
	                            indexoffaci1= input3.nextInt();
	                            System.out.println("Facility :");
	                            
	                            f[indexoffaci1].show_feci();
	                            System.out.println(f[indexoffaci1].getstaffNames());
	                            
	              	        
	                         }
	              	        
			    	    }  else if (s1 == 4) {
			    	    	
			    	        int  indexofmedical, indexoflab,indexoffaci2;
			    	        
			    	        Scanner input3 = new Scanner(System.in);
			    	        
			    	        System.out.println();
			    	        for (int j = 0; j < count3; j++) {
			    	        System.out.print(j + ".");
			                m[j].find_medi();
			                }
			    	    	
			    	        System.out.println("Select medical insert into facility:");
			    	        indexofmedical= input3.nextInt();
                           
			    	        System.out.println();
			    	        for (int j = 0; j < count4; j++) {
				    	    System.out.print(j + ".");
				            l[j].lab_list();
				            }
				    	    	
				    	    System.out.println("Select lab insert into facility:");
				    	    indexoflab= input3.nextInt();
	                           
				    	    
				    	    System.out.println();
                          	for (int j = 0; j < count5; j++) {
                          	System.out.print(j + ".");
                            f[j].show_feci();
              	        	}
			    	    	
                            System.out.println("Select one facility:");
                            indexoffaci2= input3.nextInt();
                            
                            System.out.println();
                            f[indexoffaci2] = new facility(f[indexoffaci2].getFacName(), m[indexofmedical] , l[indexoflab]);
                            
                            System.out.println("------------Facility Details----------");
                            System.out.println("Facility Name: "+ f[indexoffaci2].getFacName());
                            System.out.println("------------Medical Details----------");
                            System.out.println("Name: "+ f[indexoffaci2].m.getmedName());
                            System.out.println("company: "+f[indexoffaci2].m.getmedComp());
                            System.out.println("Expiry date: "+f[indexoffaci2].m.getexp_date());
                            System.out.println("Cost: "+f[indexoffaci2].m.getmed_cost());
                            System.out.println("No of units: "+f[indexoffaci2].m.getmed_count());
                            System.out.println("------------lab  Details-------");
                            System.out.println("lab: "+f[indexoffaci2].l.getfacility());
                            System.out.println("Cost: "+f[indexoffaci2].l.getlabcost());
                           
                            
                          	
			    	    }
			    	    else {
			    	        System.out.println("Invalid choice. Please enter 1 to add a new facility or 2 to view the list.");
			    	    }

			    	    System.out.println("\nPress 1 for Return Back and Press 0 for Main Menu");
			    	    C5 = input.nextInt();
			    	}
	            } else if (selection == 6) {
	                // Staff Section
	                System.out.println("================================================================================================");
	                System.out.println("                       STAFF SECTION");
	                System.out.println("================================================================================================");
	                int C6 = 1;

			    	while (C6 == 1) {
			    	    System.out.println("1. Add New Staff");
			    	    System.out.println("2. Existing Staff List");
			    	    System.out.println("3. Add or display facility staff work with ");
			    	    System.out.print("Enter your choice: ");
			    	    int s1 = input.nextInt();

			    	    if (s1 == 1) {
			    	    	   s[count6++].new_staff();
			    	    	   
			    	        System.out.println("Staff added successfully!");
			    	    } else if (s1 == 2) {
			    	        System.out.println("================================================================================================");
			    	        System.out.println("Below are the Details of the Staff!");
			    	        System.out.println("================================================================================================");
			    	        System.out.println("Id \tName \t 	Position Gender  Salary");
			    	        System.out.println("================================================================================================");
			    	        for (int j = 0; j < count6; j++)
		                    {
		                         s[j].staff_info();
		                    }
			    	    } else if (s1==3)
			    	    {
                               int choose, indexoffaci,indexofstaff;
	                    	
	                  	       Scanner input1 = new Scanner(System.in);
	              	        
	              	           System.out.print("Enter 1 (add) or  2 (display) :-");
	              	           choose = input1.nextInt();
	              	     
	              	        
	              	        if (choose == 1) {
	              	        	                           	
	                               System.out.println();
	        
	                               Scanner input2 = new Scanner(System.in);
	                          
	                            
	                               for (int j = 0; j < count6 ; j++) {
	                        		  System.out.print(j + ".");
	                                  s[j].staff_info();
	                               }
	                            
	                               System.out.println();
	                               System.out.println("add one staff work with one facility:");
	                               indexofstaff= input2.nextInt();
	                            
	                            
	                          	   System.out.println();
	                               for (int j = 0; j < count5; j++) {
	                          		  System.out.print(j + ".");
	                                    f[j].show_feci();
	                               }
	                          	  
	                          	  System.out.println();
	                          	  System.out.println("add one facility staff work with:");
	                          	  indexoffaci= input2.nextInt();
	                             
	                          	  s[indexofstaff].addfacility(f[indexoffaci]);
	              	        	
	              	        	  System.out.println("added successfully");
	              	        	
	              	        }
	              	        else if (choose ==2)
	              	        {
	              	        	int indexofstaff1;
	              	        	
	              	        	Scanner input3 = new Scanner(System.in);
	              	        	 
	              	        	System.out.println();
	              	        	for (int j = 0; j < count6 ; j++) {
	                        		  System.out.print(j + ".");
	                                  s[j].staff_info();
	                             }
	                          	
	                          	
	              	        	System.out.println("Select and displays one staff work with facility :");
	              	        	indexofstaff1= input3.nextInt();
	                            System.out.println("Staff  work with   " + s[indexofstaff1].getFacilityName());
	                            
	                            s[indexofstaff1].staff_info();
	                            
	                            
	              	        
	                         }
			    	    	
			    	    	
			    	    }else {
			    	        System.out.println("Invalid choice. Please enter 1 to add a new staff or 2 to view the list.");
			    	    }

			    	    System.out.println("\nPress 1 for Return Back and Press 0 for Main Menu");
			    	    C6 = input.nextInt();
			    	
	            }
		
	            } else {
	                System.out.println("Please Enter A Valid Number!!!");
	            }

	            System.out.println("\nPress 1 for Return Back");
	            Contition = input.nextInt();
	        }
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane bp =new BorderPane();
		bp.setStyle("-fx-border-color: red");
		
		Text txt =new Text("Welcome to Hospital Management System");
		
		
		bp.setCenter(txt);
		
		Scene scene= new Scene(bp, 400 ,250);
		primaryStage.setTitle("Hospital Management System");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}