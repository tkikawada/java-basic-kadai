package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {		
	
	public void searchMap(String[] engArray) {
		
		// 辞書のHashMapを宣言
		HashMap<String, String> dictionaryMap = new HashMap<String, String>();
		
		// 辞書のHashMapに要素を追加
		dictionaryMap.put("apple", "リンゴ");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
		int i = 0;
		
		while( i < engArray.length ) {
			if(dictionaryMap.get(engArray[i]) != null) {
				// 辞書に追加されている場合
				System.out.println(engArray[i] + "の意味は" + dictionaryMap.get(engArray[i]));
			} else {
				// 辞書に存在しない場合
				System.out.println(engArray[i] + "は辞書に存在しません");
			}
			
			i++;
		}
	}	

}
