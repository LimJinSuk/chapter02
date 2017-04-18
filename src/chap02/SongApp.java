package chap02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song("좋은날","아이유","Real","이민수",2010,3);
		
		/*song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);
		*/
		song.show();
		
		Song song2 = new Song("She's baby", "지코");
		song2.show();
		
		Song song3 = new Song("얼굴 찌푸리지 말아요", "하이라이트");
		song3.show();
	}

}
