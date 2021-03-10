
public class Parrot {
	public static void main(String[] args) {
        //create a class instance
		Parrot parrot = new Parrot();
		
		//call your first method here
		parrot.talk();
		
		String[] words = {"Howdy", "Polly", "wanna", "cracker"};
	    parrot.repeat(words);
	    
	    int numOfCrackers = parrot.countCrackers(10, 11);
	    System.out.println(numOfCrackers);
    }


    //create your first method here
	public void talk() {
		System.out.println("Squawk");
	}
	
	public void repeat(String[] words) {
	//for each number from 0 to the length of the array 
		for(int i = 0; i<words.length; i++){
		    //get the element at the index specified by the current value of i and print it 
		    System.out.println(words[i]);
		}
	}
	public int countCrackers(int crackersGiven, int crackersStolen) {
	       return crackersGiven + crackersStolen;
	   }
}
