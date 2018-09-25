package func2lab;

//Danils Grics 161VDB001 (1 % 2 = 1. variant)

public class Solution {
	
	static long superDigit(long x) {
		
		Long temp = x;
		
	     if (temp.toString().length() == 1) return x;
	        else {
	        	
	            long sum = 0;
	            int dev = 10;
	            
	            do {
	                sum = sum + x % dev;
	                x = x / dev;
	                dev = dev * 10;
	            }
	            while (x != 0);
	            
	            return superDigit(sum);
	        }
	 }
}
