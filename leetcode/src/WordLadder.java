import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	public int ladderLength(String start, String end, HashSet<String> dict) {
		Set<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		queue.offer(start);
		int leftCount = 0;
		int step = 0;
		while(!queue.isEmpty()){
			if(leftCount==0){
				leftCount = queue.size();
				step++;
			}
			String node = queue.poll();
			leftCount--;
			char[] cs = node.toCharArray();
			for(int i=0;i<cs.length;i++){
				char tmp = cs[i];
				for(char c='a';c<='z';c++){
					if(c == tmp)
						continue;
					cs[i] = c;
					String str = new String(cs);
					if(str.equals(end)){
						return ++step;
					}
					if(dict.contains(str) && !visited.contains(str)){
						queue.offer(str);
						visited.add(str);
					}
				}
				cs[i] = tmp;
			}
		}
		return 0;
	}
}
