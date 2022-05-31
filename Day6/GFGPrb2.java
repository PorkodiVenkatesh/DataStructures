class Solution{
    int isdivisible7(String num){
        
        java.math.BigInteger holder = new java.math.BigInteger(num);
		java.math.BigInteger seven  = java.math.BigInteger.valueOf(7);
		java.math.BigInteger rem = holder.mod(seven);
		
		if(rem == java.math.BigInteger.ZERO)
			return 1;
		else
			return 0;

        
    }
}
