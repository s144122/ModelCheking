
public class main {

	public static void main(String[] args){
		ts.add(1, true, new String[] {"v"}, new int[] {2});
		ts.add(2, false, new String[] {"v"}, new int[] {1, 4});
		ts.add(3, false, new String[] {"c"}, new int[] {3});
		ts.add(4, false, new String[] {"c"}, new int[] {4});
		
		for(int j = 0; j < 10; j++){
			System.out.println(ts.notes[j].i);
		}
	}
}
