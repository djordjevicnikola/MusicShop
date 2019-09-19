package domaci08272019;

public class CD extends AlbumArtikal {

	public CD(Album album, String izdavac, double cena, int kolicina) {
		super(album, izdavac, cena, kolicina);
	}

	@Override
	public String ime() {
		String ime = "";
		ime += super.getAlbum().getIzvodjac() + " - " + super.getAlbum().getNaziv()+" (CD) ";
		return ime;
	}

}
