import java.util.* ;

import java.io.*; 

/*******************************************************

 

    Following is the Interval class structure

 

    class Interval {

        int start, int finish;

 

        Interval(int start, int finish) {

            this.start = start;

            this.finish = finish;

        }

    }

*******************************************************/

 

import java.util.List;

import java.util.ArrayList;

 

// creates the comparator for comparing stock value

class IntervalComparator implements Comparator<Interval> {

  

    // override the compare() method

    public int compare(Interval s1, Interval s2)

    {

        if (s1.start == s2.start)

            return 0;

        else if (s1.start > s2.start)

            return 1;

        else

            return -1;

    }

}

public class Solution {

    public static List<Interval> mergeIntervals(Interval[] intervals) {

        // write your code here.

        List<Interval> result=new ArrayList<>();

        Arrays.sort(intervals,new IntervalComparator());

        result.add(new Interval(intervals[0].start,intervals[0].finish));

        int j=0;

        // Interval temp=new Interval(intervals[0].start,intervals[0].finish);

        for(int i=1;i<intervals.length;i++){

            if(result.get(j).finish>=intervals[i].start){

                int maxFinish=Math.max(result.get(j).finish,intervals[i].finish);

                int minstart=result.get(j).start;

                result.set(j,new Interval(minstart,maxFinish));

            }else{

                result.add(new Interval(intervals[i].start,intervals[i].finish));

                j++;

            }

        }

 

        // for(int i=0;i<intervals.length;i++)

        // System.out.println(intervals[i].start+" "+intervals[i].finish);

        return result;

    }

}