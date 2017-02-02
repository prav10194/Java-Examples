import java.util.HashMap;

public class SumOfThreeArrays {
	
	public static void main(String[] args)
	{
		int a[]={1,2,3,4};
		int b[]={1,2,5,6};
		int k[]={4,20,1,2};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<k.length;i++)
		{
			hm.put(i, k[i]);
		}
		
		
		int sum1=14;
    
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{	
					if(hm.containsValue(sum1-(a[i]+b[j])))
					{
						System.out.println(a[i]+" "+b[j]+" "+(sum1-a[i]-b[j]));
					}
				}
			}
		}
	}
	
