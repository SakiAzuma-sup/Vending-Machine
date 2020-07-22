package Machine;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println(Word.MSG_OPENING1);
	
		boolean ok = true;
		
		//ChooseFirstで9(終了)が選ばれるまで続く
		while(ok) {
			
			ChooseFirst tmp1 = new ChooseFirst();
			String cf1 = tmp1.choosefirst();
			int cf2 = Integer.parseInt(cf1);
			
			ok = firstchoose(ok, cf1);
			
		}
	}

	//
	//#####最初の操作選択#####
	//
	public static boolean firstchoose(boolean ok, String cf1) {
		//最初の操作選択(ChooseFirst)
		switch (cf1) {
		//1.商品を選ぶ
		case "1":	//to 商品選択(ChooseProduct)
			ChooseProduct tmp2 = new ChooseProduct();
			String cp = tmp2.chooseproduct();
			int cp1 = Integer.parseInt(cp);
			//商品選択
			chooseProduct(ok, cp1);
			break;
			
		//2.お金を入れる	
		case "2":
			PayMoney tmp5 = new PayMoney();
			int pm = tmp5.paymoney();
			
			CheckMoney tmp6 = new CheckMoney();
			String cm = tmp6.checkmoney(pm);
			
			//￥100以上の入金
			if(cm=="cola") {	
			ChooseProduct tmp13 = new ChooseProduct();
			String cp2 = tmp13.chooseproduct();
			int cp3 = Integer.parseInt(cp2);
			
			//to 最後の操作選択(ChooseLast)
			ChooseLast tmp451 = new ChooseLast();
			String c10 = tmp451.chooselast();
				lastchoose(ok, cp3, c10);
			}
			//￥80以上￥100未満の入金
			if(cm=="soda") {
				ChooseProduct2 tmp65 = new ChooseProduct2();
				String cp5 = tmp65.chooseproduct2();
				int cp6 = Integer.parseInt(cp5);
				
				//to 最後の操作選択(ChooseLast)
				ChooseLast tmp451 = new ChooseLast();
				String c10 = tmp451.chooselast();
					lastchoose(ok, cp6, c10);
			
			}
			break;
		
			
		//x.pass
		case "19980301":
			Management m = new Management();
			break;
		
		//9.終了する
		case "9":
			System.out.println(Word.MSG_THANKS1);
			System.out.println(Word.MSG_THANKS2);
			ok = false;
			break;
		
		//エラー
		default:
			System.out.println("");
			System.out.println(Word.MSG_ERROR);
			return ok;
		}
		return ok;
	}

	
	
	//
	//#####最後の選択#####
	//
	public static boolean lastchoose(boolean ok, int cp3, String c10) {
		//
		switch(c10) {
		//1.商品の詳細を見る
		case "1":
			ListDisplay tmp831 = new ListDisplay();
			String ld3 = tmp831.listdisplay(cp3);
		
		//2.買い物を続ける
		case "2":
			return ok;
		
		//9.終了する
		case "9":
			System.out.println(Word.MSG_THANKS1);
			System.out.println(Word.MSG_THANKS2);
			System.exit(0);
			break;
		
		//エラー	
		default:
			System.out.println("");
			System.out.println(Word.MSG_ERROR+System.lineSeparator());
			ChooseLast tmp158 = new ChooseLast();
			String cl4 = tmp158.chooselast();
		}
		return ok;
	}

	
	
	
	
	//
	//#####商品選択#####
	//
	public static boolean chooseProduct(boolean ok, int cp1) {
		//商品選択(ChooseProduct)
		switch(cp1) {
		//1.コーラ
		case 1:
			//入金(PayMoney)--->>>金額チェックok(CheckMoney)
			PayMoney2 tmp23 = new PayMoney2();
			int pm2 = tmp23.paymoney2(cp1);
			
			CheckMoney2 tmp46 = new CheckMoney2();
			boolean cm2 = tmp46.checkmoney2(pm2);
			
			//to 最後の操作選択(ChooseLast)
			ChooseLast tmp45 = new ChooseLast();
			String c9 = tmp45.chooselast();
			lastchoose(ok, cp1, c9);
				break;
		
		//2.ソーダ
		case 2:
			//入金(PayMoney)--->>>金額チェックok(CheckMoney)
			PayMoney3 tmp4 = new PayMoney3();
			int pm1 = tmp4.paymoney3(cp1);
			
			//CheckMoney tmp56 = new CheckMoney();
			//String check = tmp56.checkmoney(pm1);
			
			//to 最後の操作選択(ChooseLast)
			ChooseLast tmp6 = new ChooseLast();
			String cl1 = tmp6.chooselast();
			lastchoose(ok, cp1, cl1);
			break;
		
		//エラー
		default:
			System.out.println("");
			System.out.println(Word.MSG_ERROR+System.lineSeparator());
			ChooseProduct tmp3 = new ChooseProduct();
			String cp2 = tmp3.chooseproduct();
		}
		return ok;
	}
			

		
	}

