package com.qa.testdrivendevelopment;



public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and generates a 2-dimensional array. 
	 * The element value in the i-th row and j-th column of the array should be i*j.  <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1.  <br>
	 *   <br>
	 * For Example:  <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]]  <br>
	 * multiply(2,1) → [[0,0]]  <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays){
		int [][] numbers = new int [arrayLength][numOfArrays];
		
		for (int a =0; a<numbers.length; a++) {
			for (int b=0; b<numbers[a].length; b++) {
				numbers[a][b] = a+b;
			
		}	
		
	}
		return numbers;
	}
	
	/**
	 * Write a function that accepts a comma separated sequence of words as input and prints the words in a comma-separated
	 * sequence after sorting them alphabetically.
	 * 
	 * For Example:
	 * sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String [] sortAlphabetically(String [] wordSequence) {
		
	      String[] words = wordSequence;
	      int wordSize = words.length;
	      for(int i = 0; i < wordSize - 1; i++)
	      {
	         for(int j = i+ 1; j < words.length; j++)
	         {
	            if(words[i].compareTo(words[j]) > 0)
	            {
	               String words2 = words[i];
	               words[i] = words[j];
	               words[j] = words2;
	            }
	         }
	      }
	     return words;
	   }
	

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is 2468.
	 * 
	 * For Example:
	 * aPlus(5) → 6170
	 * aPlus(9) → 11106
	 */
	public int aPlus(int num) {
		int a= num*1;
		int b =num*11;
		int c =num*111;
		int d = num*1111;
		
		int answer = a+b+c+d;
		
				
		
		return answer;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and returns all the odd numbers as a string, separated by commas.
	 * If there are no odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should also be given in ascending order.
	 * 
	 * For Example:
	 * oddNum("1,2,3,4,5") → "1,3,5"
	 * oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
	    StringBuilder odd = new StringBuilder();
	   
	    for (int i = 0; i < allNums.length(); i++) {
	        char c = allNums.charAt(i);
	    
	        if (c%2!=0) 
	        {
	            odd.append(c +",");
	        }
	    }
	    return odd.toString();
	}
	
		
		

	/**
	 * Define a function that can accept two strings as input and returns the string of largest length 
	 * 
	 * If two strings have the same length, then the function should return both strings separated by a single space.
	 * In this case, the strings should be returned in the same order in which they were given.
	 * 
	 * For Example:
	 * longString("hi","hello") → "hello"
	 * longString("three", "two") → "three"
	 * longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		if(input1.length()>input2.length()) {
		return input1;
		}else if (input2.length()>input1.length()){
			return input2;
			
		}else if (input1.length()==input2.length()) {
			return (input1+ " " +input2);
		}	
		return "";
	}

	
	/**
	 * Given an email address person@company.com, and a parameter "person" or "company",
	 * write a function which returns the corresponding piece of information.
	 * Your function should ignore case.
	 * 
	 * For Example:
	 * email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft"
	 * email("Dave@amazon.com", "person") → "dave"
	 */
	public String email(String email, String parameter) {
		String name = parameter;
		String company = parameter;
		
		email =name+"@"+company+".com";
		
		if(parameter.startsWith(name)) {
			return name;
		}if (parameter.contains(company)){
			return company;
		}else {
			return null;
		}
		
		
	
		
	}

	/**
	 * 	The fibonacci sequence is the sum of the last two numbers, 
	 * 	with index 0 and 1 having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example:
	 * fibbonaci(0) → 0
	 * fibbonaci(1) → 1
	 * fibbonaci(2) → 1
	 * fibbonaci(3) → 2
	 * fibbonaci(4) → 3
	 * fibbonaci(5) → 5
	 * fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		{ 
		    if (num <= 1) 
		       return num; 
		    return fibonacci(num-1) + fibonacci(num-2); 
		    }
	}


	/**
	 * Write a function which, given a string input, returns a string which contains only the characters with odd indexes.
	 * 
	 * For Example:
	 * oddLetters("Sponge") → "pne"
	 * oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {


	    char[] array = input.toCharArray();

        int letter=0;           
        String odd = "";
        for(char ch : array){

            if(letter%2 != 0){
                odd = odd+ch;
           }
            letter++;
        }
        letter = 0;

		return odd;
}
		
	


	/**
	 * Write a function which solves the following puzzle.
	 * A farm has chickens and rabbits, and scanners are able to detect the number of heads and legs.
	 * How many chickens do we have, if we know the number of heads and legs?
	 * The values for 'heads' and 'legs' will be inputs.
	 * If there are no solutions to the puzzle, return null
	 * 
	 * For Example:
	 * chickenAndRabbits(35, 94) → 23
	 * chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		int rabbits =0;
		int chickens = 0;
		rabbits = legs/2 - heads;
		chickens = heads - rabbits;
		
		if (chickens >=0) {
			return chickens;
		}else {
			
		return null;
	}

	}
	/**
	 * Write a function which checks the validity of a credit card number.
	 * The function should return a boolean, True if the card is valid, or False if it is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria.
	 * - it must start with a 4, 5 or 6.
	 * - it must contain exactly 16 digits.
	 * - each digit must be 0-9 inclusive.
	 * - it may contain hyphens ("-"), to separate groups of 4 digits only, but it cannot contain any other characters.
	 * - it must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example:
	 * validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False
	 * validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False
	 * validCard("4444-0123-4567-8901") → False
	 * validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		String a ="-";
		String b = "4";
		String c ="5";
		String d ="6";
		
		
		if(cardNumber.contains(a)||cardNumber.startsWith(b)|| cardNumber.startsWith(c)|| cardNumber.startsWith(d)) {
		
		return true;
	}else {
		return false;
	}
}
}