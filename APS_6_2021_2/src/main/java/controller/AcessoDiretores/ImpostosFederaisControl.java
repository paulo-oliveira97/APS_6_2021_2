/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AcessoDiretores;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import model.AcessoDiretores.ImpostosFederais;
import org.bson.Document;

/**
 *
 * @author paulo
 */
public class ImpostosFederaisControl {

    private static ImpostosFederaisControl dao = null;

    ArrayList dataList = new ArrayList<>();
    String _database = "acesso_diretores";
    String _collection = "impostos_federais";

    public static ImpostosFederaisControl getInstance() {
        if (dao == null) {
            dao = new ImpostosFederaisControl();
        }
        return dao;
    }

    public ArrayList<ImpostosFederais> getData() {

        String URI = "mongodb+srv://admin:drQ3UmQKrn8vJyRm@aps6data.2mjoe.mongodb.net/acesso_diretores?retryWrites=true&w=majority";

        MongoClient client = null;
        MongoDatabase database;
        MongoCollection<Document> collection;
        FindIterable<Document> iterable;
        MongoCursor<Document> cursor = null;

        ConnectionString connectionString = new ConnectionString(URI);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        try {
            client = MongoClients.create(settings);
            database = client.getDatabase(_database);
            collection = database.getCollection(_collection);
            iterable = collection.find();
            cursor = iterable.iterator();
            try {
                while (cursor.hasNext()) {
                    Document obj = cursor.next();
                    String ano = obj.get("Ano", String.class); 
                    String mes = obj.get("Mês", String.class); 
                    String uf = obj.get("Unidade Federativa", String.class);
                    double cide = obj.get("CIDE-COMBUSTÍVEIS", Double.class);
                    double cofins_finan = obj.get("COFINS - FINANCEIRAS", Double.class);
                    double cofins_demais = obj.get("COFINS - DEMAIS", Double.class);
                    double cpsss = obj.get("CPSSS", Double.class);
                    double csll_finan = obj.get("CSLL - FINANCEIRAS", Double.class);
                    double csll_demais = obj.get("CSLL - DEMAIS", Double.class);
                    double iof = obj.get("IMPOSTO S/ OPERAÇÕES FINANCEIRAS", Double.class);
                    double isexp = obj.get("IMPOSTO SOBRE EXPORTAÇÃO", Double.class);
                    double isimp = obj.get("IMPOSTO SOBRE IMPORTAÇÃO", Double.class);
                    double itr = obj.get("IMPOSTO TERRITORIAL RURAL", Double.class);
                    double ipi_auto = obj.get("IPI - AUTOMÓVEIS", Double.class);
                    double ipi_bebidas = obj.get("IPI - BEBIDAS", Double.class);
                    double ipi_fumo = obj.get("IPI - FUMO", Double.class);
                    double ipi_vinculado_imp = obj.get("IPI - VINCULADO À IMPORTAÇÃO", Double.class);
                    double ipi_outros = obj.get("IPI - OUTROS", Double.class);
                    double irpf = obj.get("IRPF", Double.class);
                    double irpj_finan = obj.get("IRPJ - ENTIDADES FINANCEIRAS", Double.class);
                    double irpj_demais = obj.get("IRPJ - DEMAIS EMPRESAS", Double.class);
                    double irrf_capital = obj.get("IRRF - RENDIMENTOS DO CAPITAL", Double.class);
                    double irrf_trabalho = obj.get("IRRF - RENDIMENTOS DO TRABALHO", Double.class);
                    double irrf_exterior = obj.get("IRRF - REMESSAS P/ EXTERIOR", Double.class);
                    double irrf_outros = obj.get("IRRF - OUTROS RENDIMENTOS", Double.class);
                    double outras_receitas = obj.get("OUTRAS RECEITAS ADMINISTRADAS", Double.class);
                    double pispasep_finan = obj.get("PIS/PASEP - DEMAIS", Double.class);
                    double pispasep_demais = obj.get("PIS/PASEP - FINANCEIRAS", Double.class);
                    dataList.add(new ImpostosFederais(
                            ano, mes, uf, 
                            cide, cofins_finan, cofins_demais, 
                            cpsss, csll_finan, csll_demais, 
                            iof, isexp, isimp, itr, ipi_auto, 
                            ipi_bebidas, ipi_fumo, ipi_vinculado_imp, ipi_outros, 
                            irpf, irpj_finan, irpj_demais, 
                            irrf_capital, irrf_trabalho, irrf_exterior, irrf_outros, 
                            outras_receitas, pispasep_finan, pispasep_demais));
                    
                }
            } catch (ClassCastException e) {
                System.out.printf(e.getMessage());
            }
            client.close();
        } catch (MongoException e) {
            System.out.printf(e.getMessage());
        }
        finally {
            if (cursor != null) {
                cursor.close();
            }
            if (client != null) {
                client.close();
            }
        }
        return dataList;
    }
}
