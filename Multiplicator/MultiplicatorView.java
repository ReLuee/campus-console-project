package merge_mvc;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MultiplicatorView {
	MultiplicatorControl control = new MultiplicatorControl();
	
	//멤버변수(사용자의 입력) & 스캐너
	Scanner userinput = new Scanner(System.in);

	String mainMsg = "1. 계산하기 \n2. 종료하기";
	
	//사용자입력 저장할 변수
	private int action;
	private int num1;
	private int num2;
	private String op;
	
	//게터세터
	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	// 시작화면
	public void StartView() {
		
		System.out.println("==계산기==");
		System.out.println(mainMsg);
		
		while(true) {
			
			try {
				
				int action = userinput.nextInt();
				if(action<1 || action>2) {
					System.out.println("1또는 2를 입력하세요");
				}
				this.action = action;
				break;

				
			}catch(InputMismatchException e) {
				userinput.nextLine();
				System.out.println("숫자를 입력하세요");
			}
		}
	}
	
	// 첫번째 숫자 입력
	public int num1() {
		
		while(true) {
			
			try {
				
				System.out.println("첫번째 숫자 : ");
				int num1 = userinput.nextInt();
				
				this.num1 = num1;
				break;
				
			}catch(InputMismatchException e) {
				userinput.nextLine();
				System.out.println("숫자를 입력하세요");
			}
			
		}
		return num1;
	}
	
	
	
	// 연산자입력
	public String op() {
		
		while(true) {
			
			try {
				
				System.out.println("연산자 : ");
				String op = userinput.next();
				
				if(op.equals("+") || op.equals("-")) {
					this.op = op;
					break;
				}
				if(op.equals("*") || op.equals("/")) {
					this.op = op;
					break;
				}
				
			}catch(InputMismatchException e) {
				userinput.nextInt();
				System.out.println("연산자를 입력하세요");
			}
			
		}
		return op;
	}
	
	// 두번째 숫자 입력
	public int num2() {
		
		while(true) {
			
			try {
				
				System.out.println("두번째 숫자 : ");
				int num2 = userinput.nextInt();
				
				this.num2 = num2;
				break;
				
			}catch(InputMismatchException e) {
				userinput.nextLine();
				System.out.println("숫자를입력하세요");
			}
			
		}
		return num2;
	}

	
	// 출력메서드
	public void print(Object obj) {
		System.out.println();
		System.out.println(obj);
	}
	
	public void endPrint() {
		System.out.println("계산기를 종료합니다.");
	}
	
	
}