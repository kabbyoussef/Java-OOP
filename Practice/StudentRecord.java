package classWork3;
//Youssef kabbouch
import java.util.Scanner;

public class StudentRecord {
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midterm;
	private double finalExam;
	private double overallScore ;
	private String grade;
	
	
	//constructor
    public StudentRecord()
    {   
        quiz1 = 0.0;
        quiz2 = 0.0;
        quiz3 = 0.0;
        midterm = 0.0;
        finalExam = 0.0;   
        overallScore=0.0;
        grade="";
    } 



// Start Setters and Getters
	public double getQuiz1() {
		return quiz1;
	}

	public void setQuiz1(double quizzes1) {
		if (quizzes1>=0 && quizzes1<=10)
		this.quiz1 = quizzes1;
		else {
			System.out.println("The Quiz1 grade should be between 0 and 10");
			System.exit(0);}
		
	}
	public double getQuiz2() {
		
		return quiz2;
	}
	public void setQuiz2(double quizzes2) {
		if (quizzes2>=0 && quizzes2<=10)
		this.quiz2 = quizzes2;
		else {
			System.out.println("The Quiz2 grade should be between 0 and 10");
			System.exit(0);}
	}
	public double getQuiz3() {
		return quiz3;
	}
	public void setQuiz3(double quizzes3) {
		if (quizzes3>=0 && quizzes3<=10)
		this.quiz3 = quizzes3;
		else {
			System.out.println("The Quiz3 grade should be between 0 and 10");
			System.exit(0);}
	}
	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterms) {
		if (midterms>=0 && midterms<=100)
		this.midterm = midterms;
		else {
			System.out.println("The Midterm grade should be between 0 and 100");
			System.exit(0);}
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(double finalExam) {
		if (finalExam>=0 && finalExam<=100)
		this.finalExam = finalExam;
		else {
			System.out.println("The Exam grade should be between 0 and 100");
			System.exit(0);}
	}
	public double getOverallScore() {
		double quizzes=((this.getQuiz1()+this.getQuiz2()+this.getQuiz3())/3)*10*0.25;
		double mid=this.getMidterm()*0.35;
		double finale=this.getFinalExam()*0.40;
		overallScore=quizzes+mid+finale;
	return overallScore;
}

	public String getGrade(double avg) {
	 if (avg >= 90)
     {
         return "A";
     }
     else if (avg < 90 && avg >= 80)
     {
         return "B";
     }
     else if (avg < 80 && avg >= 70)
     {
         return "C";
     }
     else if (avg < 70 && avg >= 60)
     {
         return "D";
     }
     else
     {
         return "F";
     }
}
	// End Setters and Getters


public String toString() {
	String str="Student record:\nQuiz 1:"+ this.getQuiz1()+", Quiz 2:"+this.getQuiz2()+", Quiz3:"+this.getQuiz3()+","
			+ " Midterm:"+this.getMidterm()+", Final:"+this.getFinalExam()+"\nOverall numeric grade:"
			+this.getOverallScore()+", Letter Grade:"+this.getGrade(getOverallScore());
	
	return str;
}









	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner R =new Scanner(System.in);
		StudentRecord std=new StudentRecord();
	
		System.out.print("Enter the student's score on the first quiz:");
		std.setQuiz1(R.nextDouble());
		System.out.print("Enter the student's score on the second quiz:");
		std.setQuiz2(R.nextDouble());
		System.out.print("Enter the student's score on the third quiz:");
		std.setQuiz3(R.nextDouble());
		System.out.print("Enter the student's score on the midterm:");
		std.setMidterm(R.nextDouble());
		System.out.print("Enter the student's score on the final:");
		std.setFinalExam(R.nextDouble());
//		System.out.println(std.getOverallScore());
//		System.out.println(std.getGrade(std.getOverallScore()));
		System.out.println(std.toString());
		
		
		
			  
			


	}

}
