package Machine;

import java.util.ArrayList;
import java.util.List;

public class ListDisplay {

	//商品の詳細を見る
	public String listdisplay(int shohin){
		//商品詳細
		ArrayList<String> display = new ArrayList<>();
			display.add("種類 : 炭酸飲料 | 原材料名 : 糖類（果糖ぶどう糖液糖、砂糖）、炭酸、カラメル色素、酸味料、香料、カフェイン　|　エネルギー : 45kcal/100ml");
			display.add("種類 : 炭酸飲料 | 原材料名 : 水、二酸化炭素、塩化Ｃａ、硫酸Ｍｇ　|　エネルギー : 0kcal/100ml");
		
		//商品詳細を表示
		System.out.println(display.get(shohin-1));
		System.out.println("");
	
	//別にいらん
	String hoge = null;
	return hoge;
	}
}
