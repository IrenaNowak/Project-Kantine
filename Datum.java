public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	/**
	 * Constructor
	 */
	public Datum(int dag, int maand, int jaar) {
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}

	public Datum() {
		dag = 0;
		maand = 0;
		jaar = 0;
	}

	public boolean bestaatDatum(int dag, int maand, int jaar){
		// TODO
		return false;
	}

	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	public String getDatumAsString() {
		// TODO
		return "";
	}

	/**
	 * getter voor de int dag
	 * @return Dag als int
	 */
	public int getDag() {
		return dag;
	}

	/**
	 * getter voor de int maand
	 * @return Maand als int
	 */
	public int getMaand() {
		return maand;
	}

	/**
	 * getter voor de int jaar
	 * @return Jaar als int
	 */
	public int getJaar() {
		return jaar;
	}

	/**
	 * setter voor de dag int
	 */
	public void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * setter voor de maand int
	 */
	public void setMaand(int maand) {
		this.maand = maand;
	}

	/**
	 * setter voor de jaar int
	 */
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

}
