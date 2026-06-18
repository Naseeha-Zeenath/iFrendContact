import java.util.*;
import java.time.LocalDate;

class Contact{
	private String contactId;
	private String name;
	private String phoneNo;
	private String company;
	private int salary;
	private String dob;
	
	Contact(){}
	
	Contact(String contactId, String name, String phoneNo, String company, int salary, String dob){
		this.contactId = contactId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.company = company;
		this.salary = salary;
		this.dob = dob;
	}
	
	public String toString(){
		return contactId+"\t\t"+name+"\t\t"+phoneNo+"\t\t"+company+"\t\t"+salary+"\t\t"+dob;		
	}
	
	public void setContactId(String contactId){
		this.contactId =contactId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setCompany(String company){
		this.company = company;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setDob(String dob){
		this.dob = dob;
	}
	
	public String getDob(){
		return dob;
	}
}
class iFRIEND{
	
	public static Contact[] cnt = new Contact[0];
	
	public static void increase(){
		Contact[] temp = new Contact[cnt.length + 1];
		
		for(int i =0; i<cnt.length; i++){
			temp[i] = cnt[i];
		}
		
		cnt = temp;
	}
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("	                      /$$ / $$$$$$$$/$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$    ");
		System.out.println("	                      |__/  $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$  ");
		System.out.println("	                       /$$  $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$  ");
		System.out.println("	                      | $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$  ");
		System.out.println("	                      | $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$  ");
		System.out.println("	                      | $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$  ");
		System.out.println("	                      | $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/  ");
		System.out.println("	                      |__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/   ");
		
		System.out.println('\n');
		
		System.out.println("   _____             _             _              ____                         _                   ");
		System.out.println("  / ____|           | |           | |            / __ \\                       (_)                 ");
		System.out.println(" | |      ___  _ __ | |_ __ _  ___| |_ ___      | |  | |_ __ __ _       _ __  _ ____ __ _ __     ");
		System.out.println(" | |     / _ \\| '_ \\| __/ _` |/ __| __/ __|     | |  | | `_/  _` |/ _` | '_ \\| |_  / _ \\ `__|    ");
		System.out.println(" | |____| (_) | | | | || |_| | |__| |_\\__ \\     | |__| | | | |_| | |_| | | | | |/ /  __/| |      ");
		System.out.println("  \\_____ \\___/|_| |_|\\__\\__,_|\\___|\\__|___/      \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___||_|      ");
		System.out.println("                                                             __/ |                               ");
		System.out.println("                                                            |___/                                ");
		
		System.out.println();
		System.out.println("========================================================================================================");
		System.out.println('\n');
		
		System.out.println("\t[1] Add Contacts");
		System.out.println("\t[2] Update Contacts");
		System.out.println("\t[3] Delete Contacts");
		System.out.println("\t[4] Search Contacts");
		System.out.println("\t[5] List Contacts");
		System.out.println("\t[6] Exit");
		
		System.out.print("\nEnter an option to continue -> ");
		int Option1 = input.nextInt();
		
		switch(Option1){
			case 1:
				addContacts();
				break;
			case 2:
				updateContacts();
				break;
			case 3: 
				deleteContacts();
				break;
			case 4:
				searchContacts();
				break;
			case 5:
				listContacts();
				break;
			case 6: 
				return;
		}
	}
	

//--------------------------add--------------------------------------//	
	
	public static void addContacts(){
		clearConsole();
		Scanner input = new Scanner(System.in);
		
		System.out.println("+--------------------------------------+");
		System.out.println("|       Add Contact to the list        |");
		System.out.println("+--------------------------------------+\n");
		
		char addOption = 'N';
		int num =1;
		do{
			increase();
			//-----------id---------------//
			String contactId = genarateId(num);
			System.out.println("\n "+contactId);
			System.out.println("=======\n");	
			
			//-----------name---------------//
			System.out.print("Name             : ");
			String name = input.next();
			
			//-----------phoeNo---------------//
			String phoneNo;
			do{
				System.out.print("Phone No         : ");
				phoneNo = input.next();
				
				if(!validatePhoneNO(phoneNo)){
					System.out.println("\t Invalid Phone number!\n");
					
				}
			}while(!validatePhoneNO(phoneNo));
			
			
			//-----------company---------------//
			System.out.print("Company          : ");
			String company = input.next();
			
			//-----------Salary---------------//
			int salary;
			do{
				System.out.print("Salary           : ");
				salary= input.nextInt();
				
				if(!validateSalary(salary)){
					System.out.println("\t Invalid salary!\n");
				}
			}while(!validateSalary(salary));
			
			
			//-----------dob---------------//
			String dob;
			do{
				System.out.print("B'Day(YYYY-MM-DD): ");
				dob = input.next();
				
				if(!validateDOB(dob)){
					System.out.println("\t Invalid B'Day!\n");
				}
			}while(!validateDOB(dob));
			
			
			//-----------end---------------//
			cnt[cnt.length-1] = new Contact(contactId,name,phoneNo,company,salary,dob);
			
			System.out.println("\n\t Contact has been added successfuly...");
			
			
			System.out.print("\n Do you want to add another contact (Y/N) : ");
			addOption = input.next().charAt(0);
			
			if(addOption=='Y' || addOption =='y'){
				num++;
			}else{
				clearConsole();
				main(null);
			}
			
		}while(addOption=='Y' || addOption =='y');
	}
	
	public static String genarateId(int num){
		return String.format("C%04d",num);	
	}
	public static boolean validateSalary(int salary){
		return (salary>=0);
	}
	public static boolean validatePhoneNO(String phoneNo){
		return ((phoneNo.length() == 10) && (phoneNo.charAt(0)=='0'));
	}
	
	public static boolean validateDOB(String dob){
		
		LocalDate localdate = LocalDate.parse(dob);
		int birthyear = localdate.getYear();
		
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		if(birthyear > 1926 && birthyear < currentYear){
			return true;
		}else{
			return false;
		}
	}
	
//--------------------------update--------------------------------------//		
	public static void updateContacts(){
		clearConsole();
		Scanner input = new Scanner(System.in);
		
		System.out.println("+--------------------------------------+");
		System.out.println("|          Update Contact              |");
		System.out.println("+--------------------------------------+");
		
		char Option = 'N';
			do{
			int index=searchingPart();
			if(index != -1){
				System.out.println("\nWhat do you want to update...");
				
				System.out.println("\t [1]Name           : ");
				System.out.println("\t [2]Phone No       : ");
				System.out.println("\t [3]Company Name   : ");
				System.out.println("\t [4]Salary         : ");
				
				System.out.print("\nEnter an option to continue -> ");
				int updateOption = input.nextInt();
				
				switch(updateOption){
					case 1:
						updateName(index);
						break;
					case 2:
						updatePhoneNo(index);
						break;
					case 3:
						updateCompany(index);
						break;
					case 4:
						updateSalary(index);
				}
			}
			
			System.out.print("\nDo you want to update another Contact (Y/N) : ");
			Option = input.next().charAt(0);
					
		}while(Option=='Y' || Option =='y');
		clearConsole();
		main(null);
	}
	public static void updateName(int index){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t Update Name ");
		System.out.println("\t=============");
		
		System.out.print(" Input new name : ");
		cnt[index].setName(input.next());
		
		System.out.println("\t Name has been updated succesfully....");
	}
	
	public static void updatePhoneNo(int index){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t Update Phone Number ");
		System.out.println("\t=============");
		
		
		String newPhoneNo;
		do{
			System.out.print(" Input new phone number : ");
			newPhoneNo= input.next();
				
			if(!validatePhoneNO(newPhoneNo)){
				System.out.println("\t Invalid Phone number!\n");	
			}
		}while(!validatePhoneNO(newPhoneNo));
		cnt[index].setPhoneNo(newPhoneNo);
		System.out.println("\t Phone number has been updated succesfully....");
		
	}
	
	public static void updateCompany(int index){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t Update Company ");
		System.out.println("\t================");
		
		System.out.print(" Input new Company : ");
		cnt[index].setCompany(input.next());
		
		System.out.println("\t Company has been updated succesfully....");
	}
	
	
	public static void updateSalary(int index){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t Update Salary ");
		System.out.println("\t================");

		
		int newSalary;
		do{
			System.out.print(" Input new Salary : ");
			newSalary= input.nextInt();
				
				if(!validateSalary(newSalary)){
					System.out.println("\t Invalid salary!\n");
				}
		}while(!validateSalary(newSalary));
	
		cnt[index].setSalary(newSalary);
		System.out.println("\t Salary has been updated succesfully....");
	}
	
	
//--------------------------------delete-------------------------------------//		
	
	public static void deleteContacts(){
		clearConsole();
		Scanner input = new Scanner(System.in);
		
		System.out.println("+--------------------------------------+");
		System.out.println("|          Delete Contact              |");
		System.out.println("+--------------------------------------+");
	
		
		int index=searchingPart();
		char Option = 'N';
		do{
		
		if(index == -1){
			System.out.println("\n\tContact not found...");
		}else{
			
			System.out.print("\nDo you want to delete this contact(Y/N) : ");
			char option = input.next().charAt(0);
			
			if(option == 'Y' || option == 'y'){
				
				for(int i = index; i< cnt.length-1;i++){
					cnt[i] = cnt[i+1];
				}
				Contact[] temp = new Contact[cnt.length-1];	
				for(int i = 0; i<temp.length; i++){
					temp[i] = cnt[i];
				}
			
				cnt = temp;
		
				
				System.out.println("\n\tContact deleted successfully...");
			}
		}
			
			System.out.print("\nDo you want to Delete another Contact (Y/N) : ");
			Option = input.next().charAt(0);
					
		}while(Option=='Y' || Option =='y');
		clearConsole();
		main(null);

	}
	
	
//------------------------------search---------------------------------------//	
	public static void searchContacts(){
		clearConsole();
		Scanner input = new Scanner(System.in);	
		
		System.out.println("+--------------------------------------+");
		System.out.println("|          Search Contact              |");
		System.out.println("+--------------------------------------+");
		
		char searchOption = 'N';
		
		do{
			searchingPart();
			System.out.print("\nDo you want to search another Contact (Y/N) : ");
			searchOption = input.next().charAt(0);
					
		}while(searchOption=='Y' || searchOption =='y');
		clearConsole();
		main(null);
		
	}
	
	public static int searchingPart(){
		Scanner input = new Scanner(System.in);	
		System.out.print("\nSearch Contact by Name or Phone Number : ");
		String searchOption = input.next();
		int index = -1;


		System.out.println("\nContact Id \t Name \t\t Phone No \t\tCompany \tSalary    \tDate of birth");	
		System.out.println("-----------------------------------------------------------------------------------------------------");
		for(int i=0; i<cnt.length; i++){
			if((cnt[i].getPhoneNo()).equals(searchOption) || (cnt[i].getName()).equals(searchOption)){
				System.out.println(cnt[i].toString());
				index = i;
			}
		}
		return index;
	}
	

//--------------------------list--------------------------------------//		
	public static void listContacts(){
		clearConsole();
		Scanner input = new Scanner(System.in);
				
		System.out.println("+--------------------------------------+");
		System.out.println("|            List Contacts             |");
		System.out.println("+--------------------------------------+\n");
		
		System.out.println("\t [1]Sorting by Name      : ");
		System.out.println("\t [2]Sorting by Salary    : ");
		System.out.println("\t [3]Sorting by Birthday  : ");
				
		System.out.print("\nEnter an option to continue -> ");
		int shortOption = input.nextInt();
				
		switch(shortOption){
			case 1:
				//shortByName();
				shortprint();
				break;
			case 2:
				shortBySalary();
				shortprint();
				break;
			case 3:
				shortByBirthday();
				shortprint();
		}
		
	}
	public static void shortBySalary(){
		Scanner input = new Scanner(System.in);
		System.out.println("+--------------------------------------+");
		System.out.println("|          Sorting by Salary           |");
		System.out.println("+--------------------------------------+\n");
		System.out.println("\t [1]Assending order    : ");
		System.out.println("\t [2]Dissending order    : ");
		System.out.print("\nEnter an option to continue -> ");
		int shortOption = input.nextInt();
		
		Contact[] temp = new Contact[cnt.length]; 
		temp[temp.length-1] = new Contact();
				
		switch(shortOption){
			case 1:
			
				for(int i =0; i<cnt.length; i++){
					temp[i] = cnt[i];
				}
				for(int i = temp.length - 1; i > 0; i--){
					for(int j = 0; j < i; j++){

						if(temp[j].getSalary() > temp[j + 1].getSalary()){

							Contact t = temp[j];
							temp[j] = temp[j + 1];
							temp[j + 1] = t;

						}
					}
				}
				break;
			case 2: 
				for(int i =0; i<cnt.length; i++){
					temp[i] = cnt[i];
				}
				for(int i = temp.length - 1; i > 0; i--){
					for(int j = 0; j < i; j++){

						if(temp[j].getSalary() < temp[j + 1].getSalary()){

							Contact t = temp[j];
							temp[j] = temp[j + 1];
							temp[j + 1] = t;

						}
					}
				}
				break;
		}
		cnt = temp;
		
	}
	
	public static void shortByBirthday(){
		Contact[] temp = new Contact[cnt.length]; 
		temp[temp.length-1] = new Contact();
		
		for(int i =0; i<cnt.length; i++){
			temp[i] = cnt[i];
		}
        
        for(int i = temp.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				//  Year
				if ((temp[j].getDob().charAt(0) > temp[j + 1].getDob().charAt(0))
				|| (temp[j].getDob().charAt(0) == temp[j + 1].getDob().charAt(0))
				&& (temp[j].getDob().charAt(1) > temp[j + 1].getDob().charAt(1))
				|| (temp[j].getDob().charAt(1) == temp[j + 1].getDob().charAt(1))
				&&(temp[j].getDob().charAt(2) > temp[j + 1].getDob().charAt(2))
				|| (temp[j].getDob().charAt(2) == temp[j + 1].getDob().charAt(2)
				&& (temp[j].getDob().charAt(3) > temp[j + 1].getDob().charAt(3)))) {

					Contact t = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = t;

				}
			}
		}
		
		cnt = temp;
	}
	
	public static void shortprint(){
		Scanner input = new Scanner(System.in);
		System.out.println("+------------+--------------+--------------+--------------+------------+--------------+");
		for(int i=0; i<cnt.length; i++){
			System.out.println(cnt[i].toString());
		}
		System.out.println("+------------+--------------+--------------+--------------+------------+--------------+");
		
		System.out.print("\nDo you want to List another method (Y/N) : ");
		char searchOption = input.next().charAt(0);
					
		if(searchOption=='Y' || searchOption =='y'){
			listContacts();
		}else{
			clearConsole();
			main(null);
		}
	}
//--------------------------clear console--------------------------------------//
	public final static void clearConsole(){ 
		try{
			final String os = System.getProperty("os.name");
			if(os.contains("Windows")) { 
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush(); 
			}
		}catch(final Exception e) { 
			e.printStackTrace();
			//Handle any exceptions. 
		}
	}

	
	
}

