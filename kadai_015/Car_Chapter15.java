package kadai_015;

// 車クラス
public class Car_Chapter15 {
	// フィールド（内部データ）
	private int gear  = 1; // 1速から5速のギアを表す
	private int speed = 10;  // ギアチェンジ後の速度を表す

	// コンストラクタ（初期化処理）
	public Car_Chapter15( int gear, int speed ) {
		this.gear  = gear;
	    this.speed = speed;      
	}
	
	
	// 【メソッド】ギアの値により速度を変える
    // afterGear：ギアチェンジ後のギア
	public void gearChange( int afterGear ) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	}
	
	// 【メソッド】ギアチェンジ後の速度を表示する
	public void run() {
		switch (gear) {
		case 1 -> System.out.println("速度は時速" + 10 + "kmです");
		case 2 -> System.out.println("速度は時速" + 20 + "kmです");
		case 3 -> System.out.println("速度は時速" + 30 + "kmです");
		case 4 -> System.out.println("速度は時速" + 40 + "kmです");
		case 5 -> System.out.println("速度は時速" + 50 + "kmです");
		default -> System.out.println("速度は時速" + 10 + "kmです");
		}
	}
}
