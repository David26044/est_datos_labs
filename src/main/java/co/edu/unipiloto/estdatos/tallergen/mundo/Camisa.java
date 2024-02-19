package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario{
	
	public enum Marca
	{
		GEF, NAUTICA, POLO;
	}
	
        private Marca marca;
        
	public Camisa(Marca pMarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pMarca;
	}
	
	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}
