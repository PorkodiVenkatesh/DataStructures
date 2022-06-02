class GfG
 {
	String encode(String str)
	{
          String result = "";
        int i = 0;
        while (i < str.length()){
            int j = i+1;
            while(j < str.length()){
            	if(str.charAt(i) == str.charAt(j))
            		j++;
            	else
            		break;
            }
            int freq = j - i;
            result = result + str.charAt(i) + freq;
            i = j;
        }
        
          return result;
       
	}
	
 }
