
public class note {
	public int i;
	public boolean b;
	public String[] string;
	public int[] js;
	
	public note(int i, boolean b, String[] string, int[] js){
		this.i = i;
		this.b = b;
		this.js = js;
		this.string = string;
	}
	
	public boolean containsJS(int[] js,int i){
		for(int j = 0;j <= js.length;j++ ){
			if(js[j] == i){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		String s = "("+i+", "+b+", [";
		for (int j = 0; j < string.length; j++) {
			s = s + string[j] + ", ";
		}

		s = s.substring(0,s.length()-2);
		s = s + "], [";

		for (int j = 0; j < js.length; j++) {
			s = s + js[j] + ", ";
		}

		s = s.substring(0,s.length()-2);
		s = s + "])";


		return s;
	}
}
