package artur.matos;

public class Carro {
    //Propriedades do carro
	
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;


public Carro(String marca, String modelo, int anoFabricacao, String cor) {
    this.setMarca(marca);
    this.setModelo(modelo);
    this.setAnoFabricacao(anoFabricacao);
    this.setCor(cor);
    
    
    
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = "Fiat";
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = "Toro";
}


public int getAnoFabricacao() {
	return anoFabricacao;
}


public void setAnoFabricacao(int anoFabricacao) {
	this.anoFabricacao = 2021;
}


public String getCor() {
	return cor;
}


public void setCor(String cor) {
	this.cor = "Vermelho";
}
}

