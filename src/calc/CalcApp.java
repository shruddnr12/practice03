package calc;

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
			
			Arith arith = null;
			
			String[] tokens = exp.split(" ");
			
			
			
			if("+".equals(tokens[1]))
			{
				arith = new Add();
				
			}
			
			else if("-".equals(tokens[1]))
			{
				arith  = new Sub();
				
			}
			else if("/".equals(tokens[1]))
			{
				arith = new Div();
				
				
			}
			else if("*".equals(tokens[1]))
			{
				arith = new Mul();
			
			}
			else
			{
				System.out.println("해당하는 연산이 없습니다.");
			}
			
			if(arith == null)
			{
				System.out.println("알수 없는 연산입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);
			arith.setValue(lValue, rValue);
			int result = arith.calculate();
			
		}
		
		
		
		scanner.close();
	}

}
