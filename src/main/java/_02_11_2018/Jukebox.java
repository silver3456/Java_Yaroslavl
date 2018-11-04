package _02_11_2018;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox {

    private ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        new Jukebox().go();
    }

    private void go() throws FileNotFoundException {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

    }

    private void getSongs() throws FileNotFoundException {
        try {
            File file = new File("/Users/alexander/Desktop/Songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);

    }
}
