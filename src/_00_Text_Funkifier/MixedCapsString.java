package _00_Text_Funkifier;
public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
String newString = "";
		
		
		for (int i = 0; i < newString.length() - 1; i++) {
			System.out.println(newString);
			if (newString.charAt(i) == 'h' || newString.charAt(i) == 's' || newString.charAt(i) == 'i'
					|| newString.charAt(i) == 'l' || newString.charAt(i) == 'o' || newString.charAt(i) == 'a'
					|| newString.charAt(i) == 't') {

				newString+= Character.toUpperCase(s.charAt(i));
			}
			else {
				newString+= s.charAt(i);
			}

		}
		this.s = newString;
		System.out.println(s);
	}

	@Override
	public String funkifyText(String s) {

		return "";
	}
}
