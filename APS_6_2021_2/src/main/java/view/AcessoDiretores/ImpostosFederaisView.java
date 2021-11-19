/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.AcessoDiretores;

import controller.AcessoDiretores.ImpostosFederaisControl;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.AcessoDiretores.ImpostosFederais;

/**
 *
 * @author paulo
 */
public class ImpostosFederaisView {

    private static final String[] columns = {
        "Ano",
        "Mês",
        "Unidade Federativa",
        "CIDE -Combustíveis",
        "COFINS - Financeiras",
        "COFINS - Demais",
        "CPSSS",
        "CSLL - Financeiras",
        "CSLL - Demais",
        "Imposto S/ Operações Financeiras",
        "Imposto Sobre Exportação",
        "Imposto Sobre Importação",
        "Imposto Territorial Rural",
        "IPI  - Automóveis",
        "IPI - Bebidas",
        "IPI - Fumo",
        "IPI - Vinculado À Importação",
        "IPI - Outros",
        "IPRF",
        "IPRJ - Entidades Financeiras",
        "IPRJ - Demais Empresas",
        "IRRF - Rendimentos Do Capital",
        "IRRF - Rendimentos Do Trabalho",
        "IRRF - Remessas P/ Exterior",
        "IRRF - Outros Rendimentos",
        "Outras Receitas Administradas",
        "PIS/PASEP - Demais",
        "PIS/PASEP - Financeiras",
    };

    public static DefaultTableModel getTableModel(int i) throws IOException, ParseException {

        ArrayList<ImpostosFederais> list = null;

        if (i == 0) {
            list = ImpostosFederaisControl.getInstance().getData();
        }

        DefaultTableModel table = (new DefaultTableModel(columns, 0) {
            Class[] types = { String.class, String.class, String.class, Double.class,
                Double.class, Double.class, Double.class, Double.class,
                Double.class, Double.class, Double.class, Double.class,
                Double.class, Double.class, Double.class, Double.class,
                Double.class, Double.class, Double.class, Double.class,
                Double.class, Double.class, Double.class, Double.class,
                Double.class, Double.class, Double.class, Double.class,
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

        for (ImpostosFederais d : list) {
            // implementar case pra cada metodo... vai dar trabaaalho
            Object[] row = {
                d.getAno(),
                d.getMes(),
                d.getUf(),
                d.getCide(),
                d.getCofins_finan(),
                d.getCofins_demais(),
                d.getCpsss(),
                d.getCsll_finan(),
                d.getCsll_demais(),
                d.getIof(),
                d.getIsexp(),
                d.getIsimp(),
                d.getItr(),
                d.getIpi_auto(),
                d.getIpi_bebidas(),
                d.getIpi_fumo(),
                d.getIpi_vinculado_imp(),
                d.getIpi_outros(),
                d.getIrpf(),
                d.getIrpj_finan(),
                d.getIrpj_demais(),
                d.getIrrf_capital(),
                d.getIrrf_trabalho(),
                d.getIrrf_exterior(),
                d.getIrrf_outros(),
                d.getOutras_receitas(),
                d.getPispasep_finan(),
                d.getPispasep_demais()
            };
            table.addRow(row);
        }
        return table;
    }

}
