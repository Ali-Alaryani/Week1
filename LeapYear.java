
public class LeapYear {


	public static void main(String[] args) {
		
		int LeapYear;
		LeapYear = 1984;
		
		if (LeapYear %100 != 0 && LeapYear% 4 == 0)
		{
			System.out.print(LeapYear+ " Leap yers");
		}
		else
		{
			System.out.print(LeapYear+ " Not Leap yers");
		}
		
	}

}