class CompareStrings
{
  public static void main(String[] args)
  {
      String compareString1="hello";
      String compareString2="elloh";
      char[] charCompareString2=compareString2.toCharArray();
		
      for(int i=0;i<compareString2.length();i++)
		{
			char[] w=new char[compareString2.length()];
			int j2=0;
			
      //adding characters from backwords and put it in front
      			for(int j1=compareString2.length()-i-1;j1<=compareString2.length()-1;j1++)
			{
				w[j2++]=charCompareString2[j1];
			}
      
      //adding the rest of the string
			for(int j1=0;j1<compareString2.length()-i-1;j1++)
			{
				w[j2++]=charCompareString2[j1];
			}
      
      //compare each iteration with original string
			if(Arrays.equals(compareString1.toCharArray(),w))
			{
			  System.out.println("\n"+String.valueOf(i)+" ");
			  System.out.println(w);
			}
		}
  }
}
