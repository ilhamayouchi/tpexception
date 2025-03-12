package exercice3;

class Triplet<T> {
    private T premier;
    private T second;
    private T troisieme;
    
	public Triplet(T premier, T second, T troisieme) {
		
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

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public T getTroisieme() {
		return troisieme;
	}

	public void setTroisieme(T troisieme) {
		this.troisieme = troisieme;
	}

	public void affiche() {
        System.out.println("(" + premier + ", " + second + ", " + troisieme + ")");
    }
	
    
}
