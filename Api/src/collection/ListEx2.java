package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");
		
		System.out.println(list);
		
		list.add(2, "oracle");
		
		System.out.println(list);
		
		//����
		list.remove(1); //JDBC ����
		System.out.println(list);
		
		//����
		list.sort(Comparator.reverseOrder()); //��������, naturalOrder() : ��������
		System.out.println(list);

	}
}












