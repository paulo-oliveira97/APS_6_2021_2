/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author paulo
 */
public final class LavourasRendimento {
    private String anoSafra, estado, regiao, produto;
    private int areaPlantadaHa, areaColhidaHa, producaoT; // Ha = Hectare, T = Tonelada    

    public LavourasRendimento(
            String anoSafra, String regiao, String estado, String produto, 
            int areaPlantadaHa, int areaColhidaHa, int producaoT){
        setAnoSafra(anoSafra);
        setRegiao(regiao);
        setEstado(estado);
        setProduto(produto);
        setAreaPlantadaHa(areaPlantadaHa);
        setAreaColhidaHa(areaColhidaHa);
        setProducaoT(producaoT);
    }

    public String getAnoSafra() {
        return anoSafra;
    }

    public void setAnoSafra(String anoSafra) {
        this.anoSafra = anoSafra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getAreaPlantadaHa() {
        return areaPlantadaHa;
    }

    public void setAreaPlantadaHa(int areaPlantadaHa) {
        this.areaPlantadaHa = areaPlantadaHa;
    }

    public int getAreaColhidaHa() {
        return areaColhidaHa;
    }

    public void setAreaColhidaHa(int areaColhidaHa) {
        this.areaColhidaHa = areaColhidaHa;
    }

    public int getProducaoT() {
        return producaoT;
    }

    public void setProducaoT(int producaoT) {
        this.producaoT = producaoT;
    }
}
