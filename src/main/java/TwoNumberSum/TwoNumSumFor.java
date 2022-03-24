package TwoNumberSum;
//O(n^2)-Time
//O(1)-Space
public class TwoNumSumFor {
    public static int[] twoSumFor (int[] array, int targetSum){

        for(int i=0;i<array.length;i++){
            int firstNum=array[i];
            for(int j=i+1;j<array.length;j++){
                int secNum=array[j];

                if(firstNum+secNum==targetSum){
                    return new int[] {firstNum,secNum};
                }

            }

        }
        return new int[0];



    }





}
