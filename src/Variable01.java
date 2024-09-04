
public class Variable01 {
	// [1]static final定数の宣言
	static final int min_number = 10;

	public static void main(String[] args) {
		System.out.println(min_number);
		// [1]代入しようとするとエラー
		// MIN_NUMBER = 20;

		// [2]final定数の宣言
		final int maxValue;
		// [2]一度は値を設定できる
		maxValue = 100;
		System.out.println(maxValue);
		// [2]再代入しようとするとエラー
		// maxValue = 200;
		System.out.println(maxValue);
		System.out.println(min_number);
		System.out.println(min_number);
	}
}