import java.util.Scanner;
public class CalStu{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects");
    int nSub = sc.nextInt();
    while(nSub <= 0) {
        System.out.println("Enter a valid number");
    }
    int totalmarks = 0;
    for(int i = 1; i<= nSub; i++) {     
        System.out.println("Enter marks for" + i + "out of 100");
        int marks = sc.nextInt();
        while(marks< 0 || marks>100) {
        	System.out.println("Please enter marks 0-100");
        }
        totalmarks += marks;
    }

    System.out.println("STUDENT RESULT");
    System.out.println("TOTAL MARKS" + totalmarks);
    int Avg = totalmarks/nSub;
    System.out.println("AVERAGE PERCENTAGE" + Avg);
    if(Avg >= 90 && Avg <= 100){
        System.out.println("Grade-S");
    }
    else if(Avg >= 70 && Avg <= 89){
        System.out.println("Grade-A");
    }
    else if(Avg >= 60 && Avg <= 79){
        System.out.println("Grade-B");
    }
    else if(Avg >= 50 && Avg <= 69){
        System.out.println("Grade-C");
    }
    else if(Avg >= 40 && Avg <= 59){
        System.out.println("Grade-D");
    }
    else if(Avg >= 30 && Avg <= 49){
        System.out.println("Grade-E");
    }
    else{
        System.out.println("Grade-U");
    }
    sc.close();
	}

}
