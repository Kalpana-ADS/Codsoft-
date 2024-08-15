import java.util.Scanner;
public class Gradecalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the no.of Subjects:");
        int subjects=sc.nextInt();
        int total=0;
        int avg;
        char Grade;
        for(int i=0;i<subjects;i++)
        {
            System.out.println("Enter marks of "+(i+1)+":  ");
            int marks=sc.nextInt();
            total+=marks;
        }
        avg=total/subjects;
        if(avg>=90){
            Grade='O';
        }
        else if(avg>=80){
            Grade='A';
        }
        else if(avg>=70){
            Grade='B';
        }
        else if(avg>=60){
            Grade='C';
        }
        else if(avg>=50){
            Grade='D';
        }
        else{
            Grade='E';
        }
        System.out.println("Total marks:"+total);
        System.out.println("Total Average:"+avg+"%");
        System.out.println("Student Grade:"+Grade);
    }
}