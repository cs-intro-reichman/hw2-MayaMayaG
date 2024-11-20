// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int num = 2;
		int numberOfTimes = 1;
		int begin = 0;
	
	   for(int i=0;i<seed;i++)
	{
		begin = i + 1; 
	   
		if(mode.equals("v") == true)
		{
			System.out.print(begin +" ");
	
			while (num > 1)
			{
				if(begin % 2 == 0)
				{
					begin = begin/2;
					System.out.print(begin +" ");
					num = begin;
					numberOfTimes++;
				}
				else
				{
					begin = (begin*3) + 1;
					System.out.print(begin +" ");
					num = begin;
					numberOfTimes++;
				}
			}
			System.out.print("(" + numberOfTimes + ")");
			System.out.println();
		}
		else
		{    
			i = seed + 1;
		}
		numberOfTimes = 1;
		num = 2;
	  }
	
	  System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
