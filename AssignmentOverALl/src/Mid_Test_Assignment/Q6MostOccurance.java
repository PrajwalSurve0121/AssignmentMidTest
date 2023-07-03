package Mid_Test_Assignment;

public class Q6MostOccurance {

	static char mostFrequent(String str)
    {
        int len = str.length();
        int iCnt = 0;
 
        char ch = str.charAt(0);
        
        for(int i = 0; i < len; i++)
        {
            int iCount = 1;
            
            for(int j = i+1; j < len; j++)
            {
                if (str.charAt(i) != str.charAt(j))
                    break;
                
                iCount++;
            }
 
            if (iCount > iCnt)
            {
                iCnt = iCount;
                ch = str.charAt(i);
            }
        }
        
        return ch;
    }
 
    public static void main(String args[]){
    	//Display second most frequent character in given String.
//    	Eg. Give String is ‘success’ then output should be ‘c’ . (as 'c' occurs  2 times) 
        String str = "success";
        
        System.out.println("Second Most Consecutive Character is : "+mostFrequent(str));

	}

}
