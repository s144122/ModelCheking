import java.util.ArrayList;

public class ts{
	public note note;
	public int noteCount = 0;

	public ArrayList<note> notes = new ArrayList<note>();
	public ArrayList<note> notesOut = new ArrayList<note>();
	//public note[] notes = new note[999];

	public void add(int in, boolean bo, String[] strings, int[] jss) {
		note newNote = new note(in,bo,strings,jss);
		notes.add(newNote);
		notesOut.add(newNote);
	}
	

	@Override
	public String toString() {
		String s = "Transition system:\n";

		for(note n : notes){
			s = s + n + "\n";
		}

		return s;
	}

	public void ctlEX(String s){
		for(int i = 0;  i < notesOut.size(); i++){
			if (!notesOut.get(i).string.equals(s)){
				notesOut.remove(i);
			}
		}
	}


	public void ctlAX(String s){
		for(int i = 0;  i < n1.js.length; i++){
			if (n1.js[i] == n2.i){
			}
			ctlAX(notes.get(n1.js[i]),n2);
		}
	}
}

public void ctlEF(String s){

}



}
