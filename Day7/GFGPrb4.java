class Solution {

    public boolean isValid(String s) {
        
        
        if(s.endsWith(".")|| s.startsWith(".")) 
          return false;
          
        
        
        boolean result = false;
        
        String sArr[]  = s.split("\\.");
       // System.out.println(Arrays.toString(sArr));
        
        if(sArr.length != 4){
            return false;
        }
        
        for (int  i = 0; i < sArr.length; i++){
            String str = sArr[i]; //0000
            int strLen = str.length();
            if( strLen == 1 || strLen == 2 || strLen == 3){
                //leading with zeros
                if(strLen >= 2 && str.charAt(0) == '0')
                {
                    return false;
                }
                else{
                    try{
                    Integer n = Integer.parseInt(str);
                    if(n >= 0 && n <=255){
                        result = true;
                    }
                    else{
                        return false;
                    }
                    }
                    catch(NumberFormatException e){
                        //a.b.c.d
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        
           
        }
        
        
        return result;
           
    }
}
