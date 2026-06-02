package ru.Homework8;

public class Winamp {
    public static void main(String[] args) {

        //создаем плейлист
        Playlist myPlaylist = new Playlist("K-POP");

        //добавляем песни в плейлист
        System.out.println("--- Добавляем песни ---");
        myPlaylist.addSong("Stray Kids - Domino");
        myPlaylist.addSong("Aespa - Hold On Tight");
        myPlaylist.addSong("IVE - BANG BANG");
        myPlaylist.addSong("Catch Catch - YENA");

        System.out.println("--- Удаляем песни по индексу ---");
        myPlaylist.removeSongByIndex(1);

        //обновление песни по индексу
        System.out.println("--- Обновляем песни по индексу ---");
        myPlaylist.updateSongByIndex(2, "Nxde - i-dle");

        System.out.println("--- Получаем песню по индексу ---");
        myPlaylist.getSongByIndex(2);
    }
}
