package merge_mvc;

public class MultiplicatorModel {

	
	//멤버변수
	private int num1;     //1번째숫자
	private int num2;     //2번째숫자
	private String op;    //연산자
	private int result;     //결과

	
	//getter&setter
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
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
	//계산
	
	public int result(Object obj) {
		
		if (obj.equals("+")){              //덧셈
			this.result = num1 + num2;
		} else if (obj.equals("-")){       //뺄셈
			this.result = num1 - num2;
		} else if (obj.equals("*")) {      //곱셈
			this.result = num1 * num2;
		} else if (obj.equals("/")) {      //나눗셈
			this.result = num1 / num2;
		}
		return result;
		
	}

	

	
	
	
}
