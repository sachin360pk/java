import java.util.*;
public class stackQueue {
    static class queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        static void enque(int x){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
           
        }
        static int deque(){
            if(s1.isEmpty()){
                return -1;
            }
            int x=s1.pop();
            return x;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        
    }
}
