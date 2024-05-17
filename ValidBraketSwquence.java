import java.util.Stack;
import java.util.Scanner;
class ValidBraketSwquence{

static boolean isValid(String s){
Stack<Character>st=new Stack<>();
for(char c:s.toCharArray()){
if(c=='(' || c=='{' || c=='[')st.push(c);
else if(c==')' || c=='}' || c==']'){
if(st.isEmpty())return false;
else{
char t=st.pop();
if((c==')' && t!='(') || (c=='}' && t!='{') || (c==']' && t!='['))return false;
}
}
}
return st.isEmpty();
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(isValid(s));
}
}