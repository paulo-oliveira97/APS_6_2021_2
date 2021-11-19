/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.LavourasRendimento;
import controller.LavourasRendimentoControl;

/**
 *
 * @author paulo
 */
public class LavourasRendimentoView {
    private static final String [] columns = {
        "Ano da safra",
        "Unidade da Federação",
        "Região",
        "Produto das lavouras",
        "Área plantada (Hectares)",
        "Área colhida (Hectares)",
        "Produção (Toneladas)",
    };
    public static DefaultTableModel getTableModel(int i) throws IOException, ParseException {
        
        ArrayList<LavourasRendimento> list = null;
        
        if (i == 0) {
            list = LavourasRendimentoControl.getInstance().getData();
        }

        DefaultTableModel table = (new DefaultTableModel(columns, 0) {
            Class[] types = {
                String.class,
                String.class,
                String.class,
                String.class,
                Integer.class,
                Integer.class,
                Integer.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        for (LavourasRendimento d : list) {
            Object[] row = {
                d.getAnoSafra(),
                d.getRegiao(),
                d.getEstado(),
                d.getProduto(),
                d.getAreaPlantadaHa(),
                d.getAreaColhidaHa(),
                d.getProducaoT()
            };
            table.addRow(row);
        }
        return table;
    }

}
