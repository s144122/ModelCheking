import java.util.ArrayList;

public class ts{
	public note note;
	public int noteCount = 0;
	
	public static ArrayList<note> notes = new ArrayList<note>();
	//public note[] notes = new note[999];
	
	public void add(int in, boolean bo, String[] strings, int[] jss) {
		note newNote = new note(in,bo,strings,jss);
		
		notes.add(newNote);
		
	}

	@Override
    public String toString() {
        String s = "Transition system:\n";

        for(note n : notes){
            s = s + n + "\n";
        }

        return s;
    }
}
