package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		
		// 車インスタンスを生成
		Car_Chapter15 car = new Car_Chapter15(1, 10);
		
		// gearChangeメソッド実行
		car.gearChange(3);
		
		// runメソッド実行
		car.run();
	}
}
