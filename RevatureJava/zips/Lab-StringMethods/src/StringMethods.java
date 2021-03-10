
public class StringMethods {
	public static void main(String[] args) {
		   String str = "Pancakes";
		   String s = new String("Pancakes");
		   System.out.println(str.equals(s));
		   System.out.println(str == s);
		   
		   String butter = "Waffles";
		   String b = new String("Waffles");
		   System.out.println(butter.equals(b));
		   System.out.println(butter == b);
		   
		   String waf = "Pancakes";
		   System.out.println(waf.length());
		   String poppin = "supercalifragilisticexpialidocious";
		   System.out.println(poppin.length());
		   System.out.println(str.indexOf('a'));
		   System.out.println(poppin.indexOf('c'));
		   System.out.println(poppin.indexOf('z'));
		 }
}
