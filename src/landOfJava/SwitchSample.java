package landOfJava;

public class SwitchSample {

	 
 public void sample (int w) {
			// input 7, 30,365, 60, or 24 only
			
		switch(w){
		case 7:
			System.out.println("A week");
			break;
		case 30:
			System.out.println("A month");
			break;
		default : System.out.println("May Day");
		}
      }
		
  public static void main (String[]args){
	
	SwitchSample Calender = new SwitchSample();
	Calender.sample(7);
	Calender.sample(30);
	Calender.sample(0);
	
}
	}
