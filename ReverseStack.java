import java.util.Scanner;
import java.util.Stack;
class ReverseStack{
static void rev(Stack<Integer>st){
if(st.size()==0)return;
int t=st.pop();
System.out.print(t+" ");
rev(st);
st.push(t);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Stack<Integer>st=new Stack<>();
for(int i=0;i<n;i++)st.push(sc.nextInt());
rev(st);
}
}