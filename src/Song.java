
public class Song {
	
	private String songName;
	private Album album;
	private double minutes;
	private String singerName;
	private double price;

	public Song(String songName, Album album, double minutes, String singerName, double price) {
		this.songName = songName;
		this.album = album;
		this.minutes = minutes;
		this.singerName = singerName;
		this.price = price;
	}
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public double getMinutes() {
		return minutes;
	}
	public void setMinutes(double minutes) {
		this.minutes = minutes;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void printSongInfo() {	
		System.out.println("---------------------");
		System.out.println("Şarkı Adı: " + songName);
		System.out.println("Album Adı: " + album.getName());
		System.out.println("Sanatçı Adı: " + singerName);
		System.out.println("Uzunluğu: " + minutes);
		System.out.println();

	}
}
