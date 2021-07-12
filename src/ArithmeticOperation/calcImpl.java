package ArithmeticOperation;

public class calcImpl implements calcService {

//	반환될 결과값
	public int num = 0;
//	입력받은 4개의 값
	public int a, b, c, d;
	
	public calcImpl (int num) {
		this.num = num;
	}

	public void addtion(int a, int b) throws Exception {
		this.num = a + b;
		System.out.print(this.num);
	}

	public void subtraction(int a, int b) throws Exception {
		this.num = a - b;
		System.out.print(this.num);
	}

	public void multiplication(int a, int b) throws Exception {
		this.num = a * b;
		System.out.print(this.num);
	}

	public void division(int a, int b) throws Exception {
		this.num = a < b ? (int) b / a : (int) a / b;
 
		System.out.println("나누기입니다. 더 작은 값으로 큰 값을 나누며 몫만 제공합니다.");
		System.out.print("abc.division(30, 10) = " + this.num);
	}
}
