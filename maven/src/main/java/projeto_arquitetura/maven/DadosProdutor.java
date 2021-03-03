package projeto_arquitetura.maven;

public class DadosProdutor{

	
	private String nomeProdutor;
	private String dataProdutor;
	private String municipio;
	private double loteProdutor;
	private double areaTotal;
	private int talhao;
	private double areaTalhao;
	private int matriculaLote;
	private int texturaSolo;
	private int sistemaCultivo;
	private String respTecnico;
	private double profundAmostra;
	private int numAnalise;
	
	
	public String getNomeProdutor(){
		return nomeProdutor;
	}
	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}
	
	public String getDataProdutor(){
		return dataProdutor;
	}
	public void setDataProdutor(String dataProdutor) {
		this.dataProdutor = dataProdutor;
	}
	
	public String getMunicipio(){
		return municipio;
	}
	public void setMunicipio(String
			municipio) {
		this.municipio = municipio;
	}
	
	public double getLoteProdutor(){
		return loteProdutor;
	}
	public void setLoteProdutor(double loteProdutor) {
		this.loteProdutor = loteProdutor;
	}
	
	public double getAreaTotal(){
		return areaTotal;
	}
	public void setAreaTotal(String nomeProdutor) {
		this.areaTotal = areaTotal;
	}
	
	public int getTalhao(){
		return talhao;
	}
	public void setTalhao(int nomeProdutor) {
		this.talhao = talhao;
	}
	
	public double getAreaTalhao(){
		return areaTalhao;
	}
	public void setAreaTalhao(double areaTalhao) {
		this.areaTalhao = areaTalhao;
	}
	
	public int getMatriculaLote(){
		return matriculaLote;
	}
	public void setMatriculaLote(int matriculaLote) {
		this.matriculaLote = matriculaLote;
	}
	
	public int getTexturaSolo() {
		return texturaSolo;
	}
	public void setTexturaSolo(int texturaSolo) {
		 this.texturaSolo = texturaSolo;
	}
	
	
	public int getSistemaCultivo(){
		return sistemaCultivo;
	}
	public void setSistemaCultivo(int sistemaCultivo) {
		this.sistemaCultivo = sistemaCultivo;
	}
	
	public String getRespTecnico(){
		return respTecnico;
	}
	public void setRespTecnico(String respTecnico) {
		this.respTecnico = respTecnico;
	}
	
	public double getProfundAmostra(){
		return profundAmostra;
	}
	public void setProfundAmostra(double profundAmostra) {
		this.profundAmostra = profundAmostra;
	}
	
	public int getNumAnalise(){
		return numAnalise;
	}
	public void setNumAnalise(int numAnalise) {
		this.numAnalise = numAnalise;
	}

}
