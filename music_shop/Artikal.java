package domaci08272019;

public abstract class Artikal{
	private int id;
	private double cena;
	private int kolicina;
	private static int globalId = 1;

	public Artikal(double cena, int kolicina) {
		super();
		this.cena = cena;
		this.kolicina = kolicina;
		this.id = globalId;
		globalId++;
	}

	public abstract String ime();

	public boolean kupi() {
		if (kolicina > 0) {
			kolicina--;
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public double getCena() {
		return cena;
	}

	public int getKolicina() {
		return kolicina;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#" + id + ": " + ime() + "- " + cena + " [kol: " + kolicina + "]\t");
		return sb.toString();
	}

}
