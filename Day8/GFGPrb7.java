class Solution{
    int replaceBit(int N, int K){
        
        String binary = Integer.toBinaryString(N);
        
        //System.out.println(binary);
        StringBuffer sb = new StringBuffer(binary);
        
        String updatedBinary = "";
        
        //System.out.println(binary);
        
        if(K <=  binary.length()){
            Character charAtKthPos = binary.charAt(K-1);
            //sb.insert(K-1, '0');
            //sb.deleteCharAt(K);
            sb.setCharAt(K-1, '0');
            updatedBinary = sb.toString();
            
            return  Integer.parseInt(updatedBinary, 2);
        }
        else{
            return N;
        }

        
    }
}
