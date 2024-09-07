
public class If01 {
	public static void main(String[] args) {
		int number = 6;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です");
		}
		if (number < 15) {
			System.out.println(number + "は15未満です");
		}

		int num = 20;
		if (num < 5) {
			System.out.println(num + "は5未満です");
		} else if (num < 10) {
			System.out.println(num + "は5以上、10未満です");
		} else if (num < 15) {
			System.out.println(num + "は10以上、15未満です");
		} else {
			System.out.println(num + "は15未満でないです");
		}
		int val = 3;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;

		}
	}

}
