package jd2Homework04;

import java.util.Comparator;

public class MusicAlbumIDComparator implements Comparator<MusicAlbum> {

	@Override
	public int compare(MusicAlbum o1, MusicAlbum o2) {
		if (o1.id == o2.id) {
			return 0;
		} else if (o1.id < o2.id) {
			return -1;
		}
		return 1;
	}
}
