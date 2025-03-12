package exercice4;

public class TestTripletH {
	public static void main(String[] args) {
        TripletH<Integer, String, Double> triplet1 = new TripletH<>(21, "ilham", 3.14);
        triplet1.affiche();

        
        TripletH<String, Boolean, Integer> triplet2 = new TripletH<>("Java", true, 99);
        triplet2.affiche();

       
    }

}
