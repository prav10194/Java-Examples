public class StringsDistance {
	
	public static void main(String[] args)
	{
		String a="string_one";
		char[] aa=a.toCharArray();
		String b="string_two";
		char[] bb=b.toCharArray();
		int i=0;
		int j=0;
		int count=0;
		
		while(i<aa.length && j<bb.length)
		{
				if(aa[i]==bb[j]){i=i+1;j=j+1;}
				else
				{
					count=count+1;
					if(aa.length>bb.length){i=i+1;}
					else
					{
						if(bb.length>aa.length){j=j+1;}
						else
						{
							i=i+1;
							j=j+1;
						}
					}
				}
		}
    
		if(i!=aa.length){count=count+Math.abs(i-aa.length);}
		if(j!=bb.length){count=count+Math.abs(j-bb.length);}
		System.out.println(count);
	}
}
