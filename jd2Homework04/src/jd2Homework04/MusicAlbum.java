package jd2Homework04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MusicAlbum {

	public MusicAlbum(int id, String albumName, String artistName, Date releaseDate, ArrayList<Song> songs,
			double price) {
		this.id = id;
		this.albumName = albumName;
		this.artistName = artistName;
		this.releaseDate = releaseDate;
		this.songs = songs;
		this.price = price;
	}

	public MusicAlbum() {
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	int id;
	private String albumName;

	public String getAlbumName() {
		return albumName;
	}

	private String artistName;
	private double price;

	public double getPrice() {
		return price;
	}

	private Date releaseDate;
	private ArrayList<Song> songs;

	public void printAlbumInfo() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("album id: " + id);
		System.out.println("albumName: " + albumName);
		System.out.println("artistName: " + artistName);
		System.out.println("price:" + price + " TL");
		System.out.println("releaseDate: " + formatter.format(releaseDate));
		System.out.println("--------------");
		System.out.println("Song Info");
		System.out.println("--------------");
		for (Song song : songs) {
			song.toString();
		}
		System.out.println("----------------------------");
	}

}
