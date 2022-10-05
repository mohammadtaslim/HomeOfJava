package landOfJava;

public class learnLoopsOne {

	public static void main(String[] args) {
	
		int counter =0;
		
		for(int i =0;i<=20;i++) {
			System.out.println(i);
		if(i%7==0|i%6==6) {
			counter=counter+1;
			System.out.println(i);
			}
		}
		System.out.println("The occurance number is :" + counter);
		
   }

}
