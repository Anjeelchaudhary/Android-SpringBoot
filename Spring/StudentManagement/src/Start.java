import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Well-come to Student Management Software");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			 System.out.println("Press 1 for adding Student");
			 System.out.println("Press 2 for deleting studnet");
			 System.out.println("Press 3 for displaying studnet");
			 System.out.println("Press 4 for exit");
			 int check = Integer.parseInt(br.readLine());
			 
			 if(check == 1) {
				 //for adding
			 }else if(check == 2) {
				 //for deleting
			 }else if(check == 3) {
				 //for display
			 }else if(check == 4) {
				 //for exit
				 break;
			 }else {
				 
			 }
		}
		System.out.println("Thankyou");
	}

}
