package ifElseStatement;

public class SwitchStatment {

	public static void main(String[] args) {
		
		int  month = 9;
		
		String monthString;
		
		switch(month) {
		case 1:
			monthString ="Month : jan";
			break;
		case 2:
			monthString ="Month : fab";
			break;
		case 3:
			monthString = "Month : march";
			break;
		case 4:
			monthString = "Month : apr";
			break;
			default:
				monthString = "invalid month";
			break;
			
		}
        System.out.println(monthString);
	}

}
