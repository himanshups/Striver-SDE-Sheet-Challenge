public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
        StringBuilder s=new StringBuilder(str);
        StringBuilder res=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(c==0 && s.charAt(i)!=' '){
                res.append(s.charAt(i));
            }
            else if (c!=0 && s.charAt(i)!=' '){
                res.append(" ");
                res.append(s.charAt(i));
                c=0;
            }
            else{
                c++;
            }
        }
        String arr[]=res.toString().split(" ");
        s=new StringBuilder();
        for(int i=arr.length-1;i>-1;i--){
            s.append(arr[i]);
            if(i!=0)
                s.append(" ");
        }
        
            return s.toString();
	}
}
