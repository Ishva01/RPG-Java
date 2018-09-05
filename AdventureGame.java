import java.util.Scanner;

public class AdventureGame
{

      public static int HealthA;
      public static int StrengthA;
      public static int SpeedA;
      public static int WisdomA;
      public static int Level = 1;
            
   public static void main( String[] args)
   {
      System.out.println("Welcome to [insert title here]");
      
      //Character Development
      System.out.println("Let's start off by creating your character. Enter your name here ==>   ");
      Scanner in = new Scanner (System.in);
      String name = in.nextLine();   
      
      System.out.println("Welcome " + name + "! Let's give you with some basic abilities...");
      System.out.println("Since you'll be going on this adventure you'll need to have some skill... choose: Archer, Hunter ,or Fighter ==>  ");
      String ability = in.nextLine();
      if(ability.indexOf("Archer") >= 0 || ability.indexOf("archer") >= 0)
         {
            HealthA = 10;
            StrengthA = 6;
            SpeedA = 8;
            WisdomA = 7;
                        
               System.out.println("You've created a level " + Level + " player with a Health of: " + HealthA + ", Strength of: " + StrengthA + ", and speed of: " + SpeedA);
         } 
         else if (ability.indexOf("Hunter") >= 0 || ability.indexOf("hunter") >= 0)
           {
                HealthA = 10;
                StrengthA = 9;
                SpeedA = 3;
                WisdomA = 5; 
                
               System.out.println("You've created a level " + Level + " player with a Health of: " + HealthA + ", Strength of: " + StrengthA + ", and speed of: " + SpeedA);
            }
        else if (ability.indexOf("Fighter") >= 0 || ability.indexOf("fighter") >= 0)
            {
                HealthA = 10;
                StrengthA = 5;
                SpeedA = 5;
                WisdomA = 5; 

               System.out.println("You've created a level " + Level + " player with a Health of: " + HealthA + ", Strength of: " + StrengthA + ", and speed of: " + SpeedA);
            }
        else
         { 
            HealthA = 10;
            StrengthA = 5;
            SpeedA = 5;
            WisdomA = 5; 

            System.out.println("Your defaulted to Fighter");
               System.out.println("You've created a level " + Level + " player with a Health of: " + HealthA + ", Strength of:" + StrengthA + ", and speed of:" + SpeedA);
         }
         
      System.out.println("");
      System.out.println("");
      
      // Start of game
      System.out.println("Let's begin our adventure...");
      
      System.out.println("One day you woke up in a forest with no memory of how you got there...");
      System.out.println("But you do know that you are a[n] " + ability);
      System.out.println("when you're walking the forest you will encounter a numerous amount of creatures that might attack you. ");
      System.out.println("Every time you defeat a creature you'll boost some of your abilities. Once you max all your abilities you will get leveled up!");
      System.out.println("Do you wish to continue your journey? If not leave while you can (Type Exit to end game)");
      String Exit = in.nextLine();
      if(Exit.indexOf("Exit") >= 0 || Exit.indexOf("exit") >= 0)
      {
    	  return;
      }
      
      
      
         
   
   }
}