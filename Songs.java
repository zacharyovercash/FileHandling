package filehandling;

public class Songs {

	
	private String songName;
	private String artist;
	private String rating;
	private String singer;
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Songs(String songName, String artist, String rating, String singer) {
		super();
		this.songName = songName;
		this.artist = artist;
		this.rating = rating;
		this.singer = singer;
	}
	public Songs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Songs [songName=" + songName + ", artist=" + artist + ", rating=" + rating + ", singer=" + singer + "]";
	}
	
	
	
}
