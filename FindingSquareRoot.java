
public class FindingSquareRoot {
	
	public static void main(String[] args)
	{
		//SquareRoot using Babylonian Approximation. For other methods check https://en.wikipedia.org/wiki/Methods_of_computing_square_roots
		Scanner sc=new Scanner(System.in); 
    int number=sc.nextInt();
		double t;
		double sqrt=number/2;
		do{
			t=sqrt;
			sqrt=((t+(number)/t))/2;
		}while((t-sqrt)!=0);
		System.out.println(sqrt);
	}

}
