package ArithmeticOperation;

public class calcImpl implements calcService {

//	��ȯ�� �����
	public int num = 0;
//	�Է¹��� 4���� ��
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
 
		System.out.println("�������Դϴ�. �� ���� ������ ū ���� ������ �� �����մϴ�.");
		System.out.print("abc.division(30, 10) = " + this.num);
	}
}
