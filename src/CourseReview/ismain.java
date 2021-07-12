package CourseReview;

import ArithmeticOperation.calcImpl;

public class isMain {

	public static void main(String[] args) throws Exception {
//		────────────────────────────────────────────────
//		Java 버전과 이클립스 버전을 맞췄음(jdk-1.8.0)
//		────────────────────────────────────────────────

		System.out.println("사칙 연산을 위한 인스턴스 생성");

		calcImpl abc = new calcImpl(0);
		
//		나누기
		abc.division(30, 10);

	}

}
