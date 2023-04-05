
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class MusicSystem {
	
	Item item;
	User user;
	private List<Album> albums;
	private List<Song> songs;
	private List<User> users;
	private List<Item> items;
	List<Album> buyAlbumList = new ArrayList<>(); 
	
	public MusicSystem(Item item) {
		albums = new ArrayList<>();
		songs = new ArrayList<>();
		users = new ArrayList<>();
		items = new ArrayList<>();
		this.item = item;
	}
	
	public void addAlbum(Album album) {
		this.albums.add(album);
	}
	public void removeAlbum(Album album) {
		this.albums.remove(album);
	}
	public void addUser(User user) {
		this.users.add(user);
	}
	public void addSong(Song song) {
		this.songs.add(song);
	}
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Album album) {
		this.items.remove(album);
		
	}
	
	public void listAlbums() {
		System.out.println("------ Albüm Listesi ------");
		for (Album album : albums) {
			album.printInfo();
		}
	}

	public void listSongs() {
		System.out.println("------ Şarkı Listesi ------");
		for(Song song : songs) {
			song.printSongInfo();
		}
	}
	
	public void listUsers() {
		System.out.println("------ Kullanıcılar ------");
		for(User user : users) {
			user.printUserInfo();
		}
	}
	public void listItem() {
		System.out.println("------ Sepetteki Ürünler ------");
		for(Album album : item.albums) {
			item.printItemInfo(album);	
		}
		for(Song song : item.songs) {
			item.printItemInfo(song);
			
		}
		System.out.println("Toplam fiyat: " + item.totalPrice); 
	}

		
	

	public void buyAlbum(String albumName){	
		Album album = null;
		boolean albumCtr = false;
		for(Album a : albums) {
			if(a.getName().equalsIgnoreCase(albumName)) {
				album = a;
				albumCtr = true;
				break;
			}
		}
		if(albumCtr == true) {
			System.out.println("Albüm sepete eklendi.");
			item.add(album);
			Item.totalPrice += album.getPrice();
		}else {
			System.out.println("Hatalı bilgi girişi");
		}		
	}
	
	
	public void buySong(String songName){	
		Song song = null;
		boolean songCtr = false;
		for(Song s : songs) {
			if(s.getSongName().equalsIgnoreCase(songName)) {
				song = s;
				songCtr = true;
				break;
			}
		}
		if(songCtr == true ) {
			System.out.println("Şarkı sepete eklendi.");
			item.add(song);
			Item.totalPrice += song.getPrice();
		}else {
			System.out.println("Hatalı bilgi girişi");
		}		
	}
			
			
		}




	
	

