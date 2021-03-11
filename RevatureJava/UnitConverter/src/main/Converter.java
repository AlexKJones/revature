package main;

import java.util.Arrays;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args){
		
		// created scanner called in to accept input
		Scanner in = new Scanner(System.in);
		
		// setup selection keepers
		int menuSelection = 0;
		int volumeMenuSelection = 0;
		int distanceMenuSelection = 0;
		int usVimpSelection = 0;
				
		// creating menu items to choose from
		String[] menu = new String[]{"Please select an option:\n", "1. Volumetric Conversion\n", "2. Distance Conversion\n", "3. US Gallons vs Imperial Gallons\n", "4. Quit"};
		String[] volume = new String[] {"Please select an option:\n", "1. Cups to Teaspoons\n", "2. Cups to Tablespoons\n", "3. Teaspoons to Cups\n", "4. Teaspoons to Tablespoons\n", "5. Tablespoons to Cups\n", "6. Tablespoons to Teaspoons\n"};
		String[] distance = new String[] {"Please select an option:\n", "1. Miles to Kilometers\n", "2. Kilometers to Miles\n", "3. Feet to Meters\n", "4. Meters to Feet\n"};
		String[] usVimp = new String[] {"Please select an option:\n", "1. US Gallons to Imperial Gallons\n", "2. Imperial Gallons to US Gallons\n"};
		
		// while loop that breaks if menu selection is equal to 4
		while  (menuSelection != 4) {
			System.out.println(Arrays.toString(menu));
			menuSelection = in.nextInt();
			
			// volume choice
			if (menuSelection == 1) {
				System.out.println(Arrays.toString(volume));
				volumeMenuSelection = in.nextInt();
				
				if (volumeMenuSelection == 1) {
				System.out.println("How many cups would you like to convert to Teaspoons");
				int cups = in.nextInt();
				int teaspoons = cups * 48;
				System.out.println(cups + " cups is equal to " + teaspoons + " teaspoons.");
				}
				
				if (volumeMenuSelection == 2) {
					System.out.println("How many cups would you like to convert to tablespoons");
					int cups = in.nextInt();
					int tablespoons = cups * 16;
					System.out.println(cups + " cups is equal to " + tablespoons + " tablespoons.");
				}
				
				if (volumeMenuSelection == 3) {
					System.out.println("How many teaspoons would you like to convert to cups");
					float teaspoons = in.nextInt();
					float cups = teaspoons / 48;
					System.out.println(teaspoons + " teaspoons is equal to " + cups + " cups.");
				}
				
				if (volumeMenuSelection == 4) {
					System.out.println("How many teaspoons would you like to convert to tablespoons");
					float teaspoons = in.nextInt();
					float tablespoons = teaspoons / 38;
					System.out.println(teaspoons + " teaspoons is equal to " + tablespoons + " tablespoons.");
				}
				
				if (volumeMenuSelection == 5) {
					System.out.println("How many tablespoons would you like to convert to cups");
					float tablespoons = in.nextInt();
					float cups = tablespoons / 16;
					System.out.println(tablespoons + " tablespoons is equal to " + cups + " cups.");
				}
				
				if (volumeMenuSelection == 6) {
					System.out.println("How many tablespoons would you like to convert to Teaspoons");
					int tablespoons = in.nextInt();
					int teaspoons = tablespoons * 3;
					System.out.println(tablespoons + " tablespoons is equal to " + teaspoons + " teaspoons.");
				}
			}
			
			// Distance choice
			if (menuSelection == 2) {
				System.out.println(Arrays.toString(distance));
				distanceMenuSelection = in.nextInt();
				
				if (distanceMenuSelection == 1) {
					System.out.println("How many Miles would you like to convert to Kilometers");
					float miles = in.nextInt();
					float kilometers = miles * 1.609f;
					System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
				}
				
				if (distanceMenuSelection == 2) {
					System.out.println("How many Kilometers would you like to convert to Miles");
					float kilometers = in.nextInt();
					float miles = kilometers / 1.609f;
					System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
				}
				
				if (distanceMenuSelection == 3) {
					System.out.println("How many Feet would you like to convert to Meters");
					float feet = in.nextInt();
					float meters = feet / 3.281f;
					System.out.println(feet + " feet is equal to " + meters + " meters.");
				}
				
				if (distanceMenuSelection == 4) {
					System.out.println("How many Meters would you like to convert to Feet");
					float meters = in.nextInt();
					float feet = meters * 3.281f;
					System.out.println(meters + " meters is equal to " + feet + " feet.");
				}
			}
			
		    // Gallon choice
			if (menuSelection == 3) {
				System.out.println(Arrays.toString(usVimp));
				usVimpSelection = in.nextInt();
				
				if (usVimpSelection == 1) {
					System.out.println("How many US Gallons would you like to convert to Imperial Gallons");
					float us = in.nextInt();
					float imp = us / 1.201f;
					System.out.println(us + " US Gallons is equal to " + imp + " Imperial Gallons.");
				}
				if (usVimpSelection == 2) {
					System.out.println("How many Imperial Gallons would you like to convert to US Gallons");
					float imp = in.nextInt();
					float us = imp * 1.201f;
					System.out.println(imp + " Imperial Gallons is equal to " + us + " US Gallons.");
				}
			}
		}
		
	}
}
