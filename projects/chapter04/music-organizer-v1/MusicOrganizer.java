import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    private String favoriteTrack;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    public void addFav()
    {
        files.add(favoriteTrack);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    public /**boolean*/ void checkIndex(int indexToCheck)
    {
        //boolean isIndexValid;
        if (!(indexToCheck >= 0 && indexToCheck < files.size())) {
            System.out.println("The index specified is outside the valid range.");
            System.out.println("Please specify an index between 0 and " + 
                (files.size() - 1) + ".");
            //isIndexValid = false;
        }
        else {
            System.out.println(indexToCheck + " is a valid index number.");
            //isIndexValid = true;
        }
        //return isIndexValid;
    }
    
    public boolean validIndex(int indexToCheck)
    {
        boolean isIndexValid;
        if (!(indexToCheck >=0 && indexToCheck < files.size())) {
            isIndexValid = false;
        }
        else {
            isIndexValid = true;
        }
        return isIndexValid;
    }
}
