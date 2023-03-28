package MidtermExtracredit;

public class Day {
	
	   final static int SUN = 0;
       final static int MON = 1;
       final static int TUE = 2;
       final static int WED = 3;
       final static int THU = 4;
       final static int FRI = 5;
       final static int SAT = 6;
       private  int day;
       public Day() {
   		   		this.day = 0;
          }
       public Day(int day) {
				this.day = day;
       }
       
	public int getDay() {
		return day;
       }
       public void setDay(int day) {
		this.day = day;
       }
       
       public String printDay() {
    	   switch (this.day) 
           {
              case SUN:
                    return "Sunday";
              case MON:
                    return "Monday";
              case TUE:
                    return "Tuesday";
              case WED:
                    return "Wednesday";
              case THU:
                    return "Thursday";
              case FRI:
                    return "Friday";
              case SAT:
                    return "Saturday";
            }
              return "";
    	   }
       
       public int prevDay() {
    	  if (this.day==0) {
    		  return SAT;    		  
    	  }else {
    		 return (this.day-1) %7;
    	  }
    	   
	   }
       public int nextDay() {
    	   if (this.day==SAT) {
     		  return SUN;    		  
     	  }else {
     			 return (this.day+1)%7;
     	  }
   	   }
       
       public int addDays(int days) {
    	   return (this.day+days)%7;
    	   
       }
       

       
       


	
	

}
