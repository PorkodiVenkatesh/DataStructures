class Solution{
    int isdivisible7(String num){
        
        java.math.BigInteger holder = new java.math.BigInteger(num);
       return (holder.mod(java.math.BigInteger.valueOf(7)) == java.math.BigInteger.ZERO) ?1:0;
        
    }
}
