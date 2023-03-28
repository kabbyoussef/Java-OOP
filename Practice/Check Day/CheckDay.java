package MidtermExtracredit;

public class CheckDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Day d= new Day();
		 d.setDay(1);//Monady
		 System.out.println("Today is : "+ d.printDay());
	
		 d.setDay(d.nextDay());//Tuesday
		 System.out.println("Next day: "+d.printDay());
		 
		 d.setDay(d.prevDay());//Monday
		 System.out.println("Previous Day : "+d.printDay());
		 
		 
	
		 System.out.println("current day: "+d.printDay());
		 
		 d.setDay(d.addDays(4));//adding 4 days
		 System.out.println("After adding 4 days");
		 System.out.println("day is: "+d.printDay());
		 
		 System.out.println("setting the day");
		 d= new Day(2);
		 System.out.println("day is: "+d.printDay());
		 
		 d.setDay(d.addDays(13));//adding 13 days
		 System.out.println("After adding 13 days");
		 System.out.println("current day: "+d.printDay());
	}

}
