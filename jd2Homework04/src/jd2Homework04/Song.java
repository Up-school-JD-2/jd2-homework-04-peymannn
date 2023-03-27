package jd2Homework04;

public class Song {

	public Song(String title, String songClass, String artistName, int length) {
		
		this.title = title;
		this.songClass = songClass;
		this.artistName = artistName;
		this.length = length;
	}
	private String title;
	private String songClass;
	private String artistName;
	private int length;
	private MusicAlbum album;
	
	public void setAlbum(MusicAlbum album) {
		this.album = album;
	}
	public String toString() {
		
		System.out.println("title: " + title);
        System.out.println("songClass: " + songClass);
        System.out.println("artistName: " + artistName);
        System.out.println("length:" + length+" minute");
        System.out.println();
		return "";
		
	}


}
