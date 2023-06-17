/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndex(mountainArr);
        int firsthalf=binaryS(mountainArr,target,0,peak);
        if(firsthalf!= -1){
            return firsthalf;
        }
        return binaryS(mountainArr,target,peak+1,mountainArr.length()-1);

    }


    public int peakIndex(MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public int binaryS(MountainArray mountainArr, int target,int start,int end) {

        boolean isaasc;
        if (mountainArr.get(start) < mountainArr.get(end)) {
            isaasc = true;
        } else {
            isaasc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == mountainArr.get(mid)) {
                return mid;
            }
            if (isaasc) {
                if (target > mountainArr.get(mid)) {
                    start = mid + 1;
                }

                else{
                    end = mid - 1;
                }

            } else {
                if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }

        }
        return -1;
    }
}