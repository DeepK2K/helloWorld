package Day2;

public class frorLoop {

	public static void main(String[] args) {
		int j = 13;
		boolean flag=false;
		for (int i = 2; i <= j/2; i++) {
			 if(j%i==0){
				flag=true;
				 break;
			  
			  } 
			
				

			} 
		if (!flag) {
			System.out.println("the no is prime");
			}
		else
			System.out.println("the no is not prime");

		}

	}


