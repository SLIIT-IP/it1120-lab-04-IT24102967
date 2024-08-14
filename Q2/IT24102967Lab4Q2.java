import java.util.Scanner;

public class IT24102967Lab4Q2{
       public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);

       System.out.println("Please enter exam marks (out of 100): ");
       double examMarks = sc.nextDouble();
       while (examMarks < 0 || examMarks > 100){ 
           System.out.println("Invalid input for exam marks.Terninating program. ");
       }
     
       System.out.println("Please enter lab submission marks (out of 100):");
       double labMarks = sc.nextDouble();
       while (labMarks < 0 || labMarks > 100){ 
           System.out.println("Invalid input for lab marks.Terninating program. ");
       }
  
       
       System.out.println("Please enter the percentage given for exam");
       double percentageforexam = sc.nextDouble();

       System.out.println("Please enter the percentage given for lab submission: ");
       double percentageforlab = sc.nextDouble();
       while (percentageforexam + percentageforlab !=100){
            System.out.print("The percenage must add up to 100.Terninating program. ");
       }

       double FinalMarks = (examMarks * percentageforexam/100) + (labMarks * percentageforlab/100);
       System.out.print("The Final Exam Mark is : "+FinalMarks);
       }
}
