package com.demo.basics;

public class SongApp {
	public static void main(String [] args) {
		
		// access static method
		Album.getCompanyName();
		
		// create object using Album class(blueprint)
		Album adele;
		Album billieEilishAlbum;
		
		// instance: create memory - only happens when new is used
		adele = new Album();
		billieEilishAlbum = new Album();
		
		// assign the values for new album 
		adele.singer = "Adele";
		adele.title = "30";
		adele.genre = "Pop";
		adele.totalSongs = 12;
		adele.label = "Columbia Records";
		adele.available = true;
		adele.grade = 'A';

		billieEilishAlbum.singer = "Billie Eilish";
		billieEilishAlbum.title = "Happier Than Ever"; 
		billieEilishAlbum.genre = "Indie";
		billieEilishAlbum.totalSongs = 16;
		billieEilishAlbum.label = "Enchanted"; 
		billieEilishAlbum.available = false;
		billieEilishAlbum.grade = 'A';
		
/* static belongs to one memory location 
 * by changing one of it, it will apply to 
 * all that is in the file 
 */
		adele.siteString = "Goofle";
			
		// get the details
		adele.getAlbum();
		System.err.println(adele.SELLER_AGENT);
		System.err.println(Album.siteString);
		
		System.out.println("----------");
		
		
		billieEilishAlbum.getAlbum();
		System.err.println(billieEilishAlbum.SELLER_AGENT);
		System.err.println(Album.siteString);
	}

}
