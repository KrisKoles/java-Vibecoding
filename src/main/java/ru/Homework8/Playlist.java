package ru.Homework8;

import java.util.ArrayList;

public class Playlist {

    String playlistName;
    ArrayList<String> songs;

    //конструктор
    public Playlist(String playlistName){
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    //метод добавления песни в плейлист
    public void addSong(String songName) {
        songs.add(songName);
        System.out.println("Песня \"" + songName + "\" добавлена в плейлист \"" + playlistName + "\"");
    }

    //метод удаления песни по индексу
    public void removeSongByIndex(int index) {
        String removedSong = songs.get(index);
        songs.remove(index);
        System.out.println("Песня \"" + removedSong + "\" удалена");
    }

    //обновление песни по индексу
    public void updateSongByIndex(int index, String newSongName){
        String oldSong = songs.get(index);
        songs.set(index, newSongName);
        System.out.println("Песня \"" + oldSong + "\" заменена на \"" + newSongName + "\"");
    }

    //получение песни по индексу
    public String getSongByIndex(int index) {
        String song = songs.get(index);
        System.out.println("Песня \"" + song + "\" получена");
        return song;

    }
}
