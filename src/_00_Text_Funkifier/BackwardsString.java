package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		
		String newString = "";
		for (int j = s.length()-1; j >=0; j--) {
		
		newString +=s.charAt(j);
	
		
				}
		this.s=newString;
	}

	@Override
	public String funkifyText(String s) {
		
		return "";
	}

}
