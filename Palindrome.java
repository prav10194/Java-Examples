//Checks Palindrome of a String. 
//If it is an Integer, convert the Integer to String. 
//checkPalindrome=String.valueOf(yourIntegerVariable)

checkPalindrome="ABCDCBA";


int i=0; int j=checkPalindrome.length()-1;
		
    while(true)
		{
			if(i>=j)
			{
				System.out.println("Exists. ");
				break;
			}

			if(checkPalindrome.charAt(i)==checkPalindrome.charAt(j))
			{
				i++;
				j--;
			}
			else
      {
        System.out.println("Does not exist. ")
				break;
        }
		}
