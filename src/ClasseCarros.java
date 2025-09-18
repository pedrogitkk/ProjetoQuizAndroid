public class ClasseCarros extends ClasseAutomotores{

	int quantPortaAt;
	
	public ClasseCarros(String corPar, String marcaPar, String modeloPar, String tipoPar, int quantPortaPar) {
		super("Azul", "Volkswagen", "Jetta", "Tração trazeira");
		this.quantPortaAt = quantPortaPar;
	}
	public float getQuantPorta() {
		return quantPortaAt;
	}
	
	public void setQuantPorta (int quantPortaAt) {
		this.quantPortaAt = quantPortaAt;
	}
}