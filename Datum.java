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
	 * Getter voor String weergave van datum
	 *
	 * @return String van de datum
	 */
	public String getDatumAsString() {
		// TODO
		return String.format("{0:D2}-{1:D2}-{2}", dag, maand, jaar);
	}

	/**
	 * Getter voor de int dag
	 *
	 * @return dag van de datum
	 */
	public int getDag() {
		return dag;
	}

	/**
	 * Getter voor de int maand
	 *
	 * @return maand van de datum
	 */
	public int getMaand() {
		return maand;
	}

	/**
	 * Getter voor de int jaar
	 *
	 * @return jaar van de datum
	 */
	public int getJaar() {
		return jaar;
	}

	/**
	 * Setter voor de dag int
	 *
	 * @param dag voor de dag
	 */
	public void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * Setter voor de maand int
	 *
	 * @param maand voor de maand
	 */
	public void setMaand(int maand) {
		this.maand = maand;
	}

	/**
	 * Setter voor de jaar int
	 *
	 * @param jaar voor het jaar
	 */
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	/**
	 * Checkt of de datum wel geldig is
	 *
	 * @return true or false wanneer de datum wel of niet bestaat
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
