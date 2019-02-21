package ind.zrd.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author 11251
 *ArrayList ��ʵ��List�ӿڵĶ�̬���飬��ν��̬��ָ����������С�ǿɱ�ġ�
 *ArrayList �ײ���ͨ��������ʵ�ֵģ�����������ͨ������+���鸴����ʵ�ֵģ�System.arraycoyp()��������
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�޲ι��캯������ ArrayList
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		//�Թ̶���ʼ��������ArrayList
		ArrayList<Integer> al2 = new ArrayList<Integer>(25);
		al2.add(2);
		System.out.println(al2.size());
		//��ָ�����ϴ���ArrayList,��list�ְ������뼯�ϵ�����Ԫ�أ�˳��Ϊ����������Ԫ�ص�˳��
		ArrayList<Integer> al3 = new ArrayList<Integer>(new ArrayList<Integer>());
		al3.add(3);
		
		//Array List���ֳ�����ȫ�ģ������ǿ���ͨ��������ʽ�����̰߳�ȫ��list.
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("�߳�ͬ����ArrayList��");
		
		int[] array = {1,2,3,4,5,6,7,8,9,0,};
		System.arraycopy(array, 5, array, 6, 4);
		
		System.out.println(array);
	}
}
