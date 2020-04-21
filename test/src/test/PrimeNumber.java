package test;

import java.util.InputMismatchException;
import java.util.Scanner;

// 整数を入力
// 入力した整数は素数かをチェック
public class PrimeNumber {
	int value;
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.value = 10;
		
		System.out.println("整数を入力してください");
		Scanner scanner = new Scanner(System.in);
		try {
			double n = scanner.nextDouble();
			System.out.println("入力した整数は" + n + "ですね。");
			System.out.println("素数をチェックしています。。。");

			if (isPrimeNumber(n)) {
				System.out.println(n + "は素数です。");
			} else {
				System.out.println(n + "は素数じゃないです。");
			}

			System.out.println("素数チェックが完了しました。");
		} catch (InputMismatchException e) {
			System.out.println("エラーになります。");
			System.out.println(e);
		}
	}
	

	public static boolean isPrimeNumber(double n) {
		if (n < 2) {
			return false;
		}
		// 二乗根を計算
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}