package calculator;

import java.util.Scanner;

public class Calculator {
	
	Calculator calculator = new Calculator();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		
			try {
				
				int num1; // ù��° �Է� ����
				int num2; // �� ��° �Է� ����
				String operator; // ������
				int result = 0; // ��� ��
				
				System.out.println("����Ͻ� ù ��° ���ڸ� �Է��ϼ���.");
				num1 = sc.nextInt();
				
				System.out.println("���� ��ȣ�� �Է��ϼ��� (/, *, -, +, %)");
				operator = sc.next();
				
				System.out.println("����Ͻ� �� ��° ���ڸ� �Է��ϼ���.");
				num2 = sc.nextInt();
				
				if (operator.equals("/")) {
					result = num1 / num2;
				}
				
				else if (operator.equals("*")) {
					result = num1 * num2;
				}
				
				else if (operator.equals("-")) {
					result = num1 - num2;
				}
				
				else if (operator.equals("+")) {
					result = num1 + num2;
				}
				
				else if (operator.equals("%")) {
					result = num1 % num2;
				}
				
				else {
					System.out.println("�� �� ���� ������ �Դϴ�.");
				}
				
				System.out.println(num1 + operator + num2 + "=" + result);
			}
			
			catch (NullPointerException e) { // null ��ü�� ������ ��
				System.out.println(e.getMessage());
			}

			catch (NumberFormatException e) { // ���ڿ��� ���ڷ� ��ȯ�� �� ���� ��
				System.out.println(e.getMessage());
			}
			
			catch (RuntimeException e) { // ��Ÿ�� �߿� �߻��ϴ� ����
				System.out.println(e.getMessage());
			}
		}
	}
}
