package kadai_018;

abstract public class Kato_Chapter18 {
	
	// フィールド
	public String familyName; // 姓を表す
	public String givenName;  // 名を表す
	public String address = "東京都中野区〇×";    // 住所を表す
	
	// メソッド
	
	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は加藤" + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介を出力するメソッド
	abstract public void eachIntroduce();

	// 紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println(""); // 空白行
	}

}
