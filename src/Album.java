import java.util.ArrayList;
import java.util.List;

public class Album {
	
	private String name;
	private String singerName;
	private String date;
	private String listOfSongs;
	private double price;

	public Album(String name, String singerName, String date, String listOfSongs, double price) {
		this.name = name;
		this.singerName = singerName;
		this.date = date;
		this.listOfSongs = listOfSongs;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getlistOfSongs() {
		return listOfSongs;
	}
	public void setListOfSongs(String listOfSongs) {
		this.listOfSongs = listOfSongs;
	}
	
	public void printInfo() {	
		System.out.println("---------------------");
		System.out.println("Albüm adı: " + name);
		System.out.println("Şarkıcı adı: " + singerName);
		System.out.println("Yayın tarihi: " + date);
		System.out.println("Şarkı listesi: " + listOfSongs);
		System.out.println();
	}

}
