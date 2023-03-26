package jd2Homework04;

import java.util.ArrayList;

public class Basket {

	
	public Basket(int basketId, Customer customer) {
		this.basketId = basketId;
		this.customer = customer;
		this.albums = new ArrayList<MusicAlbum>();
	}

	private int basketId;
	private Customer customer;
	private ArrayList<MusicAlbum> albums;

	public ArrayList<MusicAlbum> getAlbums() {
		return albums;
	}

	public void setAlbums(ArrayList<MusicAlbum> albums) {
		this.albums = albums;
	}

	public void printBasketInfo() {
		if (albums != null && customer != null) {
			System.out.println("--------------Basket Info--------------");

			System.out.println("Basket Product");
			for (MusicAlbum album : albums) {
				System.out.println("Album Name: " + album.getAlbumName());
				System.out.println("Album Price: " + album.getPrice());
				System.out.println("       ----------         ");
			}
			System.out.println("basketId: " + basketId);
			System.out.println("CustomerName: " + customer.getUserName());
			System.out.println("Total Price :" + totalPrice());
			System.out.println("       ----------         ");

		} else {
			System.out.println("Basket is Empty");
			System.out.println("       ----------         ");

		}
	}

	public void removeAlbum(int musicAlbumId) {
		boolean isThere = false;
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).equals(musicAlbumId)) {
				isThere = true;
				albums.remove(i);
				break;
			}
		}
		if (!isThere) {
			System.out.println("There is not musicAlbumId: " + musicAlbumId);
			System.out.println("       ----------         ");
		}
	}
	public void addAlbum(MusicAlbum musicAlbum) {		
		boolean isThere = false;
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).equals(musicAlbum.id)) {
				isThere = true;	
				System.out.println("music Album could not Added. because this id already exist");
				System.out.println("       ----------         ");
				break;
			}
		}
		if (!isThere) {
			this.albums.add(musicAlbum);
			System.out.println("music Album Added");
			System.out.println("       ----------         ");
		}
	}

	public void buyInBasketAlbums() {
		System.out.println("Shopping Finished.");
		System.out.println("       ----------         ");
		this.albums = null;
		this.customer = null;
		this.basketId = 0;
	}

	public void searchAlbum(int musicAlbumId) {
		boolean isThere = false;
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).equals(musicAlbumId)) {
				isThere = true;
				albums.get(i).printAlbumInfo();
				break;
			}
		}
		if (!isThere) {
			System.out.println("There is not musicAlbumId: " + musicAlbumId);
			System.out.println("       ----------         ");
		}
	}

	private double totalPrice() {
		double sum = 0;
		for (MusicAlbum album : albums) {
			sum += album.getPrice();
		}
		return sum;
	}

}
