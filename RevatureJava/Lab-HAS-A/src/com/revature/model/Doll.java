package com.revature.model;

public class Doll extends Toy {
	Outfit outfit = new Outfit();
	String eyeColor; 

	  //constructors
	  public Doll() {
	    this.eyeColor = "brown";
	    this.name = "Buddy";
	  }

	  public Doll(String name, String eyeColor){
	   super(name);
	    this.eyeColor = eyeColor;
	  }

	  //getters and setters
	  public String getEyeColor(){
	     return this.eyeColor;
	  }

	  public void setEyeColor(String eyeColor){
	     this.eyeColor = eyeColor;
	  }

	  //other methods
	  public void makeTalk(){
		  this.outfit.wear();
	     System.out.println("Hi everyone! I AM-A doll");
	     this.play();
	  }
}
