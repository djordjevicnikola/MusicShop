package domaci08272019;

public abstract class AlbumArtikal extends Artikal {
	private String izdavac;
	private Album album;

	public AlbumArtikal(Album album, String izdavac, double cena, int kolicina) {
		super(cena, kolicina);
		this.izdavac = izdavac;
		this.album = album;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public Album getAlbum() {
		return album;
	}

	public abstract String ime();
}
