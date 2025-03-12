package exercice4;

public class TripletH <T, U, V> {
	
	    private T premier;
	    private U second;
	    private V troisieme;
		public TripletH(T premier, U second, V troisieme) {
			super();
			this.premier = premier;
			this.second = second;
			this.troisieme = troisieme;
		}
		public T getPremier() {
			return premier;
		}
		public void setPremier(T premier) {
			this.premier = premier;
		}
		public U getSecond() {
			return second;
		}
		public void setSecond(U second) {
			this.second = second;
		}
		public V getTroisieme() {
			return troisieme;
		}
		public void setTroisieme(V troisieme) {
			this.troisieme = troisieme;
		}
		 public void affiche() {
		        System.out.println("Triplet : (" + premier + ", " + second + ", " + troisieme + ")");
		    }

}
