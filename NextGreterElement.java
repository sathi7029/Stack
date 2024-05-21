import java.util.Scanner;
import java.util.Stack;
class NextGreterElement{
static int[] getMax(int a[],int n){
Stack<Integer>st=new Stack<>();
int res[]=new int[n];
st.push(a[n-1]);
res[n-1]=-1;
for(int i=n-2;i>=0;i--){

while(!st.isEmpty() && st.peek() < a[i])st.pop();
if(st.size()==0)res[i]=-1;
else
res[i]=st.peek();
st.push(a[i]);

}
return res;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)a[i]=sc.nextInt();
a=getMax(a,n);
for(int e:a)System.out.print(e+" ");
}
}