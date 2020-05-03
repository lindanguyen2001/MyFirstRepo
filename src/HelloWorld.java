import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class HelloWorld {

	public static void main(String[] args) {
		Stack<String> stringStack = new Stack<>();
		stringStack.push("ab");
		stringStack.push("abc");
		stringStack.push("a");
		while (!stringStack.empty())
		{ 
		 System.out.print(stringStack.pop() + ",");
		}
		 
		
	}
}
