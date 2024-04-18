package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	// 自分のじゃんけんの手を入力するメソッド
	public static String getMyChoice() {
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう\n"
					+ "グーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
			
			//Scannerクラスのオブジェクトを生成する
		    Scanner scanner = new Scanner(System.in);
		   	
		    //入力した内容を取得する
		    String me = scanner.next();
		    		    
		    if( me.equals("r") || me.equals("s") || me.equals("p") ) {
		    	//Scannerクラスのオブジェクトをクローズする
			    scanner.close();		    	
		    	return me;
		    } else {
		    	System.out.println("エラーです、もう一度入力してください");
		    }		    		    
		}
		
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public static String getRandom() {
		
		// 配列にじゃんけんの手をセット
		String[] youArray = {"r", "s", "p"};
		
		int i = (int) Math.floor(Math.random() * 2);
		
		return youArray[i];
	}
	
	// じゃんけんを行うメソッド
	public void playGame() {
		
		HashMap<String,String> outputMap = new HashMap<String,String>();
		outputMap.put("r", "グー");
		outputMap.put("s", "チョキ");
		outputMap.put("p", "パー");
		
		String me_output = getMyChoice();
		String you_output = getRandom();
		
		// 自分と相手のじゃんけんの手を出力
		System.out.println("自分の手は" + outputMap.get(me_output) +
				",対戦相手の手は"+ outputMap.get(you_output));
		
		if( me_output.equals(you_output) ){
			System.out.println("あいこです");
		} else if( me_output.equals("r") ) {
			switch (you_output) {
				case "s" -> System.out.println("自分の勝ちです");
				case "p" -> System.out.println("自分の負けです");
			}
		} else if( me_output.equals("s") ) {
			switch (you_output) {
				case "p" -> System.out.println("自分の勝ちです");
				case "r" -> System.out.println("自分の負けです");
			}
		} else if( me_output.equals("p") ) {
			switch (you_output) {
				case "r" -> System.out.println("自分の勝ちです");
				case "s" -> System.out.println("自分の負けです");
			}
		} 
		
		
	}
}
