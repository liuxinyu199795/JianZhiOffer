/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuZuZhongDeLiXuDui035
 * @Author: XinyuLiu
 * @Date: 2019/7/17 0:06
 */
public class shuZuZhongDeLiXuDui035 {
    int count=0;
    public int InversePairs(int [] array) {
        if(array.length==0||array==null) return count;
        mergeSort(array,0,array.length-1);
        return count;
    }
    public void mergeSort(int[] a,int low,int high){
        if(low>=high) return;
        int mid = low+(high-low)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    public void merge(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i =low,j=mid+1,k=0;
        while(i<=mid&&j<=high){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
                count+=mid-i+1;
                count%=1000000007;
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=high){
            temp[k++]=a[j++];
        }
        for (int l = 0; l <temp.length ; l++) {
            a[low+l]=temp[l];
        }
    }
}
