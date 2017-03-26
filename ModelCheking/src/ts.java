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


	@SuppressWarnings("rawtypes")
	public ArrayList AP(String string){
		ArrayList<note> noteW = new ArrayList<note>();
		for(int i = 0; i < notes.size();i++){

			String s = new String();
			for (int j = 0; j < string.length(); j++) {
				s = s + notes.get(i).string[j];

				if(s.equals(string)){
					noteW.add(notes.get(i));
				}

			}	
		}
		return noteW;
	}

	public ArrayList EX(ArrayList<note> list)
	{
		ArrayList<note> noteW = list;
		for(int i = 0;  i <= notesOut.size(); i++)
		{
			for(int j = 0;  j <= list.size(); j++)
			{
				if(!note.containsJS(notesOut.get(i).js, list.get(j).i))
				{
					noteW.remove(i);
				}
			}
		}
		return noteW;
	}

	public ArrayList AX(ArrayList<note> list)
	{
		ArrayList<note> noteW = list;
		for(int i = 0;  i <= notesOut.size(); i++)
		{
			for(int j = 0;  j <= list.size(); j++)
			{
				if(!note.containsJS(notesOut.get(i).js, list.get(j).i))
				{
					noteW.remove(i);
				}
			}
		}
		return noteW;
	}


	public boolean EFF(note n, String phi){
		String s = new String();

		for (int j = 0; j < n.string.length; j++) {
			s = s + n.string[j];
			if(s.equals(phi)){
				return true;

			}
			else{
				for(int i = 0; i < n.js.length; i++){
					if(notes.get(n.js[i]-1) == n){
						return false;
					}
					EFF(notes.get(n.js[i]-1),phi);
					
				}
			}
		}
		return false;
	}

	public ArrayList<note> EF(ArrayList<note> list, String phi){
		ArrayList<note> listOut = new ArrayList<note>();
		
		System.out.println(list);
		for(int i = 0; i < list.size();i++){
			if(EFF(list.get(i),phi)){
				listOut.add(list.get(i));
			}

		}
		return listOut;
	}

	public ArrayList AF(ArrayList<note> list)
	{
		ArrayList<note> noteW = list;
		  	
		return noteW;
	}
	
	public ArrayList EG(ArrayList<note> list)
	{
		ArrayList<note> noteW = list;
		for(int i = 0;  i <= notesOut.size(); i++)
		{
			for(int j = 0;  j <= list.size(); j++)
			{
				if(!note.containsJS(notesOut.get(i).js, list.get(j).i) && !note.containsJS(list.get(j).js , notesOut.get(i).i))
				{
					noteW.remove(i);
				}
			}
		}    	
		return noteW;
	}

	public ArrayList AG(ArrayList<note> list)
	{
		ArrayList<note> noteW = list;
		for(int i = 0;  i <= notesOut.size(); i++)
		{
			for(int j = 0;  j <= list.size(); j++)
			{
				if(!note.containsJS(notesOut.get(i).js, list.get(j).i) && !note.containsJS(list.get(j).js , notesOut.get(i).i))
				{
					noteW.remove(i);
				}
			}		
		}
		return noteW;
	}
}
