import java.util*;

class Parenthesis{
	boolean checker(String str){
		Stack<Character> stack = new Stack<Character>();

		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
				stack.push(str.charAt(i));		
			}
			else{
				if((stack.peek() == '{' && str.charAt(i)=='}') || (stack.peek() == '[' && str.charAt(i)==']') || (stack.peek() == '(' && str.charAt(i)==')')){
					if(stack.empty()){
						return false;
					}
					stack.pop();
				}
				else{
					
				}
			}
		}
		return true;
	}
}
class Client{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Parenthesis obj = Parenthesis();
		boolean ret = obj.checker(str);

		if(ret)
			print("balanced");
		else
			print("Unbalanced");
	}
}
