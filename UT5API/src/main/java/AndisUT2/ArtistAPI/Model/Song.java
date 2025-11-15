package AndisUT2.ArtistAPI.Model;

public class Song {

    private int songId;
    private String songName;
    private int artistId;
    private int albumId;

    public Song(int songId, String songName, int artistId, int albumId) {
        this.songId = songId;
        this.songName = songName;
        this.artistId = artistId;
        this.albumId = albumId;
    }

    public Song(String songName, int artistId, int albumId) {
        this.songName = songName;
        this.artistId = artistId;
        this.albumId = albumId;
    }

    public Song(){}

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}