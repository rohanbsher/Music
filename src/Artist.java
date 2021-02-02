import java.util.Scanner;

public class Artist {
    //Instance Variables or Attributes
    private String name;
    private int yearsOfExp;
    private int numOfSongs;

    public Artist(String name, int yearsOfExp, int numOfSongs) {
        this.name = name;
        this.yearsOfExp = yearsOfExp;
        this.numOfSongs = numOfSongs;
    }

    public String getName(){ return name; }

    public void setName(String newName){
        this.name = newName;
    }

    public void ArtistInfo(){
        System.out.println("Artist name is " + name + " and has " +yearsOfExp+" years of experience "
                + "and has produced "+numOfSongs +" songs");
    }

}
