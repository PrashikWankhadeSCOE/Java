import java.util.*;

class Parenthesis{
	boolean checker(String x){
		Stack<Character> stack = new Stack<Character>();
	        int len = x.length();
        
        	for(int i = 0;i<len;i++){
            		if(x.charAt(i)=='{' || x.charAt(i) == '[' || x.charAt(i) == '('){
                		stack.push(x.charAt(i));
            		}
           	 	else{
                		if(stack.empty()){
                    			return false;
                		}
                		else if(stack.peek()=='{' && x.charAt(i)=='}' || stack.peek()=='(' && x.charAt(i)==')' || stack.peek()=='[' && x.charAt(i)==']'){
                    			stack.pop();
                		}
                		else 
                    			return false;
            		}
        	}
        	if(stack.empty())
            		return true;
       	 	return false;
	}
}
class Client{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Parenthesis obj = new Parenthesis();
		boolean ret = obj.checker(str);

		if(ret)
			System.out.println("balanced");
		else
			System.out.println("Unbalanced");
	}
}
