import java.util.Scanner;
public class numbergame
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chances=10;
        int finals=0;
        boolean playagain=true;
        System.out.println("Welcome");
        System.out.println("You have "+chances+" to win the game");
        while(playagain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance "+(i+1)+" Enter your guess");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You won");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("Too low");
                }
            }
            if(guess==false){
                System.out.println("Sorry...You lost the chances.The number is"+rand);
            }
            System.out.println("Do you want to paly again");
            String pA=sc.next();
            playagain=pA.equalsIgnoreCase("y");
        }
        System.out.println("Hope you enjoyed it.Here's your score:"+finals);
    }
        public static int getrandN(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);
        }
}