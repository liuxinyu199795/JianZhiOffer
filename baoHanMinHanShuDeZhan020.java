import java.util.Stack;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: baoHanMinHanShuDeZhan020
 * @Author: XinyuLiu
 * @Date: 2019/6/23 13:16
 */
public class baoHanMinHanShuDeZhan020 {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        data.push(node);
        if(min.empty()){
            min.push(node);
        }else if(node<min.peek()){
            min.push(node);
        }
    }

    public void pop() {
        if(data.empty()){
            throw new RuntimeException("stack is empty");
        }else if(data.peek()==min.peek()){
            min.pop();
        }
        data.pop();
    }

    public int top() {
        if(data.empty()){
            throw new RuntimeException("stack is empty");
        }
        int num = data.pop();
        if(num==min.peek()){
            data.pop();
        }
        return num;
    }

    public int min() {
        if(min.empty()){
            throw new RuntimeException("stack is empty");
        }else{
            return min.peek();
        }
    }
}
