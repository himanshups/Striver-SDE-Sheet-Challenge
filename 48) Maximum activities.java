public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end)     {
        ArrayList<Activity> ls = new ArrayList<>();
        for(int i=0;i<start.size();i++){
            ls.add(new Activity(start.get(i),end.get(i)));
        }
        Collections.sort(ls, new comp());
        int ans = 1;
        int limit = ls.get(0).end;
        for(int i=1;i<ls.size();i++){
            if(ls.get(i).start >= limit){
                limit = ls.get(i).end;
                ans++;
            }
        }
        return ans;
    }
}
