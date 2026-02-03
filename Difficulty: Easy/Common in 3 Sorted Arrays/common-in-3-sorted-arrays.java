// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        
            int i=0,j=0,k=0;
        int n1=arr1.size(),n2=arr2.size(),n3=arr3.size();
        List<Integer> res=new ArrayList<>();
        while(i<n1&&j<n2&&k<n3){
            int a=arr1.get(i),b=arr2.get(j),c=arr3.get(k);
            if(a==b&&b==c){
                if(res.isEmpty()||res.get(res.size()-1)!=a) res.add(a);
                while(i<n1&&arr1.get(i)==a)i++;
                while(j<n2&&arr2.get(j)==a)j++;
                while(k<n3&&arr3.get(k)==a)k++;
            }else{
                if(a<b)i++;
                else if(b<c)j++;
                else k++;
            }
        }
        if(res.isEmpty())res.add(-1);
        return res;
    }
}