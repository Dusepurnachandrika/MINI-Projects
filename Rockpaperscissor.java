import java.util.*;
public class Rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices ={"rock","paper","scissors"};
        String user;
        String computer;
        String playagain ="yes";
        do { 
           System.out.print("Enter your move (rock,paper,scissors): ");
        user = sc.nextLine().toLowerCase();
        if(!user.equals("rock") && !user.equals("paper")&& !user.equals("scissors")){
            System.out.println("invalid move");
        }
        computer = choices[random.nextInt(3)];
        System.err.println("computer choice: "+computer);
        if(user.equals(computer)){
            System.out.println("It's a Tie");
        }
        else if(user.equals("rock")&& computer.equals("paper")
        ||user.equals("paper")&& computer.equals("rock")||
        user.equals("scissors")&& computer.equals("paper") ){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }
        System.out.println("Want to play again (yes/no)");
        playagain =sc.nextLine().toLowerCase();

         
        } while (playagain.equals("yes"));
        
        System.out.println("Thanks for playing");
        
    }
}
