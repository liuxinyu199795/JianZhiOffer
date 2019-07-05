import java.util.Stack;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: zhanDeYaRuTanChu021
 * @Author: XinyuLiu
 * @Date: 2019/6/23 15:48
 */
public class zhanDeYaRuTanChu021 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA==null||popA==null||pushA.length==0||popA.length==0) return false;
        Stack<Integer> stack = new Stack<>();
        int start=0;
        for (int i = 0; i <pushA.length ; i++) {
            stack.push(pushA[i]);
            while(!stack.empty()&&stack.peek()==popA[start]){
                stack.pop();
                start++;
            }
        }
        return stack.empty();
    }
}
