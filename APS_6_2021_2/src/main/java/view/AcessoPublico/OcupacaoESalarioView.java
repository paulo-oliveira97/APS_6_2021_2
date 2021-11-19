/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.AcessoPublico;

import java.io.IOException;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.AcessoPublico.OcupacaoESalario;
import controller.AcessoPublico.OcupacaoESalarioControl;

/**
 *
 * @author paulo
 */
public class OcupacaoESalarioView {
    private static final String [] columns = {
        "Ano",
        "Região",
        "Unidade da Federação",
        "CNAE",
        "Total de empresas",
        "Pessoal ocupado assalariado",
        "Pessoal ocupado total"
    };
    public static DefaultTableModel getTableModel(int i) throws IOException, ParseException {
        
        ArrayList<OcupacaoESalario> list = null;
        
        if (i == 0) {
            list = OcupacaoESalarioControl.getInstance().getData();
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

        for (OcupacaoESalario d : list) {
            Object[] row = {
                d.getAno(),
                d.getRegiao(),
                d.getEstado(),
                d.getCnae(),
                d.getTotalEmpresas(),
                d.getPessoalAssalariado(),
                d.getPessoalOcupado(),
            };
            table.addRow(row);
        }
        return table;
    }

}
