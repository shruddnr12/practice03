package prob06;

import java.util.Scanner;



public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
		while( true ) {
			/*  코드를 완성 합니다 */
			String exp = scanner.nextLine();
			
			if(exp.equals("quit"))
			{
				break;
			}
			
			String[] tokens = exp.split(" ");
			
			if("+".equals(tokens[1]))
			{
				Add a = new Add();
				a.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]));
				System.out.println(a.calculate());
			}
			
			else if("-".equals(tokens[1]))
			{
				Sub s = new Sub();
				s.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]));
				System.out.println(s.calculate());
			}
			else if("/".equals(tokens[1]))
			{
				Div d = new Div();
				d.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]));
				System.out.println(d.calculate());
				
			}
			else if("*".equals(tokens[1]))
			{
				Mul m = new Mul();
				m.setValue(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[2]));
				System.out.println(m.calculate());
			}
			else
			{
				System.out.println("해당하는 연산이 없습니다.");
			}
			
			
			
		}
		
		scanner.close();

	}

}
