package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ChooseProduct {

	//���i�I������X�^�[�g
	public String chooseproduct() {
		//���i�I�����
		System.out.println("");
		System.out.println(Word.MSG_CHOOSE3);
		
		System.out.println(Word.MSG_BAR);
			//ProductList�̗v�f��\������
			ListProduct tmp100 = new ListProduct();
			List lp1 = tmp100.listproduct();
		System.out.println(Word.MSG_BAR);
		System.out.print(Word.MSG_CHOOSE4);
	
		BufferedReader tmp101 = new BufferedReader(new InputStreamReader(System.in));
		String choosey = null;
		try {
			choosey = tmp101.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}

	//choosey(���i�ԍ�/String�^)��Ԃ�
	return choosey;	
		

	}

}
