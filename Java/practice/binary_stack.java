import java.util.Stack;
import org.junit.Test;
public class DecimalToBinary {

	public void deciTobin(int n) {
		Stack<Integer> s = new Stack<Integer>();

		while(n>0) {
			s.push(n%2);
			n/=2;
		}
		if(s.isEmpty()) {
			System.out.println(0);
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}

	public void deciTobinRec(int n) {
		if(n==1) {
			System.out.print(1);
		}
		else if(n==0) {
			System.out.print(0);

		}
		else {
			deciTobin(n/2);
			System.out.print(n%2);
		}
	}
}