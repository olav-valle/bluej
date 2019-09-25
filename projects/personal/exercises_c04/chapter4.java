public void listAllFiles()
{
	for(File file: files) {
		System.out.println(file.getInfo());
	}
	
}


// Ex. 4.26
public void listMatching(String searchString)
{
	boolean found = false;
	
	for(File file: files) {
		if(file.getName.equals(searchString));
			System.out.println(file.getName);
			found = true;
	}
	
	if(!found){
		System.out.println("No match found.");
	}		
}


public void listTracks()
{
	for(Track track: tracks){
		System.out.println(track.getName());
	}
}
