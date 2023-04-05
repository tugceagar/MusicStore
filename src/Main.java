import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User user1 = new User("Tuğçe", "Ağar", "001");
		
		Album album = new Album("Karma", "Tarkan", "2001", "Kuzu kuzu, ölürüm sana ", 10.5);
		Album album2 = new Album("A Night at the Opera", "Queen", "1975", "Bohemian Rhapsody, Im in love with my car", 15.00);
		Album album3 = new Album("Nevermind", "Nirvana", "1991", "Come as you are , Something in the Way, Smells Like Teen Spirit", 20.45);
		
		Song song = new Song("Kuzu kuzu", album, 4.05, "Tarkan", 5.45);
		Song song2 = new Song("Ölürüm Sana", album, 4.07, "Tarkan", 6.23);
		Song song3 = new Song("Bohemian Rhapsody", album2, 6.03, "Queen", 4.33);
		Song song4 = new Song("Im in love with my car", album2, 2.17, "Queen", 7.54);
		Song song5 = new Song("Come as you are", album3, 5.13, "Nirvana", 6.55);
		Song song6 = new Song("Something in the Way", album3, 5.53, "Nirvana", 7.00);
		Song song7 = new Song("Smells Like Teen Spirit", album3, 5.33, "Nirvana", 5.00);

		Item item = new Item();

		
		MusicSystem musicSystem = new MusicSystem(item);
		
		musicSystem.addAlbum(album);
		musicSystem.addAlbum(album2);
		musicSystem.addAlbum(album3);
		
		musicSystem.addSong(song);
		musicSystem.addSong(song2);
		musicSystem.addSong(song3);
		musicSystem.addSong(song4);
		musicSystem.addSong(song5);
		musicSystem.addSong(song6);
		musicSystem.addSong(song7);

		musicSystem.addUser(user1);
		
		boolean quit = false;
		do {
			System.out.println("1. Kullanıcı bilgilerini görüntüle");
			System.out.println("2. Albüm listesini görüntüle");
			System.out.println("3. Şarkı listesini görüntüle");
			System.out.println("4. Albüm satın al");
			System.out.println("5. Şarkı satın al");
			System.out.println("6. Sepeti görüntüle");
			System.out.println("7. Satın al");
			System.out.println("8. Çıkmak istiyorsanız");
			System.out.println("Enter a number between 1-8:");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1->{
				musicSystem.listUsers();
			}
			
			case 2->{
				musicSystem.listAlbums();
						
				}
	
			case 3->{
				musicSystem.listSongs();
			}
			case 4->{
					
				System.out.println("Almak istediğiniz albüm adını giriniz: " );
				String albumName = sc.nextLine();
				albumName = sc.nextLine();
				musicSystem.buyAlbum(albumName);
				
			}
			case 5 ->{
			System.out.println("Almak istediğiniz şarkı adını giriniz: " );
			String songName = sc.nextLine();
			songName = sc.nextLine();
			musicSystem.buySong(songName);
				
			}
			case 6 ->{
				musicSystem.listItem();
				System.out.println();
			}
			
			
			case 7->{
				System.out.println("Albümler Satın Alındı.");
				Item.totalPrice = 0;
				item.remove(album3);
				item.remove(album2);
				item.remove(album);
				item.remove(song7);
				item.remove(song6);
				item.remove(song5);
				item.remove(song4);
				item.remove(song3);
				item.remove(song2);
				item.remove(song);
				
			}
			
			case 8->{
				quit = true;
			}	
			
			default ->{
				System.out.println("Lütfen geçerli bir sayi giriniz.");
				System.out.println();
			}
	}

		}while(quit!= true);
	}
}