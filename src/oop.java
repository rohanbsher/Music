import java.awt.*;
import java.util.Scanner;

public class oop {
    public static void main(String[] args) {

        System.out.println("What's your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("How many years of experience you have?");
        int yearsOfExp = scan.nextInt();

        System.out.println("How many songs have you produced?");
        int numOfSongs = scan.nextInt();


        scan.close();

        Artist artist = new Artist(name, yearsOfExp, numOfSongs);
       String nXame = artist.getName();
       System.out.println(nXame);
       //artist.setName("chelsey");

        Artist artist1 = new Artist(name, yearsOfExp, numOfSongs);
        artist.ArtistInfo();
        //artist1.ArtistInfo();

    }
}
