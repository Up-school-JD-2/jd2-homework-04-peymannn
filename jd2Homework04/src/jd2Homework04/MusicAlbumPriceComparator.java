package jd2Homework04;

import java.util.Comparator;

public class MusicAlbumPriceComparator implements Comparator<MusicAlbum> {

	@Override
	public int compare(MusicAlbum o1, MusicAlbum o2) {
		if (o1.getPrice() == o2.getPrice()) {
			return 0;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		return 1;
	}
}
