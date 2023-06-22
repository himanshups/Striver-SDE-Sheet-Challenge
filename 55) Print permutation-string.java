 public static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<String>();
		helper(s,"",ans);
		return ans;
    }
    public static void helper(String input,String soFar , List<String> ans)
	{
		if(input.length()==0)
		{
			ans.add(soFar);
			return;
		}
		for(int i=0 ; i<input.length() ; i++)
		{
			char ch = input.charAt(i);
			String leftPart=input.substring(0,i);
			String rightpart=input.substring(i+1);
			helper(leftPart+rightpart,ch+soFar,ans);
		}
	}