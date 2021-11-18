/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.OcupacaoESalario;
import controller.OcupacaoESalarioControl;

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
        });

        for (OcupacaoESalario d : list) {
            String[] row = {
                d.getAno(),
                d.getRegiao(),
                d.getEstado(),
                d.getCnae(),
                String.valueOf(d.getTotalEmpresas()),
                String.valueOf(d.getPessoalAssalariado()),
                String.valueOf(d.getPessoalOcupado()),
            };
            table.addRow(row);
        }
        return table;
    }

}
