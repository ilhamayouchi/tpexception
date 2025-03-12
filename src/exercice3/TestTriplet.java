package exercice3;

public class TestTriplet {
	 public static void main(String[] args) {
	        Triplet<Integer> tripletInt = new Triplet<>(1, 2, 3);
	        tripletInt.affiche();

	        
	        Triplet<String> tripletStr = new Triplet<>("ens", "esef", "fse");
	        tripletStr.affiche();
	    }
}
