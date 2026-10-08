class Solution {
    public void sorting(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
           arr[minIndex]=temp;
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        
        sorting(nums1);
        sorting(nums2);
        
        ArrayList<Integer> result = new ArrayList<>();

        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j] && !result.contains(nums1[i])){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i]<nums2[j]){
                i++;

            }
            else{
                j++;
            }
        }

       
        int[] ans = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
           ans[k] = result.get(k);
        }

return ans;
        
    }
    
}