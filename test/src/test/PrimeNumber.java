package test;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���������
// ���͂��������͑f�������`�F�b�N
public class PrimeNumber {
	int value;
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.value = 10;
		
		System.out.println("��������͂��Ă�������");
		Scanner scanner = new Scanner(System.in);
		try {
			double n = scanner.nextDouble();
			System.out.println("���͂���������" + n + "�ł��ˁB");
			System.out.println("�f�����`�F�b�N���Ă��܂��B�B�B");

			if (isPrimeNumber(n)) {
				System.out.println(n + "�͑f���ł��B");
			} else {
				System.out.println(n + "�͑f������Ȃ��ł��B");
			}

			System.out.println("�f���`�F�b�N���������܂����B");
		} catch (InputMismatchException e) {
			System.out.println("�G���[�ɂȂ�܂��B");
			System.out.println(e);
		}
	}
	

	public static boolean isPrimeNumber(double n) {
		if (n < 2) {
			return false;
		}
		// ��捪���v�Z
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}