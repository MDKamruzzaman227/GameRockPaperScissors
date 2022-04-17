import java.util.Scanner;
import java.util.Random;

public class GameRockPAperScissors {
    public static void main(String[] args){

        boolean cont=true;

            System.out.println(" Rock,Paper,Scissor Or Quit");
            System.out.println("Enter your name");
            Scanner name1=new Scanner(System.in);
            String player1=name1.nextLine();
            while(cont){
            System.out.println("Enter Choice! Rock,Paper,Scissor Or Quit");
            Scanner r=new Scanner(System.in);
            String choice=r.nextLine();
            Random rnd=new Random();
            int rnd_int=rnd.nextInt(3);
            switch(choice){
                case "Rock":
                    if(rnd_int==0){
                        System.out.println("Rock!we tied");
                        break;
                    }

                   else if(rnd_int==1){
                        System.out.println("Paper!I win");
                        break;
                    }

                   else if(rnd_int==2){
                        System.out.println("Scissor! I lost");
                        break;
                    }
                   case "Paper":
                       if(rnd_int==0){
                           System.out.println("Rock! I Lost");
                           break;
                       }
                       else if(rnd_int==1){
                           System.out.println("Paper!we Tied");
                           break;
                       }
                       else if(rnd_int==2){
                           System.out.println("Scissor! I win");
                           break;
                       }
                case "Scissor":
                    if(rnd_int==0){
                        System.out.println("Rock!I win" );
                        break;
                    }
                    else if(rnd_int==1){
                        System.out.println("Paper!I Lost");
                        break;
                    }
                    else if(rnd_int==2){
                        System.out.println("Scissor!We Tie");
                        break;
                    }
                case "Quit":
                        cont=false;
                        System.out.println("Game Quit");
                        break;
                default:
                    System.out.println("Make proper Chice");


            }




        }

    }
}
