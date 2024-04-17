package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		
		// 辞書クラスのインスタンス作成
		Dictionary_Chapter21 dictionary_class = new Dictionary_Chapter21();
		
		// 調べる英単語を配列にセット
		String[] engArraySet = { "apple", "banana", "grape", "orange" };
		
		// 辞書を調べる  
		dictionary_class.searchMap(engArraySet);

	}

}
