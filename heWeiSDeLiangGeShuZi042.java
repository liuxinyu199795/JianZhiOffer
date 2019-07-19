import java.util.*;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: heWeiSDeLiangGeShuZi042
 * @Author: XinyuLiu
 * @Date: 2019/7/18 16:16
 */
public class heWeiSDeLiangGeShuZi042 {
    //1.HashMap储存法
    /*public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i <array.length ; i++) {
            if(map.containsValue(array[i])){
                list1.add(sum-array[i]);
                list2.add(array[i]);
            }else{
                map.put(array[i],sum-array[i]);
            }
        }
        if(list1.size()==0){
            return new ArrayList<>();
        }else{
            int i=0,min=Integer.MAX_VALUE;
            for (int j = 0; j <list1.size() ; j++){
                int num=list1.get(j)*list2.get(j);
                if(min>num){
                    min=num;
                    i=j;
                }
            }
            return new ArrayList<>(Arrays.asList(list1.get(i),list2.get(i)));
        }
    }*/
    //2.双指针法
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i=0,j=array.length-1;
        if(array==null||array.length==0) return new ArrayList<>();
        while(i<j){
            if(array[i]+array[j]==sum){
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            }else if(array[i]+array[j]<sum){
                i++;
            }else{
                j--;
            }
        }
        return new ArrayList<>();
    }
}
