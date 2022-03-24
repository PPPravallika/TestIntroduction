package TwoNumberSum;

import java.util.HashSet;
import java.util.Set;
//O(n)--Time
//O(n)-space
public class TwoNumberSumSet {
    public static int[] TwoNumberSet(int[] array,int targetSum){
        Set<Integer> numbs=new HashSet<Integer>();

        for(int num:array){
            int potentialMatch=targetSum-num;
            if (numbs.contains(potentialMatch)){
                return new int[] {potentialMatch,num};
            }else{
                numbs.add(num);
            }
        }

    return new int[0];

    }
}
