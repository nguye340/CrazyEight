/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.nguye340.controllers;

import java.util.Arrays;
import java.util.Collections;

import ca.sheridancollege.nguye340.beans.CrazyEights;

/**
 *
 * @author THinkers
 */
public class Generate {
     public int numberofCards = 52;
    
     CrazyEights deck[] = new CrazyEights[52];
      // CrazyEights deck1[] = new CrazyEights[7];
    
   
   public void generate(){
       int count=0;
   for(CrazyEights.Suits s : CrazyEights.Suits.values()){
    for(CrazyEights.Value v :CrazyEights.Value.values()){
     deck[count]= new CrazyEights(s,v);
     count++;
}
   }
 // List l= Arrays.asList(deck);
   Collections.shuffle(Arrays.asList(deck));
   }
     
  public void draw(){
      

  
}
}
