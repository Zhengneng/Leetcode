import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDup {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.push("111");
		list.add("222");
		list.push("333");
		list.add("444");
		list.remove("11");
		showList(list);
		list.pop();
		list.remove();
		showList(list);
	}

	private static void showList(LinkedList<String> list) {
		// TODO Auto-generated method stub
		 System.out.println(Arrays.toString(list.toArray()));
	}
}
