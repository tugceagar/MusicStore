import java.util.ArrayList;
import java.util.List;

public class Item {
	
	private Album album;  
	static public double totalPrice = 0;
	List<Album> albums = new ArrayList<>();
	List <Song> songs = new ArrayList <>();
	
	public Item() {
		
	}
	
	public Item(Album album, double price) {
		this.album = album;
		this.totalPrice = price;
	}
	
	public void add(Album album) {
		albums.add(album);
	}
	public void add(Song song) {
		songs.add(song);
	}
	public void remove(Album album) {
		albums.remove(album);
	}
	public void remove(Song song) {
		songs.remove(song);
	}
	public Album getItemName() {
		return album;
	}
	public void setItemName(Album album) {
		this.album = album;
	}
	public double getPrice() {
		return totalPrice;
	}
	public void setPrice(double price) {
		this.totalPrice = price;
	}
	
	public void printItemInfo(Album album) {	
		System.out.println("---------------------");
		System.out.println("Albüm Adı:" + album.getName());
		System.out.println("Fiyatı:" + album.getPrice());
	}
	public void printItemInfo(Song song) {
		System.out.println("---------------------");
		System.out.println("Şarkı Adı:" + song.getSongName());
		System.out.println("Fiyatı:" + song.getPrice());
	}
}
