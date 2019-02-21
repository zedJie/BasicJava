package ind.zrd.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author 11251
 *ArrayList 是实现List接口的动态数组，所谓动态是指它的容量大小是可变的。
 *ArrayList 底层是通过数组来实现的，许多操作都是通过数组+数组复制来实现的（System.arraycoyp()方法）。
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//无参构造函数创建 ArrayList
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		//以固定初始容量创建ArrayList
		ArrayList<Integer> al2 = new ArrayList<Integer>(25);
		al2.add(2);
		System.out.println(al2.size());
		//以指定集合创建ArrayList,该list种包含传入集合的所有元素，顺序为迭代器返回元素的顺序。
		ArrayList<Integer> al3 = new ArrayList<Integer>(new ArrayList<Integer>());
		al3.add(3);
		
		//Array List是现场不安全的，但我们可以通过其它方式创建线程安全的list.
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("线程同步的ArrayList。");
		
		int[] array = {1,2,3,4,5,6,7,8,9,0,};
		System.arraycopy(array, 5, array, 6, 4);
		
		System.out.println(array);
	}
}
