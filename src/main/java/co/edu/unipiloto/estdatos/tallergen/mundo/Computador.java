/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author ACER
 */
public class Computador extends Electronico {

    private SOperativo sOperativo ;
    
    public enum SOperativo {
        LINUX, WINDOWS, MACOS, UNIX;
    }
    
    public Computador(Gama pGama, double pPrecio, SOperativo sOperativo) {
        super(pGama, pPrecio);
        this.sOperativo = sOperativo;
    }

    public String toString(){
        return "Computador "+sOperativo.name()+" - "+"Gama "+gama+ "($ "+precio + ")";
    }
    
}
