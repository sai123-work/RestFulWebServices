package reverse;

public class Palindrom {
	public static void main(String[] args) {
		String input = "DAD";
		char[] temparray = input.toCharArray();
		int left= 0;
		int right = temparray.length - 1; 
        for(left=0;left<right;left++,right--){
        	char temp = temparray[left];
        	temparray[left] = temparray[right];
        	temparray[right]=temp;
         }
        String output = new String(temparray);
        if(input.equals(output)){
        	System.out.println("Input string is a palindrome");
        }else{
        System.out.println("Input string is not a palindrome");
        }
      
	}

}
