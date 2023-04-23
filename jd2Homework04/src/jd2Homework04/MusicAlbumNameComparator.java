package jd2Homework04;

import java.util.Comparator;

public class MusicAlbumNameComparator implements Comparator<MusicAlbum> {

	@Override
	public int compare(MusicAlbum o1, MusicAlbum o2) {
		if (o1.getAlbumName().equalsIgnoreCase(o2.getAlbumName())) {
			return 0;
		}
		return -1;
	}

}
