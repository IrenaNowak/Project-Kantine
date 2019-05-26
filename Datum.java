public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	/**
	 * Constructor met parameters dag, maand en jaar.
	 * roept eerst de parameterloze constructor op met this()
	 */
	public Datum(int dag, int maand, int jaar) {
		this();
		if(bestaatDatum(dag, maand, jaar)) {
			this.dag = dag;
			this.maand = maand;
			this.jaar = jaar;
		}
	}

	/**
	 * Constructor zonder parameters
	 */
	public Datum() {
		dag = 0;
		maand = 0;
		jaar = 0;
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
	 * @param int dag voor de dag
	 */
	public void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * setter voor de maand int
	 * @param int maand voor de maand
	 */
	public void setMaand(int maand) {
		this.maand = maand;
	}

	/**
	 * setter voor de jaar int
	 * @param int jaar voor het jaar
	 */
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	/**
	 * checkt of de datum wel geldig is
	 * @return
	 */
	public boolean bestaatDatum(int dag, int maand, int jaar) {
		int[] maanden31D = {1, 3, 5, 7, 8, 10, 12};
		if(dag >= 1 && maand >= 1 && maand <= 12 && jaar >= 1900 && jaar <= 2100) {
			for(int x : maanden31D) {
				if (x == maand) {
					if(dag <= 31) {
						return true;
					}
				}
				else if (maand == 2) {
					if((jaar % 4) == 0 ) {
						if(dag <= 29){
							return true;
						}
					}
					else{
						if(dag <= 28) {
							return true;
						}

					}
				}
				else {
					if (dag <= 30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
