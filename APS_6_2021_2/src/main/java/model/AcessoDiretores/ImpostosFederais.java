/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AcessoDiretores;

/**
 *
 * @author paulo
 */
public final class ImpostosFederais {

    private String ano, mes, uf;
    private double cide;
    private double cofins_finan;
    private double cofins_demais;
    private double cpsss;
    private double csll_finan;
    private double csll_demais;
    private double iof;
    private double isexp;
    private double isimp;
    private double itr;
    private double ipi_auto;
    private double ipi_bebidas;
    private double ipi_fumo;
    private double ipi_vinculado_imp;
    private double ipi_outros;
    private double irpf;
    private double irpj_finan;
    private double irpj_demais;
    private double irrf_capital;
    private double irrf_trabalho;
    private double irrf_exterior;
    private double irrf_outros;                    
    private double outras_receitas;                    
    private double pispasep_finan;                    
    private double pispasep_demais;                    

    public ImpostosFederais(
            String ano,
            String mes,
            String uf,
            double cide,
            double cofins_finan,
            double cofins_demais,
            double cpsss,
            double csll_finan,
            double csll_demais,
            double iof,
            double isexp,
            double isimp,
            double itr,
            double ipi_auto,
            double ipi_bebidas,
            double ipi_fumo,
            double ipi_vinculado_imp,
            double ipi_outros,
            double irpf,
            double irpj_finan,
            double irpj_demais,
            double irrf_capital,
            double irrf_trabalho,
            double irrf_exterior,
            double irrf_outros,
            double outras_receitas,
            double pispasep_finan,
            double pispasep_demais) {
        setAno(ano);
        setMes(mes);
        setUf(uf);
        setCide(cide);
        setCofins_finan(cofins_finan);
        setCofins_demais(cofins_demais);
        setCpsss(cpsss);
        setCsll_finan(csll_finan);
        setCsll_demais(csll_demais);
        setIof(iof);
        setIsexp(isexp);
        setIsimp(isimp);
        setItr(itr);
        setIpi_auto(ipi_auto);
        setIpi_bebidas(ipi_bebidas);
        setIpi_fumo(ipi_fumo);
        setIpi_vinculado_imp(ipi_vinculado_imp);
        setIpi_outros(ipi_outros);
        setIrpf(irpf);
        setIrpj_finan(irpj_finan);
        setIrpj_demais(irpj_demais);
        setIrrf_capital(irrf_capital);
        setIrrf_trabalho(irrf_trabalho);
        setIrrf_exterior(irrf_exterior);
        setIrrf_outros(irrf_outros);
        setOutras_receitas(outras_receitas);
        setPispasep_finan(pispasep_finan);
        setPispasep_demais(pispasep_demais);
    }

    public ImpostosFederais(String ano, String mes, String uf, double cide, double cofins_finan, double cofins_demais, double cpsss, double csll_finan, double csll_demais, double iof, double exp, double imp, double itr, double ipi_auto, double ipi_bebidas, double ipi_fumo, double ipi_vinculado_imp, double ipi_outros, double irpj_finan, double irpj_demais, double irrf_capital, double irrf_trabalho, double irrf_exterior, double irrf_outros, double outras_receitas, double pispasep_finan, double pispasep_demais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getCide() {
        return cide;
    }

    public void setCide(double cide) {
        this.cide = cide;
    }

    public double getCofins_finan() {
        return cofins_finan;
    }

    public void setCofins_finan(double cofins_finan) {
        this.cofins_finan = cofins_finan;
    }

    public double getCofins_demais() {
        return cofins_demais;
    }

    public void setCofins_demais(double cofins_demais) {
        this.cofins_demais = cofins_demais;
    }

    public double getCpsss() {
        return cpsss;
    }

    public void setCpsss(double cpsss) {
        this.cpsss = cpsss;
    }

    public double getCsll_finan() {
        return csll_finan;
    }

    public void setCsll_finan(double csll_finan) {
        this.csll_finan = csll_finan;
    }

    public double getCsll_demais() {
        return csll_demais;
    }

    public void setCsll_demais(double csll_demais) {
        this.csll_demais = csll_demais;
    }

    public double getIof() {
        return iof;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }

    public double getIsexp() {
        return isexp;
    }

    public void setIsexp(double isexp) {
        this.isexp = isexp;
    }

    public double getIsimp() {
        return isimp;
    }

    public void setIsimp(double isimp) {
        this.isimp = isimp;
    }

    public double getItr() {
        return itr;
    }

    public void setItr(double itr) {
        this.itr = itr;
    }

    public double getIpi_auto() {
        return ipi_auto;
    }

    public void setIpi_auto(double ipi_auto) {
        this.ipi_auto = ipi_auto;
    }

    public double getIpi_bebidas() {
        return ipi_bebidas;
    }

    public void setIpi_bebidas(double ipi_bebidas) {
        this.ipi_bebidas = ipi_bebidas;
    }

    public double getIpi_fumo() {
        return ipi_fumo;
    }

    public void setIpi_fumo(double ipi_fumo) {
        this.ipi_fumo = ipi_fumo;
    }

    public double getIpi_vinculado_imp() {
        return ipi_vinculado_imp;
    }

    public void setIpi_vinculado_imp(double ipi_vinculado_imp) {
        this.ipi_vinculado_imp = ipi_vinculado_imp;
    }

    public double getIpi_outros() {
        return ipi_outros;
    }

    public void setIpi_outros(double ipi_outros) {
        this.ipi_outros = ipi_outros;
    }

    public double getIrpj_finan() {
        return irpj_finan;
    }

    public void setIrpj_finan(double irpj_finan) {
        this.irpj_finan = irpj_finan;
    }

    public double getIrpj_demais() {
        return irpj_demais;
    }

    public void setIrpj_demais(double irpj_demais) {
        this.irpj_demais = irpj_demais;
    }

    public double getIrrf_capital() {
        return irrf_capital;
    }

    public void setIrrf_capital(double irrf_capital) {
        this.irrf_capital = irrf_capital;
    }

    public double getIrrf_trabalho() {
        return irrf_trabalho;
    }

    public void setIrrf_trabalho(double irrf_trabalho) {
        this.irrf_trabalho = irrf_trabalho;
    }

    public double getIrrf_exterior() {
        return irrf_exterior;
    }

    public void setIrrf_exterior(double irrf_exterior) {
        this.irrf_exterior = irrf_exterior;
    }

    public double getIrrf_outros() {
        return irrf_outros;
    }

    public void setIrrf_outros(double irrf_outros) {
        this.irrf_outros = irrf_outros;
    }

    public double getOutras_receitas() {
        return outras_receitas;
    }

    public void setOutras_receitas(double outras_receitas) {
        this.outras_receitas = outras_receitas;
    }

    public double getPispasep_finan() {
        return pispasep_finan;
    }

    public void setPispasep_finan(double pispasep_finan) {
        this.pispasep_finan = pispasep_finan;
    }

    public double getPispasep_demais() {
        return pispasep_demais;
    }

    public void setPispasep_demais(double pispasep_demais) {
        this.pispasep_demais = pispasep_demais;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }
                    
}