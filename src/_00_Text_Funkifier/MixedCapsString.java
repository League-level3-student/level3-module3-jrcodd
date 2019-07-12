package _00_Text_Funkifier;
public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);

	}
	@Override
	public String funkifyText(String s) {
String newString = "";
		
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(newString);
			if (i%2 == 1) {
				

				newString+= Character.toUpperCase(s.charAt(i));
			}
			else {
				newString+= Character.toLowerCase(s.charAt(i));
			}

		}
		
		this.s = newString;
		System.out.println(this.s);
		System.out.println(newString);
	
		return newString;
	}
}
