package Machine;

import java.util.*;

public class ListProduct {

	public List listproduct(){
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		//���i��
		ArrayList<String> product = new ArrayList<>();
			product.add("�R�[��");
			product.add("�\�[�_");
		
		//���i
		ArrayList<String> price = new ArrayList<>();
			price.add("��100");
			price.add("��80");
		
		//���i�\��
		for (int i=0; i<product.size(); ++i) {
			System.out.println("| "+(i+1)+" | "+product.get(i)+" | "+price.get(i)+" |");
		}
		
		return product;
	}
	
	

}
