package Machine;

import java.util.*;

public class ListProduct {

	public List listproduct(){
		// TODO 自動生成されたメソッド・スタブ
		
		//商品名
		ArrayList<String> product = new ArrayList<>();
			product.add("コーラ");
			product.add("ソーダ");
		
		//価格
		ArrayList<String> price = new ArrayList<>();
			price.add("￥100");
			price.add("￥80");
		
		//商品表示
		for (int i=0; i<product.size(); ++i) {
			System.out.println("| "+(i+1)+" | "+product.get(i)+" | "+price.get(i)+" |");
		}
		
		return product;
	}
	
	

}
