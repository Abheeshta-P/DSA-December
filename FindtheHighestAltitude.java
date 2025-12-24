class Solution {
    public int largestAltitude(int[] gain) {
        int highestPoint = 0;
        int sum = 0;
        for(int i:gain){
            sum+=i;
            highestPoint = Math.max(highestPoint,sum);
        }
        return highestPoint;
    }
}
