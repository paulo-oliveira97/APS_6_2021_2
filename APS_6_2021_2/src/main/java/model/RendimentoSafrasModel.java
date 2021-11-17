/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.DataImport;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo
 */
public final class RendimentoSafrasModel {

    private String regiao, estado, produto;
    private int rendimento, ano;
    private static final String DATABASE_NAME = "rendimento_lavouras_anual";
    private static final String COLLECTION_NAME = "producao_kg_hectare";

    public RendimentoSafrasModel(int ano, String regiao, String estado, String produto, int rendimento) {
        setAno(ano);
        setRegiao(regiao);
        setEstado(estado);
        setProduto(produto);
        setRendimento(rendimento);
    }

    /**
     * public RendimentoSafrasModel(String regiao, String estado, String
     * produto, int rendimento, int ano){
     *
     * }
     *
     * @param i
     * @param _database
     * @param _collection
     * @return
     * @throws java.io.IOException
     * @throws java.text.ParseException
     *
     */
    public static DefaultTableModel getTableModel(int i) throws IOException, ParseException {
        List<RendimentoSafrasModel> list = null;
        if (i == 0) {
            list = DataImport.getInstance().getData(DATABASE_NAME, COLLECTION_NAME);
        }

        DefaultTableModel model = (new DefaultTableModel(new Object[0][], new String[]{
            "Ano", "Região", "Estado", "Produto", "Rendimento médio"}) {
            Class[] types = {
                Integer.class,
                String.class,
                String.class,
                String.class,
                Integer.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });

        for (RendimentoSafrasModel d : list) {
            String[] row = {
                String.valueOf(d.getAno()),
                d.getRegiao(),
                d.getEstado(),
                d.getProduto(),
                String.valueOf(d.getRendimento()),};
            model.addRow(row);
        }
        return model;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getRendimento() {
        return rendimento;
    }

    public void setRendimento(int rendimento) {
        this.rendimento = rendimento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
