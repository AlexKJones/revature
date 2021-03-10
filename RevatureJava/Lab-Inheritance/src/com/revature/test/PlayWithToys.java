package com.revature.test;

import com.revature.model.Doll;
import com.revature.model.ActionFigure;

public class PlayWithToys {
	
		   public static void main(String[] args) {
		      Doll doll = new Doll("Annabelle","blue");
		      System.out.println("Our doll "+doll.getName()
		                    +" has "+doll.getEyeColor()+" eyes.");
		      doll.play();
		      doll.makeTalk();
		      
		      ActionFigure action = new ActionFigure("Barry Allen", "Blue", "Speed");
		      action.beCool();
		      action.makeTalk();
		      action.play();
		      action.useSkill();
		   }
}
