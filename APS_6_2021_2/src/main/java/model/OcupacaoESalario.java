/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author paulo
 */
public final class OcupacaoESalario {
    private String ano, estado, regiao, cnae;
    private int pessoalAssalariado, pessoalOcupado, totalEmpresas;

    public OcupacaoESalario(String ano, String estado, String regiao, String cnae, int pessoalAssalariado, int pessoalOcupado, int totalEmpresas) {
        setAno(ano);
        setEstado(estado);
        setRegiao(regiao);
        setCnae(cnae);
        setPessoalAssalariado(pessoalAssalariado);
        setPessoalOcupado(pessoalOcupado);
        setTotalEmpresas(totalEmpresas);
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
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

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public int getPessoalAssalariado() {
        return pessoalAssalariado;
    }

    public void setPessoalAssalariado(int pessoalAssalariado) {
        this.pessoalAssalariado = pessoalAssalariado;
    }

    public int getPessoalOcupado() {
        return pessoalOcupado;
    }

    public void setPessoalOcupado(int pessoalOcupado) {
        this.pessoalOcupado = pessoalOcupado;
    }

    public int getTotalEmpresas() {
        return totalEmpresas;
    }

    public void setTotalEmpresas(int totalEmpresas) {
        this.totalEmpresas = totalEmpresas;
    }

}
