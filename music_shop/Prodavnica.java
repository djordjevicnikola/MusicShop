package domaci08272019;

public class Prodavnica {
	private String ime;
	private String lokacija;
	private Artikal[] inventar;
	private int brArtikala = 0;

	public Prodavnica(String ime, String lokacija) {
		super();
		this.ime = ime;
		this.lokacija = lokacija;
		inventar = new Artikal[10];
	}

	public void dodaj(Artikal a) {
		if (brArtikala < inventar.length) {
			inventar[brArtikala++] = a;
		}
	}

	public Artikal[] pretrazi(String tekst) {
		int br = 0;
		String tekst1 = tekst.toLowerCase();
		for (int i = 0; i < brArtikala; i++) {
			String ime = inventar[i].ime().toLowerCase();
			if (ime.contains(tekst1))
				br++;
		}
		Artikal[] noviNiz = new Artikal[br];
		int j = 0;
		for (int i = 0; i < brArtikala; i++) {
			String ime = inventar[i].ime().toLowerCase();
			if (ime.contains(tekst1))
				noviNiz[j++] = inventar[i];
		}
		return noviNiz;
	}

	public String getIme() {
		return ime;
	}

	public String getLokacija() {
		return lokacija;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime + ": " + lokacija + " [\t");
		for (int i = 0; i < brArtikala; i++) {
			sb.append("\n\t"+inventar[i].toString());
		}
		sb.append("\n]");
		return sb.toString();
	}

}
