package testCASE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class javaSample {
	
	public static void main(String[] args) {
		int arr1[] = {78,34,1,3,90,34,-1,-4,6,55,20,-65};
		// {-1,1,3,-4,6,20,34,34,55,-65,78,90}
		sortArray(arr1);
	}
	
	public static void fibonacci(int num) {
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		System.out.println("Fibonacci Series of "+num+" numbers:");
 
        for (int i = 1; i <= num; ++i)
        {
            System.out.println(previousNumber);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
	}
	
	public static void palindrome(int num) {
		int temp = num;
		
		int rev = 0;
		 while (num >0) {
			 int p = num%10;
			 rev = rev*10 + p;
			 num = num /10;
		 }
		 
		 if (temp == rev) {
			 System.out.println(temp +" is Palindrome");
		 }else {
			 System.out.println(temp +" is Not Palindrome");

		 }
	}
	
	public static void palindrome(String name) {
		boolean result = true;
		int length = name.length();
		for(int i=0; i < length/2; i++) {
			if(name.charAt(i) != name.charAt(length-i-1)) {
				result = false;
				break;
			}
		}
		 if (result) {
			 System.out.println(name +" is Palindrome");
		 }else {
			 System.out.println(name +" is Not Palindrome");

		 }
	}
	
	public static void primeNumber(int num) {
        boolean flag = false;
        int div=0;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                div=i;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number. divided by : "+div);
	}

	public static void swapTwoVariable(int num1, int num2) {
		System.out.println("Before");

		System.out.println("Num 1 : " + num1);
		System.out.println("Num 2 : " + num2);
		
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		
		System.out.println("After");

		System.out.println("Num 1 : " + num1);
		System.out.println("Num 2 : " + num2);

		
	}
	
	public static void sortArray(int[] arr) {
		
		int[] tArr = arr.clone();
		for (int i = 0; i < arr.length; i++)   
		{  
			if (arr[i]<0) {
				arr[i] = arr[i]*-1;
			}
		}
	
		
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		}  
		
		for (int i = 0; i < tArr.length; i++)   
		{ 
			if (tArr[i]<0) {
				
					for (int j = 0; j < arr.length; j++)   
					{
						if (tArr[i]*-1 == arr[j]) {
							arr[j] = arr[j]*-1;
							break;
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++)   
		{
			System.out.println(arr[i]);  
		}
		
		
}
	
	public static void factorial (int num) {
		int temp = 1;
		for ( int i = 1 ; i<=num ; i++) {
			temp = temp *i;
			
		}
		System.out.println(temp);  

	}
	
	public static void anagram (String s1, String s2) {
		
		if (s1.length() == s2.length()) {
			boolean flag = true;
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			 for (int i = 0; i < s1Array.length; i++) {
		            if (s1Array[i] != s2Array[i]) {
		            	flag = false;
		            break;
			 }
			 }
			 if (flag == true) {
		     		System.out.println(s1+" - "+s2+" is Anagram");  
			 }else {
		    		System.out.println(s1+" - "+s2+" Not Anagram");  
			 }

		}
		else {
    		System.out.println(s1+" - "+s2+" Not Anagram");  
		}
		
	}
	
	public static void pyramidPattern(String symbol,int num) {
		for ( int i = 1 ; i<=num ; i++) {
			
			for ( int j = 1 ; j<=num-i ; j++) {
				System.out.print(" ");
			}
			for ( int k = 1 ; k<=i ; k++) 	  {
				System.out.print(symbol+" ");
			}
			System.out.println("");
		}
	}
	public static void duplicate(String str) {
		
		
		char[] charArray = str.toCharArray();
		Set<Character> asSet = new HashSet<Character>();
		
		for ( char c : charArray) {
			
			asSet.add(c);
		}


		for ( char c : asSet) {
			int count  = 0;
			for (int i = 0; i < charArray.length ; i++) {
				if ( c == charArray[i]) {
					count++;
				}
			}
			if ( count > 1) {
				System.out.println(c + " - "+ count);	
			}
		}
		
			
	}
	
	public static void sampleTry() {
		int a =6;
		String name  = (a == 6) ? "Six" : "Other";
		System.out.println(name);
	}
	
}
