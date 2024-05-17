import java.util.Scanner;
import java.util.Stack;
class RemoveConsecutiveElements{
static int[] remove(int a[],int n){
Stack<Integer>st=new Stack<>();
for(int i=0;i<n;i++){
if(st.size()==0 || st.peek()!=a[i])st.push(a[i]);
else if(st.peek()==a[i]){
 if(i==n-1 || a[i]!=a[i+1])st.pop();
}
}
int res[]=new int[st.size()];
int m=res.length;
for(int i=m-1;i>=0;i--)res[i]=st.pop();
return res;

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
a=remove(a,n);
for(int e:a)System.out.print(e+" ");
}
}