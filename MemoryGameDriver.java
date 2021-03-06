import java.util.*;

class MemoryGameDriver{
   public static void main(String argv[]){
      Scanner sc = new Scanner(System.in); 
      int choice1 = 0;
      int choice2 = 0;
      MemoryGame mg = new MemoryGame(); 
      mg.setUp(); 
      
      while (!mg.isWinner()){
         System.out.println("Choose your first card to flip:"); 
         choice1 = sc.nextInt(); 
         
         System.out.println("Choose your second card to flip:"); 
         choice2 = sc.nextInt(); 

         mg.takeTurn(choice1,choice2); 

      } 
      
      Player [] playerlist = mg.getPlayerList();
      if(playerlist[0].getMatchesWon() > playerlist[1].getMatchesWon()){
         System.out.println(playerlist[0].getName() + " won!");
      } else if (playerlist[0].getMatchesWon() == playerlist[1].getMatchesWon()) {
         System.out.println("You tied!");
      } else {
         System.out.println(playerlist[1].getName() + " won!");
      }
      
   } // main
} // class