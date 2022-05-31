class Solution{
    int isdivisible7(String num){
        
        java.math.BigInteger holder = new java.math.BigInteger(num);
       if (holder.mod(java.math.BigInteger.valueOf(7)) == java.math.BigInteger.ZERO)
           return 1;
        else
            return 0;
        
    }
}
