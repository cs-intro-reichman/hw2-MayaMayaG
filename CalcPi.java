// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double pi = 0;
		double divisor = 1;
		double pi2 = 0;
		  
		  for(int i=0;i<num;i++)
		  {
			
			if (i % 2 == 0)
				{
					
					pi = pi + (1 / divisor);
					
				} 
				else 
				{
					pi = pi - (1 / divisor);
				}
				
				divisor =divisor+ 2;
			
		  }
		  
			pi = pi*4;
			pi2=Math.PI;
			System.out.println("pi according to Java: " + pi2);
			System.out.println("pi, approximated:     " + pi);
	}
}
