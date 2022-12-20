package Activity;
import java.util.Scanner;
public class activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		        method();

		    }

		    public static void method() {
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine();
		        String str = "";

		        str = input.contains("<data_type> <identifier> <assignment_operator> <value> <delimiter>")
		                || input.contains("<data_type> <identifier> <delimiter>") ? "Syntax is Correct!" : "Syntax is Correct!";

		        System.out.println(str);
		        sc.close();

		    }

		
		    }

		
	


