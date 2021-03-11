package com.revature.model;

public class ActionFigure extends Doll {
	String projectile;
	String secretSkill;
	
	public ActionFigure() {
	    this.eyeColor = "red";
	    this.name = "RadicalDan";
	    this.projectile = "Lazer Bazooka";
	    this.secretSkill = "Promotes Violence!";
	  }

	public ActionFigure(String name, String eyeColor, String projectile){
	    this.name = name;
	    this.eyeColor = eyeColor;
	    this.projectile = projectile;
	  }

	public String getEyeColor(){
	     return this.eyeColor;
	  }

	public void setEyeColor(String eyeColor){
	     this.eyeColor = eyeColor;
	  }
	
	public void setProjectile(String projectile){
		this.projectile = projectile;
	  }
	
	public void beCool(){
	     System.out.println("I'm like if a Doll was Rad and Cool!");
	}   
    private void isCool(){
	     this.secretSkill = "Promotes Violence!";
	}

	public void useSkill() {
		System.out.println("Violent Resolutions to Problems Skill GOOOO!");	
	}
	public void makeTalk(){
	     System.out.println("Hi everyone! I AM AN ACTION FIGURE! -Plays Loud Guitar Riff-");
	}
	public void play(){
	     System.out.println("Try out my Battle Frisbee included in a different purchasable kit");
	}
}
