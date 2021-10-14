package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //my favorite scanner instance :)
        Song song = new Song();                     //and my favorite instance of song :)

        System.out.println("Your favorite song's title:");
        song.title = scanner.nextLine();

        System.out.println("Your favorite song's performer:");
        song.band = scanner.nextLine();

        System.out.println("Your favorite song's length in minutes:");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");
    }
}
