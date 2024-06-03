import java.util.Scanner;
class colors
{

	static Scanner sc = new Scanner(System.in);
	static String redbri = "\033[1;91m"; 
	static String reset="\u001B[0m";
	static String bold="\u001B[1m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String cyan="\u001B[36m";
	static String white="\u001B[37m";
	static String whitebg="\u001B[47m";
	static String black ="\u001B[30m";
	static String magent = "\u001B[95m";
	static final String ital = "\u001B[3m";
	//bright colors;

	static  String redbr = "\033[0;91m";  
    	static  String greenbr = "\033[0;92m"; 
    	static  String whitebr = "\033[0;97m";
	static String ul = "\u001B[4m";
}
abstract class template
{
	abstract void m1();
}
class User
{
	private String UserNameL = "mastan";
	private String PassWordL = "Mastan@2002";
	private String UserNameS = "";
	private String PassWordS;
	String getterUL()
	{
		return UserNameL;
	}
	void SetterPL(String a)
	{
		this.PassWordL=a;
	}
	String getterPL()
	{
		return PassWordL;
	}
	void SetterUS(String a)
	{
		this.UserNameS=a;
	}
	String getterUS()
	{
		return UserNameS;
	}
	void SetterPS(String a)
	{
		this.PassWordS=a;
	}
	String getterPS()
	{
		return PassWordS;
	}
}
class Login extends template
{
	static Scanner sc = new Scanner(System.in);
	static User obj1 = new User();
	void m1()
	{
		System.out.println(C.redbr+"\n\n\n					******************************************************\n");
		System.out.println(C.redbr+"					--------"+C.cyan+C.blink+C.ul+"WELCOME TO MOVIE TICKET BOOKING SYSTEM"+C.redbr+"--------\n");
		System.out.println(C.redbr+"					******************************************************");
	}
	void Any(String a)
	{
		switch(a)
		{
			case "1":
				System.out.print(C.redbri+"\n	Please Enter Username Or Enter 1.Back: "+C.whitebr);
				Login1();
				break;
			case "2":
				SignUp();
				break;
			case "3":
				System.out.print(C.redbri+"\n	Please Enter Username Or Enter 1.Back: "+C.whitebr);		
				Reset1();
				break;
			case "4":
				System.out.println("\n	Exit Successfull");
				System.exit(0);
			default:
				System.out.println(C.whitebr+"\n					Invalid Data Re-Enter any one of the Option Given Below       ");
				System.out.print("\n					1. Login   2.Signup  3. Reset Password  4. Exit :");
				Any(sc.next());
				break;
		}
	}
	void Login1()
	{
		String a = sc.next();
		if(a.equals(obj1.getterUL()) || a.equals(obj1.getterUS()))
		{
			System.out.print(C.redbri+"\n	Please Enter Password Or Enter 1.Back: "+C.whitebr);
			if(a.equals(obj1.getterUL()))
				Login2();
			else 
				Login3();
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Username Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Login1();
		}	
	}
	void Login2()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPL()))
		{
			System.out.println("\n	Login Successfull");
			Location loc = new Location();
			System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
			System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
			loc.m1(sc.next());
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Password Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Login2();
		}
	}
	void Login3()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPS()))
		{
			System.out.println("\n	Login Successfull");
			Location loc = new Location();
			System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
			System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
			loc.m1(sc.next());
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Password Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Login3();
		}
	}
	void SignUp()
	{
		System.out.print(C.redbri+"\n	Please Enter Username to Signup Or Enter 1.Back: "+C.whitebr);
		String a = sc.next();
		if(a.equals("1"))
		{
			log();
		}
		if(a.equals(obj1.getterUL())) 
		{
			System.out.println(C.redbri+C.blink+"\n	Invalid Existing Username"+C.whitebr);
			SignUp();
		}
		obj1.SetterUS(a);
		System.out.print(C.redbri+"\n	Please Enter Password to Signup Or Enter 1.Back: "+C.whitebr);
		String b = sc.next();
		if(b.equals("1"))
		{
			log();
		}
		obj1.SetterPS(b);
		System.out.println("\n	Signup Successfull");
		Any("1");
		Location loc = new Location();
		System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
		System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
		loc.m1(sc.next());
	}
	void Reset1()
	{
		String a = sc.next();
		if(a.equals(obj1.getterUL())||a.equals(obj1.getterUS()))
		{
			System.out.print(C.redbri+"\n	Enter Old Password Or Enter 1.Back: "+C.whitebr);
			if(a.equals(obj1.getterUL()))
				Reset2();
			else if(a.equals(obj1.getterUS()))
				Reset3();
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Username Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Reset1();
		}
	}
	void Reset2()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPL()))
		{
			System.out.print(C.redbri+"\n	Enter New Password Or Enter 1.Back: "+C.whitebr);
			String b = sc.next();
			if(b.equals("1"))
			{
				log();
			}
			obj1.SetterPL(b);
			System.out.println("\n	Password Reset Successfully");
			Location loc = new Location();
			System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
			System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
			loc.m1(sc.next());
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Old Password Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Reset2();
		}
	}
	void Reset3()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPS()))
		{
			System.out.print(C.redbri+"\n	Enter New Password Or Enter 1.Back: "+C.whitebr);
			String b = sc.next();
			if(b.equals("1"))
			{
				log();
			}
			obj1.SetterPL(b);
			System.out.println("\n	Password Reset Successfully");
			Location loc = new Location();
			System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
			System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
			loc.m1(sc.next());
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Old Password Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Reset3();
		}
	}
	void Back()
	{
		Location loc = new Location();
		System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
		System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
		loc.m1(sc.next());
	}
	void log()
	{
		System.out.println(C.whitebr+"\n					Please Enter any one of the Option Given Below       ");
		System.out.print("\n					1. Login   2.Signup  3. Reset Password  4. Exit: ");
		Any(sc.next());
	}
	void log1()
	{
		m1();
		log();
	}
	public static void main(String []args)
	{
		Login obj = new Login();
		obj.m1();
		obj.log();
	}
}
class Location
{
	static Scanner sc=new Scanner(System.in);
	static String Loc;
	void m1(String a)
	{
		switch(a)
		{
			case "1":
				System.out.println(C.blue+"\n		List of Movies in Hyderabad Location");
				this.Loc="Hyderabad";
				Moviename ob1 = new Moviename();
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Salaar\n			2. RRR\n			3. THE NUN\n			Enter: ");
				ob1.moviesH();
				break;
			case "2":
				System.out.println(C.blue+"\n		List of Movies in Mumbai Location");
				this.Loc="Mumbai";
				Moviename ob2 = new Moviename();
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Jailer\n			2. Animal\n			3. OG\n			Enter: ");
				ob2.moviesM();
				break;
			case "3":
				System.out.println(C.blue+"\n		List of Movies in Vizag Location");
				this.Loc="Vizag";
				Moviename ob3 = new Moviename();
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. LEO\n			2. Tiger-3\n			3. Jawan\n			Enter: ");
				ob3.moviesV();
				break;
			case "4":
				System.out.println("\n	Logout Successfull");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n	Invalid Input Please RE-Enter any one of the Option Given Below Or 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				m1(sc.next());
				break;
		}
	}

}
class Moviename
{
	static Scanner sc = new Scanner(System.in);
	static String mov;
	void moviesH()
	{
		switch(sc.next())
		{
			case "1":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. Prasad Imax or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="Salaar";
				Theatre ob1 = new Theatre();
				ob1.theatre1();
				break;
			case "2":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. Sudarshan 35mm or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="RRR";
				Theatre ob2 = new Theatre();
				ob2.theatre2();
				break;
			case "3":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. Prasad Imax or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="THE NUN";
				Theatre ob3 = new Theatre();
				ob3.theatre1();
				break;
			case "4":
				Location obj = new Location();
				System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				obj.m1(sc.next());
				break;
			case "5":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Data Please RE-Enter "+C.whitebr);
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Salaar\n			2. RRR\n			3. THE NUN\n			Enter: ");
				moviesH();
		}
	}
	void moviesM()
	{
		switch(sc.next())
		{
			case "1":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. PVR or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="Jailer";
				Theatre ob1 = new Theatre();
				ob1.theatre3();
				break;
			case "2":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. INOX or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="Animal";
				Theatre ob2 = new Theatre();
				ob2.theatre4();
				break;
			case "3":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. PVR or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="OG";
				Theatre ob3 = new Theatre();
				ob3.theatre3();
				break;
			case "4":
				Location obj = new Location();
				System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				obj.m1(sc.next());
				break;
			case "5":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Data Please RE-Enter "+C.whitebr);
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Jailer\n			2. Animal\n			3. OG\n			Enter: ");
				moviesM();
		}
	}
	void moviesV()
	{
		switch(sc.next())
		{
			case "1":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. MELODY or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="LEO";
				Theatre ob1 = new Theatre();
				ob1.theatre5();
				break;
			case "2":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. Cinepolis or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="Tiger-3";
				Theatre ob2 = new Theatre();
				ob2.theatre6();
				break;
			case "3":
				System.out.print(C.redbri+"\n		Please Enter Theatre 1. MELODY or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
				this.mov="Jawan";
				Theatre ob3 = new Theatre();
				ob3.theatre5();
				break;
			case "4":
				Location obj = new Location();
				System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				obj.m1(sc.next());
				break;
			case "5":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Data Please RE-Enter "+C.whitebr);
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. LEO\n			2. Tiger-3\n			3. Jawan\n			Enter: ");
				moviesV();
		}
	}
}
class Theatre
{
	static Scanner sc = new Scanner(System.in);
	static String the;
	void theatre1()
	{
		this.the="Prasad Imax";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("1");
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. Prasad Imax or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre1();
		}
	}
	void theatre2()
	{
		this.the="Sudarshan 35mm";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("1");
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. Sudarshan 35mm or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre2();
		}
	}
	void theatre3()
	{
		this.the="PVR";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("2");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. PVR or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre3();
		}
	}
	void theatre4()
	{
		this.the="INOX";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("2");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. INOX or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre4();
		}
	}
	void theatre5()
	{
		this.the="Melody";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("3");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. MELODY or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre4();
		}
	}
	void theatre6()
	{
		this.the="Cinepolis";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("3");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. Cinepolis or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre4();
		}
	}
}
class Timing
{
	static Scanner sc = new Scanner(System.in);
	static String date1;
	static String month1;
	static String show1;
	static int ticket1;
	static String s1;
	static String s2;
	static String s3;
	void date()
   	{
    	System.out.print(C.blue+"\n		Enter a date in the format dd(01-30) Or Enter 31.Back: "+C.whitebr);
    	String date = sc.next();
		switch(date)
		{
			case "01":
				this.date1=date;
				month();
				break;
			case "02":
				this.date1=date;
				month();
				break;
			case "03":
				this.date1=date;
				month();
				break;
			case "04":
				this.date1=date;
				month();
				break;
			case "05":
				this.date1=date;
				month();
				break;
			case "06":
				this.date1=date;
				month();
				break;
			case "07":
				this.date1=date;
				month();
				break;
			case "08":
				this.date1=date;
				month();
				break;
			case "09":
				this.date1=date;
				month();
				break;
			case "10":
				this.date1=date;
				month();
				break;
			case "11":
				this.date1=date;
				month();
				break;
			case "12":
				this.date1=date;
				month();
				break;
			case "13":
				this.date1=date;
				month();
				break;
			case "14":
				this.date1=date;
				month();
				break;
			case "15":
				this.date1=date;
				month();
				break;
			case "16":
				this.date1=date;
				month();
				break;
			case "17":
				this.date1=date;
				month();
				break;
			case "18":
				this.date1=date;
				month();
				break;
			case "19":
				this.date1=date;
				month();
				break;
			case "20":
				this.date1=date;
				month();
				break;
			case "21":
				this.date1=date;
				month();
				break;
			case "22":
				this.date1=date;
				month();
				break;
			case "23":
				this.date1=date;
				month();
				break;
			case "24":
				this.date1=date;
				month();
				break;
			case "25":
				this.date1=date;
				month();
				break;
			case "26":
				this.date1=date;
				month();
				break;
			case "27":
				this.date1=date;
				month();
				break;
			case "28":
				this.date1=date;
				month();
				break;
			case "29":
				this.date1=date;
				month();
				break;
			case "30":
				this.date1=date;
				month();
				break;
			case "31":
				new Login().Back();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Date"+C.whitebr);
				date();
		}
   	}
	void month()
	{
		System.out.print(C.blue+"\n		Enter a Month in the format MM(01-12) Or Enter 13.Back:"+C.whitebr);
		String mon = sc.next();
		switch(mon)
		{
			case "01":
				this.month1=mon;
				show();
				break;
			case "02":
				this.month1=mon;
				show();
				break;
			case "03":
				this.month1=mon;
				show();
				break;
			case "04":
				this.month1=mon;
				show();
				break;
			case "05":
				this.month1=mon;
				show();
				break;
			case "06":
				this.month1=mon;
				show();
				break;
			case "07":
				this.month1=mon;
				show();
				break;
			case "08":
				this.month1=mon;
				show();
				break;
			case "09":
				this.month1=mon;
				show();
				break;
			case "10":
				this.month1=mon;
				show();
				break;
			case "11":
				this.month1=mon;
				show();
				break;
			case "12":
				this.month1=mon;
				show();
				break;
			case "13":
				new Login().Back();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Month"+C.whitebr);
				month();
		}
	}
  	void show()
  	{
    	System.out.print(C.redbri+"\n		Select a show time OR Select 5. Back\n"+C.whitebr+"			1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\n			Enter: ");
		String x=sc.next();
    	switch(x)
   	 	{
    			case "1":System.out.println(C.blue+"\n			Selected show time is 11:00 AM"+C.whitebr);
				this.show1="11:00 AM";
				ticket();
				break;
    			case "2":System.out.println(C.blue+"\n			Selected show time is 2:00 PM"+C.whitebr);
				this.show1="2:00 PM";
				ticket();
				break;
   			case "3":System.out.println(C.blue+"\n			Selected show time is 6:00 PM"+C.whitebr);
				this.show1="6:00 PM";
				ticket();
				break;
    			case "4":System.out.println(C.blue+"\n			Selected show time is 9:00 PM"+C.whitebr);
				this.show1="9:00 PM";
				ticket();
				break;
			case "5":
				Location loc = new Location();
				System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				loc.m1(sc.next());
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n			Invalid Show Timing"+C.whitebr);
				show();
				break;
   		}
 	}
	void ticket()
	{	
		System.out.print(C.redbri+"\n		Please Enter Number of Tickets 1-3 Or 4. Back\n"+C.whitebr+"		Enter: ");
		String a = sc.next();
		if(a.equals("1") || a.equals("2") || a.equals("3"))
		{
			int b=0;
			if(a.equals("1")) b=1;
			if(a.equals("2")) b=2;
			if(a.equals("3")) b=3;
			this.ticket1=b;
			System.out.println("\n		Each Ticket Price : 100/-");
			switch(b)
			{
				case 1:
					seat(1);
					break;
				case 2:
					seat(1,1);
					break;
				case 3:
					seat(1,1,1);
					break;
			}
		}
		else if(a.equals("4"))
		{
			show();
		}
		else
		{
			System.out.println(C.redbri+C.blink+"\n		Invalid Number of Tickets"+C.whitebr);
			ticket();
		}
	}
	void seat(int a)
	{
		System.out.println("\t\t\t\t\t01  02  03  04\n\t\t\t\t\t05  06  07  08\n\t\t\t\t\t09  10  11  12\n\t\t\t\t\t13  14  15  16\n\t\t\t\t\t17  18  19  20\n\t\t\t\t\t21  22  23  24\n\t\t\t\t\t25  26  27  28\n\t\t\t\t\t29          30\n\n\n\t\t\t\t------------------------------\n");
		System.out.print(C.redbri+"\n		Enter seat number between 01-30 or 31. Back\n"+C.whitebr+"		Enter: ");
		String b = sc.next();
		switch(b)
		{
			case "01":
				this.s1="01";
				new food().order();
				break;
			case "02":
				this.s1="02";
				new food().order();
				break;
			case "03":
				this.s1="03";
				new food().order();
				break;
			case "04":
				this.s1="04";
				new food().order();
				break;
			case "05":
				this.s1="05";
				new food().order();
				break;
			case "06":
				this.s1="06";
				new food().order();
				break;
			case "07":
				this.s1="07";
				new food().order();
				break;
			case "08":
				this.s1="08";
				new food().order();
				break;
			case "09":
				this.s1="09";
				new food().order();
				break;
			case "10":
				this.s1="10";
				new food().order();
				break;
			case "11":
				this.s1="11";
				new food().order();
				break;
			case "12":
				this.s1="12";
				new food().order();
				break;
			case "13":
				this.s1="13";
				new food().order();
				break;
			case "14":
				this.s1="14";
				new food().order();
				break;
			case "15":
				this.s1="15";
				new food().order();
				break;
			case "16":
				this.s1="16";
				new food().order();
				break;
			case "17":
				this.s1="17";
				new food().order();
				break;
			case "18":
				this.s1="18";
				new food().order();
				break;
			case "19":
				this.s1="19";
				new food().order();
				break;
			case "20":
				this.s1="20";
				new food().order();
				break;
			case "21":
				this.s1="21";
				new food().order();
				break;
			case "22":
				this.s1="22";
				new food().order();
				break;
			case "23":
				this.s1="23";
				new food().order();
				break;
			case "24":
				this.s1="24";
				new food().order();
				break;
			case "25":
				this.s1="25";
				new food().order();
				break;
			case "26":
				this.s1="26";
				new food().order();
				break;
			case "27":
				this.s1="27";
				new food().order();
				break;
			case "28":
				this.s1="28";
				new food().order();
				break;
			case "29":
				this.s1="29";
				new food().order();
				break;
			case "30":
				this.s1="30";
				new food().order();
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Seat"+C.whitebr);
				seat(1);
		}
	}
	void seat(int a,int b)
	{
		System.out.println("\t\t\t\t\t01  02  03  04\n\t\t\t\t\t05  06  07  08\n\t\t\t\t\t09  10  11  12\n\t\t\t\t\t13  14  15  16\n\t\t\t\t\t17  18  19  20\n\t\t\t\t\t21  22  23  24\n\t\t\t\t\t25  26  27  28\n\t\t\t\t\t29          30\n\n\n\t\t\t\t------------------------------\n");
		System.out.print(C.redbri+"\n		Enter First seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String c = sc.next();
		switch(c)
		{
			case "01":
				this.s1="01";
				break;
			case "02":
				this.s1="02";
				break;
			case "03":
				this.s1="03";
				break;
			case "04":
				this.s1="04";
				break;
			case "05":
				this.s1="05";
				break;
			case "06":
				this.s1="06";
				break;
			case "07":
				this.s1="07";
				break;
			case "08":
				this.s1="08";
				break;
			case "09":
				this.s1="09";
				break;
			case "10":
				this.s1="10";
				break;
			case "11":
				this.s1="11";
				break;
			case "12":
				this.s1="12";
				break;
			case "13":
				this.s1="13";
				break;
			case "14":
				this.s1="14";
				break;
			case "15":
				this.s1="15";
				break;
			case "16":
				this.s1="16";
				break;
			case "17":
				this.s1="17";
				break;
			case "18":
				this.s1="18";
				break;
			case "19":
				this.s1="19";
				break;
			case "20":
				this.s1="20";
				break;
			case "21":
				this.s1="21";
				break;
			case "22":
				this.s1="22";
				break;
			case "23":
				this.s1="23";
				break;
			case "24":
				this.s1="24";
				break;
			case "25":
				this.s1="25";
				break;
			case "26":
				this.s1="26";
				break;
			case "27":
				this.s1="27";
				break;
			case "28":
				this.s1="28";
				break;
			case "29":
				this.s1="29";
				break;
			case "30":
				this.s1="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid First Seat Please RE-Enter"+C.whitebr);
				seat(1,1);
				break;
		}
		System.out.print(C.redbri+"\n		Enter Second seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String d = sc.next();
		switch(d)
		{
			case "01":
				this.s2="01";
				break;
			case "02":
				this.s2="02";
				break;
			case "03":
				this.s2="03";
				break;
			case "04":
				this.s2="04";
				break;
			case "05":
				this.s2="05";
				break;
			case "06":
				this.s2="06";
				break;
			case "07":
				this.s2="07";
				break;
			case "08":
				this.s2="08";
				break;
			case "09":
				this.s2="09";
				break;
			case "10":
				this.s2="10";
				break;
			case "11":
				this.s2="11";
				break;
			case "12":
				this.s2="12";
				break;
			case "13":
				this.s2="13";
				break;
			case "14":
				this.s2="14";
				break;
			case "15":
				this.s2="15";
				break;
			case "16":
				this.s2="16";
				break;
			case "17":
				this.s2="17";
				break;
			case "18":
				this.s2="18";
				break;
			case "19":
				this.s2="19";
				break;
			case "20":
				this.s2="20";
				break;
			case "21":
				this.s2="21";
				break;
			case "22":
				this.s2="22";
				break;
			case "23":
				this.s2="23";
				break;
			case "24":
				this.s2="24";
				break;
			case "25":
				this.s2="25";
				break;
			case "26":
				this.s2="26";
				break;
			case "27":
				this.s2="27";
				break;
			case "28":
				this.s2="28";
				break;
			case "29":
				this.s2="29";
				break;
			case "30":
				this.s2="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Second Seat Please RE-Enter"+C.whitebr);
				seat(1,1);
				break;
		}
		if(c.equals(d))
		{
			System.out.println(C.blink+"		Please Enter Different Seats"+C.whitebr);
			seat(1,1);
		}
		else
		{
			new food().order();
		}
	}
	void seat(int a,int b,int c)
	{
		System.out.println("\t\t\t\t\t01  02  03  04\n\t\t\t\t\t05  06  07  08\n\t\t\t\t\t09  10  11  12\n\t\t\t\t\t13  14  15  16\n\t\t\t\t\t17  18  19  20\n\t\t\t\t\t21  22  23  24\n\t\t\t\t\t25  26  27  28\n\t\t\t\t\t29          30\n\n\n\t\t\t\t------------------------------\n");
		System.out.print(C.redbri+"\n		Enter First seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String d = sc.next();
		switch(d)
		{
			case "01":
				this.s1="01";
				break;
			case "02":
				this.s1="02";
				break;
			case "03":
				this.s1="03";
				break;
			case "04":
				this.s1="04";
				break;
			case "05":
				this.s1="05";
				break;
			case "06":
				this.s1="06";
				break;
			case "07":
				this.s1="07";
				break;
			case "08":
				this.s1="08";
				break;
			case "09":
				this.s1="09";
				break;
			case "10":
				this.s1="10";
				break;
			case "11":
				this.s1="11";
				break;
			case "12":
				this.s1="12";
				break;
			case "13":
				this.s1="13";
				break;
			case "14":
				this.s1="14";
				break;
			case "15":
				this.s1="15";
				break;
			case "16":
				this.s1="16";
				break;
			case "17":
				this.s1="17";
				break;
			case "18":
				this.s1="18";
				break;
			case "19":
				this.s1="19";
				break;
			case "20":
				this.s1="20";
				break;
			case "21":
				this.s1="21";
				break;
			case "22":
				this.s1="22";
				break;
			case "23":
				this.s1="23";
				break;
			case "24":
				this.s1="24";
				break;
			case "25":
				this.s1="25";
				break;
			case "26":
				this.s1="26";
				break;
			case "27":
				this.s1="27";
				break;
			case "28":
				this.s1="28";
				break;
			case "29":
				this.s1="29";
				break;
			case "30":
				this.s1="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid First Seat Please RE-Enter"+C.whitebr);
				seat(1,1,1);
				break;
		}
		System.out.print(C.redbri+"\n		Enter Second seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String e = sc.next();
		switch(e)
		{
			case "01":
				this.s2="01";
				break;
			case "02":
				this.s2="02";
				break;
			case "03":
				this.s2="03";
				break;
			case "04":
				this.s2="04";
				break;
			case "05":
				this.s2="05";
				break;
			case "06":
				this.s2="06";
				break;
			case "07":
				this.s2="07";
				break;
			case "08":
				this.s2="08";
				break;
			case "09":
				this.s2="09";
				break;
			case "10":
				this.s2="10";
				break;
			case "11":
				this.s2="11";
				break;
			case "12":
				this.s2="12";
				break;
			case "13":
				this.s2="13";
				break;
			case "14":
				this.s2="14";
				break;
			case "15":
				this.s2="15";
				break;
			case "16":
				this.s2="16";
				break;
			case "17":
				this.s2="17";
				break;
			case "18":
				this.s2="18";
				break;
			case "19":
				this.s2="19";
				break;
			case "20":
				this.s2="20";
				break;
			case "21":
				this.s2="21";
				break;
			case "22":
				this.s2="22";
				break;
			case "23":
				this.s2="23";
				break;
			case "24":
				this.s2="24";
				break;
			case "25":
				this.s2="25";
				break;
			case "26":
				this.s2="26";
				break;
			case "27":
				this.s2="27";
				break;
			case "28":
				this.s2="28";
				break;
			case "29":
				this.s2="29";
				break;
			case "30":
				this.s2="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Second Seat Please RE-Enter"+C.whitebr);
				seat(1,1,1);
				break;
		}
		System.out.print(C.redbri+"\n		Enter Third seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String f = sc.next();
		switch(f)
		{
			case "01":
				this.s3="01";
				break;
			case "02":
				this.s3="02";
				break;
			case "03":
				this.s3="03";
				break;
			case "04":
				this.s3="04";
				break;
			case "05":
				this.s3="05";
				break;
			case "06":
				this.s3="06";
				break;
			case "07":
				this.s3="07";
				break;
			case "08":
				this.s3="08";
				break;
			case "09":
				this.s3="09";
				break;
			case "10":
				this.s3="10";
				break;
			case "11":
				this.s3="11";
				break;
			case "12":
				this.s3="12";
				break;
			case "13":
				this.s3="13";
				break;
			case "14":
				this.s3="14";
				break;
			case "15":
				this.s3="15";
				break;
			case "16":
				this.s3="16";
				break;
			case "17":
				this.s3="17";
				break;
			case "18":
				this.s3="18";
				break;
			case "19":
				this.s3="19";
				break;
			case "20":
				this.s3="20";
				break;
			case "21":
				this.s3="21";
				break;
			case "22":
				this.s3="22";
				break;
			case "23":
				this.s3="23";
				break;
			case "24":
				this.s3="24";
				break;
			case "25":
				this.s3="25";
				break;
			case "26":
				this.s3="26";
				break;
			case "27":
				this.s3="27";
				break;
			case "28":
				this.s3="28";
				break;
			case "29":
				this.s3="29";
				break;
			case "30":
				this.s3="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Third Seat Please RE-Enter"+C.whitebr);
				seat(1,1,1);
				break;
		}
		if(d.equals(e) || e.equals(f) || d.equals(f))
		{
			System.out.println(C.blink+"		Please Enter Different Seats"+C.whitebr);
			seat(1,1,1);
		}
		else
		{
			new food().order();
		}
	}
	String se(int a)
	{
		if(a==1)
			return s1+".";
		else if(a==2)
			return s1+", "+s2+".";
		else
			return s1+", "+s2+", "+s3+".";
	}
}
class food
{
	static Scanner sc = new Scanner(System.in);
	static int piz;
	static int co;
	void order()
	{
		System.out.print(C.blue+"\n\n		Enter 1. Order Food 2. Ticket Book 3. Back\n"+C.whitebr+"		Enter: ");
		switch(sc.next())
		{
			case "1":
				System.out.println("		Only one item is available");
				pizza();
				break;
			case "2":
				this.piz = 0;
				this.co = 0;
				new confirm().con();
				break;
			case "3":
				if(Timing.ticket1==1) new Timing().seat(1);
				else if(Timing.ticket1==2) new Timing().seat(1,1);
				else if(Timing.ticket1==3) new Timing().seat(1,1,1);
			default:
				System.out.println(C.blink+"		Invalid Data Plz Re-enter"+C.whitebr);
				order();
				break;
		}
	}
	void pizza()
	{
		System.out.print(C.redbri+"\n		Enter 1. Pizza  2. Back\n"+C.whitebr+"		Enter: ");
		String a = sc.next();
		if(a.equals("1"))
		{
			System.out.print(C.redbri+"\n		Enter Number of pizza you want (01-10) each 150/- Or 11. Back\n"+C.whitebr+"		Enter: ");
			String piz = sc.next();
			switch(piz)
			{
				case "01":
					this.piz=1;
					coup();
					break;
				case "02":
					this.piz=2;
					coup();
					break;
				case "03":
					this.piz=3;
					coup();
					break;
				case "04":
					this.piz=4;
					coup();
					break;
				case "05":
					this.piz=5;
					coup();
					break;
				case "06":
					this.piz=6;
					coup();
					break;
				case "07":
					this.piz=7;
					coup();
					break;
				case "08":
					this.piz=8;
					coup();
					break;
				case "09":
					this.piz=9;
					coup();
					break;
				case "10":
					this.piz=10;
					coup();
					break;
				case "11":
					pizza();
					break;
				default:
					System.out.println(C.redbri+C.blink+"		Range Exceeds Please Re-enter"+C.whitebr);
					pizza();
					break;
			}
		}
		else if(a.equals("2"))
		{
			order();
		}
		else
		{
			System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
			pizza();
		}
	
	}
	void coup()
	{
		System.out.println(C.blue+C.blink+"\n		Enter Food Coupons to get discount"+C.whitebr);
		System.out.print("		Enter 1. Available 2. No Coupons\n		Enter: ");
		switch(sc.next())
		{
			case "1":
				coup1();
				break;
			case "2":
				System.out.print("\n		Enter 1. Confirm Booking 2. Back\n		Enter: ");
				String a = sc.next();
				if(a.equals("1"))
				{
					new confirm().con();
				}
				else if(a.equals("2"))
				{
					pizza();
				}
				else 
				{
					System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
					coup();
				}
				break;
			default:
				System.out.println("		Invalid Data");
				coup();
		}
	}
	void coup1()
	{
		System.out.print(C.redbri+"\n		Enter Any one Coupon OR 1. Back\n"+C.whitebr+"		Enter: ");
		coupons obj = new coupons();
		String a = sc.next();
		if(a.equals(obj.gettera()))
		{
			System.out.println(C.yellow+C.blink+"\n		Congratulations you get 10% off on food items"+C.whitebr);
			System.out.print("\n		Enter 1. Confirm Booking 2. Back\n		Enter: ");
			String s = sc.next();
			if(s.equals("1"))
			{
				this.co=10;
				new confirm().con();
			}
			else if(s.equals("2"))
			{
				this.co=0;
				coup();
			}
			else
			{
				System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
				coup1();
			}
		}
		else if(a.equals(obj.getterb()))
		{
			System.out.println(C.yellow+C.blink+"\n		Congratulations you get 20% off on food items"+C.whitebr);
			System.out.print("\n		Enter 1. Confirm Booking 2. Back\n		Enter: ");
			String s = sc.next();
			if(s.equals("1"))
			{
				this.co=20;
				new confirm().con();
			}
			else if(s.equals("2"))
			{
				this.co=0;
				coup();
			}
			else
			{
				System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
				coup1();
			}
		}
		else if(a.equals("1"))
		{
			coup();
		}
		else
		{
			System.out.println(C.redbri+C.blink+"		Invalid Coupon Please Re-enter"+C.whitebr);
			coup1();
		}
	}
}
class confirm
{
	static Scanner sc = new Scanner(System.in);
	static String seat;
	static float cost;
	void con()
	{
		this.cost =  ((Timing.ticket1*100*15)/100+(Timing.ticket1*100)+((150*food.piz*(100-food.co))/100));
		System.out.println("\n		Net Payable =	"+C.yellow+cost+"/-"+C.whitebr);
		System.out.print("\n		Enter"+C.green+C.blink+" 1. GPAY"+C.blue+C.blink+" 2. Paytm"+C.purple+C.blink+" 3. Phonepe"+C.whitebr+" 4. Back\n		Enter: ");
		String a = sc.next();
		switch(a)
		{
			case "1":
				System.out.print("\n		Redirecting GPAY....");
				System.out.print("\n		Enter UPI Pin Or 1. Exit : ");
				this.seat = new Timing().se(Timing.ticket1);
				pin();
				break;
			case "2":
				System.out.print("\n		Redirecting Paytm....");
				System.out.print("\n		Enter UPI Pin Or 1. Exit : ");
				this.seat = new Timing().se(Timing.ticket1);
				pin();
				break;
			case "3":
				System.out.print("\n		Redirecting Phonepe....");
				System.out.print("\n		Enter UPI Pin Or 1. Exit : ");
				this.seat = new Timing().se(Timing.ticket1);
				pin();
				break;
			case "4":
				food.piz=0;
				food.co=0;
				new Login().Back();
				break;
			default:
				System.out.println("		Invalid Data Plz Re-enter");
				con();
				break;
		}
	}
	void pin()
	{
		String a = sc.next();
		if(a.equals("1"))
		{
			System.out.println(C.redbri+"		Payment Declined");
			System.exit(0);
		}
		else if(a.equals(new upi().getter()))
		{
			System.out.println(C.yellow+"						--------------------------------------------------------------");
			System.out.println(C.cyan+C.blink+"								CONGRATULATIONS BOOKING CONFIRMED"+C.whitebr);
			Ticket();
		}
		else 
		{
			System.out.println(C.redbri+C.blink+"		UPI Pin is Not Matched Please Re-enter"+C.whitebr);
			System.out.print("\n		Enter UPI Pin Or 1. Exit : "+C.whitebr);
			pin();
		}
	}
	void Ticket()
	{
		float cgst = (Timing.ticket1*100*15)/100;
		System.out.println(C.yellow+"						--------------------------------------------------------------"+C.whitebr);
		System.out.println("						Telugu / 2D / UA");
		System.out.println("						Location - "+C.redbri+Location.Loc+C.whitebr+", Movie - "+C.redbri+Moviename.mov+C.whitebr+", Theatre - "+C.redbri+Theatre.the+C.whitebr+".");
		System.out.println("						Date/Month- "+C.redbri+Timing.date1+C.whitebr+"/"+C.redbri+Timing.month1+C.whitebr+", Show Time- "+C.redbri+Timing.show1+C.whitebr+", Seat No- "+C.redbri+this.seat+C.whitebr);
		System.out.println(C.yellow+"						--------------------------------------------------------------"+C.whitebr);
		System.out.println("						No of Tickets: Each - 100/-  = "+Timing.ticket1+"*100 =			"+C.redbri+(Timing.ticket1*100)+"/-"+C.whitebr);
		if(food.piz!=0)
		{
			System.out.println("						Food items: Pizza Each - 150/- , No of Pizza: "+food.piz+"*150 =	"+C.redbri+(food.piz*150)+"/-"+C.whitebr);
		}
		if(food.co==10 || food.co==20)
		{
			System.out.println("						Discount Applied: "+food.co+" %"+" Food Cost =			"+C.redbri+((150*food.piz*(100-food.co))/100)+"/-"+C.whitebr);
			System.out.println("						Service Tax @ 15% =					"+C.redbri+cgst+"/-"+C.whitebr);
			System.out.println(C.yellow+"						--------------------------------------------------------------"+C.whitebr);
			System.out.println("						Total Cost =						"+C.redbri+(cgst+(Timing.ticket1*100)+((150*food.piz*(100-food.co))/100))+"/-"+C.whitebr);
		}
		else
		{
			System.out.println("						Discount Applied: 0 %"+" Food Cost =			"+C.redbri+(150*food.piz)+"/-"+C.whitebr);
			System.out.println("						Service Tax @ 15% =					"+C.redbri+cgst+"/-"+C.whitebr);
			System.out.println(C.yellow+"						--------------------------------------------------------------"+C.whitebr);
			System.out.println("						Total Cost =						"+C.redbri+(cgst+(Timing.ticket1*100)+(150*food.piz))+"/-"+C.whitebr);
		}
		System.out.println(C.yellow+"						--------------------------------------------------------------"+C.whitebr);
		System.out.println(C.blue+C.blink+"									THANKYOU FOR VISITING"+C.whitebr);
		System.exit(0);
	}
}
class coupons
{
	private String a = "food10";
	private String b = "food20";
	String gettera()
	{
		return a;
	}
	String getterb()
	{
		return b;
	}
}
class upi
{
	private String a = "1234";
	String getter()
	{
		return a;
	}
}