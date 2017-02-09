import java.util.Arrays;

public class HaystackNeedle {
	
	public static void main(String[] args)
	{
		String a="ABCDHJKLMDCBA";
		String b="ABCD";
		
    char[] aa=a.toCharArray();
		char[] bb=b.toCharArray();
    
    //Sorting Needle String with ASCII
		for(int k1=0;k1<bb.length-1;k1++)
		{
			for(int k2=k1+1;k2<bb.length;k2++)
			{
				if(bb[k1]>bb[k2]){char temp=bb[k1]; bb[k1]=bb[k2]; bb[k2]=temp;}
			}
		}
    
		int l=b.length();
		#String[] d;
		
		
		for(int i=0;i<a.length();i=i+1)
		{
			char[] a1=Arrays.copyOfRange(aa, i, i+l);
			
      //Sorting slice of array taken out.
      for(int k1=0;k1<l-1;k1++)
			{
				for(int k2=k1+1;k2<l;k2++)
				{
					if(a1[k1]>a1[k2]){char temp=a1[k1]; a1[k1]=a1[k2]; a1[k2]=temp; }
				}
				
			}
			//System.out.println(a1);
			
      //Comparing Needle with slice. 
			if (Arrays.equals(a1, bb))
			{
				System.out.println("Matched At: "+i);
			}
		}
		
		
	}

}
