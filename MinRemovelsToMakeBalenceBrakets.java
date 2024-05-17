import java.util.Scanner;
import java.util.Stack;
class MinRemovelsToMakeBalenceBrakets{
static int minRemove(String s){
Stack<Character>st=new Stack<>();
int n=s.length();
int r=0;
for(char c:s.toCharArray()){
if(c=='(')st.push(c);
else if(c==')'){
if(!st.isEmpty() && st.peek()=='(')st.pop();
else
r++;
}
}
r+=st.size();
return r;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(minRemove(s));
}
}