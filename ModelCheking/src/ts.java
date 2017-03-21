//import java.util.ArrayList;

public class ts{
	public note note;
	public int noteCount = 0;
	
	//public static ArrayList<note> notes;
	public note[] notes = new note[999];
	
	public void add(int in, boolean bo, String[] strings, int[] jss) {
		note newNote = new note(in,bo,strings,jss);
		
		notes[noteCount+1] = newNote;

		
		
	}
}
