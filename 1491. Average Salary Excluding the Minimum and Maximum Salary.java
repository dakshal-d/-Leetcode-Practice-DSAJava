import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        int n= salary.length;
        for(int i=1;i<n-1;i++){
            sum= sum+salary[i];
        }
        return sum/(n-2);
        
    }
}