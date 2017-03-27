import java.util.ArrayList;

public class ts{
	public note note;
	public int noteCount = 0;

	public ArrayList<note> notes = new ArrayList<note>();
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

	public ArrayList EX(ArrayList<note> list, String s)
	{
		ArrayList<note> listOut = new ArrayList<note>();
		String s1 = new String();
		
		for(int j = 0;  j < list.size(); j++)
		{
			//IF its already in phi, add to list.
			if( list.get(j).string[0].equals(s))
			{
				listOut.add(list.get(j));
			}
			
			//IF it can move phi in one step, add to list.
			for(int i = 0; i < notes.size(); i++)
			{
				for (int j1 = 0; j1 < list.get(j).string.length; j1++) {
					
					s1 = s1 + list.get(j).string[j1];
					//System.out.println(s1.equals(s));
					if(s1.equals(s)){
						listOut.add(list.get(j));
						
					}
				}
				
			}
		}
		
		return listOut;
	}

	public ArrayList AX(ArrayList<note> list, String s)
	{
		ArrayList<note> listOut = new ArrayList<note>();
		String s1 = new String();
		
		for(int j = 0;  j < list.size(); j++)
		{
			//IF its already in phi, add to list.
			if( list.get(j).string[0].equals(s))
			{
				listOut.add(list.get(j));
			}
			
			//IF it can move phi in one step, add to list.
			for(int i = 0; i < notes.size(); i++)
			{
				for (int j1 = 0; j1 < list.get(j).string.length; j1++) {
					
					s1 = s1 + list.get(j).string[j1];
					//System.out.println(s1.equals(s));
					if(s1.equals(s)){
						listOut.add(list.get(j));
						
					}
				}
				
			}
		}
		
		return listOut;
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

	public boolean AFF(note n, String phi){
		String s = new String();

		for (int j = 0; j < n.string.length; j++) {
			s = s + n.string[j];
			if(!s.equals(phi)){
				return false;

			}
			else{
				for(int i = 0; i < n.js.length; i++){
					if(notes.get(n.js[i]-1) == n){
						return true;
					}
					AFF(notes.get(n.js[j]-1),phi);
				}
			}
		}
		return false;
	}
	
	public ArrayList AF(ArrayList<note> list,String phi)
	{
		ArrayList<note> listOut = new ArrayList<note>();
		System.out.println(list);
		for(int i = 0; i < list.size();i++){
			if(AFF(list.get(i),phi)){
				listOut.add(list.get(i));
			}
		}
		return listOut;
	}
	
	public ArrayList EG(ArrayList<note> list, String s)
	{
		ArrayList<note> listOut = new ArrayList<note>();
		String s1 = new String();
		
		for(int i = 0;  i < list.size(); i++)
		{	
			for(int j = 0; j < list.size(); j++)
			{
				if((list.get(i).js[0] == list.get(j).i) && (list.get(j).js[0] == list.get(i).i))
				{
					listOut.add(list.get(i));
				}
			}
		
		}    	
		return listOut;
	}

	public ArrayList AG(ArrayList<note> list, String phi)
	{
		ArrayList<note> listOut = new ArrayList<note>();
		System.out.println(list);
		for(int i = 0; i < list.size();i++){
			if(AFF(list.get(i),phi)){
				listOut.add(list.get(i));
			}
		}
		return listOut;
	}
}
