package domaci08272019;

public class Album {
	private String naziv;
	private String izvodjac;
	public MuzickaNumera[] nizPesama;
	private int brPesama = 0;

	public Album(String naziv, String izvodjac) {
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		nizPesama = new MuzickaNumera[5];
	}

	public void dodaj(MuzickaNumera mn) {
		if (brPesama == nizPesama.length) {
			System.out.println("Vec postoji 5 pesama.");
		} else {
			nizPesama[brPesama++] = mn;
		}
	}

	public void dodaj(String name, String trajanje) {
		MuzickaNumera nova = new MuzickaNumera(name, this.izvodjac, trajanje);
		this.dodaj(nova);
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}
	public MuzickaNumera getMuzickaNumera(int index) {
		return this.nizPesama[index];
	}

	public void provera() {

	}

	public MuzickaNumera getMuzickaNumera(String ime) {
		MuzickaNumera nova = new MuzickaNumera();
		for (int i = 0; i < nizPesama.length; i++) {
			if (this.nizPesama[i].getNaziv().equals(ime)) {
				nova = this.nizPesama[i];
				break;
			}
		}
		return nova;
	}

	public String toString() {
		String ispis = "";
		ispis += izvodjac + " - " + naziv + ":[";
		for (int i = 0; i < nizPesama.length; i++) {
			if(this.nizPesama[i]!=null)
			ispis += "\n\t" + this.nizPesama[i];
		}
		ispis += "\n] \n//predao bez ukupnog vremena jer, zbog roka za predaju domaceg, nisam stigao da zavrsim\n";
		return ispis;
	}
}
