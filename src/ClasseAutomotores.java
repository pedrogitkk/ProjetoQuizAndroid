public class ClasseAutomotores {
	String corAt;
	String marcaAt;
	String modeloAt;
	String tipoAt;
	
	public ClasseAutomotores(String corPar, String marcaPar, String modeloPar, String tipoPar) {
		this.corAt = corPar;
		this.marcaAt = marcaPar;
		this.modeloAt = modeloPar;
		this.tipoAt = tipoPar;
	}
	
	public String getCor() {
		return corAt;
	}
	
	public void setCor (String corAt) {
		this.corAt = corAt;
	}
	
	public String getMarca() {
		return marcaAt;
	}
	
	public void setMarca (String marcaAt) {
		this.marcaAt = marcaAt;
	}
	
	public String getModelo() {
		return modeloAt;
	}
	
	public void setModelo (String modeloAt) {
		this.modeloAt = modeloAt;
	}
	
	public String getTipo() {
		return tipoAt;
	}
	
	public void setTipo (String tipoAt) {
		this.tipoAt = tipoAt;
	}
}
