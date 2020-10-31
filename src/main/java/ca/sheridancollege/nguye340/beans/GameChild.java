/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.nguye340.beans;

import java.util.Scanner;

import ca.sheridancollege.nguye340.Display;
import ca.sheridancollege.nguye340.controllers.Generate;

/**
 *
 * @author Thinkers
 */
public class GameChild extends Game{
    Player p1;
    Player p2;
  GroupOfCards gc = new GroupOfCards();
   Generate g = new Generate();
   CrazyEights arrr [] = new CrazyEights[7];
    public GameChild(String givenName) {
        super(givenName);
    }

    @Override
    public void play() {
      
        Scanner in = new Scanner(System.in);
        int i=0;
        while(NumberOfPlayer(i)==false){
        System.out.println("enter the number of players 2 0r 3(code for 3 players is not implemented yet)");
        
        i = in.nextInt();
        in.nextLine();
        }
        
        if(i==2){
              g.generate();
             // System.out.println(Arrays.toString(g.deck));
             System.out.println("RULES :");
                    System.out.println("1. To remove one card from your hand the card should match with the other card either by Rank or suit");
                    System.out.println("2. You cannot use removed card again");
                    System.out.println("3. You can draw two more cards(one at a time) from the availaible deck any time you need");
                    System.out.println("4. Both players, press 8 to end the game ");
            
             while(p1==null){
            System.out.println("enter the name of first player");
            String f = in.nextLine();
            if(UserName(f)){
         p1 = new Player(f);
            
              p1.setPlayerID(f);}
            else{
                System.out.println("Name should not contain any character");
                continue;
            }
             }
             while(p2==null){
         System.out.println("enter the name of second player");
            String s = in.nextLine();
            if(UserName(s)){
          p2 =new Player(s);
             p2.setPlayerID(s);
            }
            else{ System.out.println("Name should not contain any character");
            continue;}
             
             }
        
         
         
           
           System.out.println(" ---------------------------------- ");
             Display.myMethod();
             System.out.println(" ---------------------------------- ");
                
                
                
        }
        
        
        if(i==3){
            System.out.println("enter the name of first player");
            String f = in.nextLine();
           
        Player p3 =new Player(f);
         System.out.println("enter the name of second player");
            String s = in.nextLine();
          Player p4 =new Player(s);
          System.out.println("enter the name of thirdplayer");
            String s3 = in.nextLine();
              Player p5 =new Player(s3);
                System.out.println(" ---------------------------------- ");
             Display.myMethodfor();
             System.out.println(" ---------------------------------- ");
             
                       
               
        
        }
        // System.out.println(" experiment ");
        //System.out.println(Arrays.toString(gc.splitArrays(g.deck)));
        
     
    }

    @Override
    public void declareWinner() {
        if(Display.p1ID()){
        System.out.println(p1.getPlayerID() + " is Winner");
        }
        else if (Display.p2ID()){
        
         System.out.println(p2.getPlayerID() + "  is Winner");
        }
    }
    
    
    public static boolean UserName(String s){
      for(int i=0; i<s.length(); i++){
    if(!Character.isLetterOrDigit(s.charAt(i))){
    
    return false;}
    }
      return true;
    }
    
    public static boolean CardNo(int i){
        
    if(i>=0){
        
    return true;}
    
    return false;
    
    }
      public static boolean NumberOfPlayer(int i){
        
    if(i==2||i==3){
        
    return true;}
    
    return false;
   
    }
     
    
    
    
    
    
    
    
    
}
