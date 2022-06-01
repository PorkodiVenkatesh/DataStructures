class Solution{
    int isdivisible7(String num){
        java.math.BigInteger bigNum = new java.math.BigInteger(num);	
		java.math.BigInteger seven = new java.math.BigInteger("7");
	
		
		if(bigNum.mod(seven) == java.math.BigInteger.ZERO)
			return 1;
		else
			return 0;
		
     
        
    }
}
