import java.lang.*;

// Counting the number of digits in a number in O(1) Time Cmplexity

public class CountDigits
{
    
    public static int countDigits(int num) {
        
        int count = 0;
        
        // Math.log10() returns a "double" type value, so we need to type cast it to "int", to avoid lossy converion error
        count  = (int)Math.log10(num);  
        
        return count + 1;
    }
    
	public static void main(String[] args) {
		System.out.println("Number of Digits: " + countDigits(1677688));
	}
}
