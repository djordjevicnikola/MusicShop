package domaci08272019;

public class LP extends AlbumArtikal {
	private int tezina;

	public LP(Album album, String izdavac, double cena, int kolicina, int tezina) {
		super(album, izdavac, cena, kolicina);
		this.tezina = tezina;
	}

	@Override
	public String ime() {
		String ime = "";
		ime += super.getAlbum().getIzvodjac() + " - " + super.getAlbum().getNaziv() + " (" + tezina + "g LP) ";
		return ime;

	}

}
