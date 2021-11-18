/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
import model.OcupacaoESalario;
import org.bson.Document;

/**
 *
 * @author paulo
 */
public class OcupacaoESalarioControl {

    private static OcupacaoESalarioControl dao = null;

    ArrayList dataList = new ArrayList<>();
    String _database = "acesso_nivel1";
    String _collection = "ocupacao_e_salario";

    public static OcupacaoESalarioControl getInstance() {
        if (dao == null) {
            dao = new OcupacaoESalarioControl();
        }
        return dao;
    }

    public ArrayList<OcupacaoESalario> getData() {

        String URI = "mongodb+srv://admin:drQ3UmQKrn8vJyRm@aps6data.2mjoe.mongodb.net/acesso_nivel1?retryWrites=true&w=majority";

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
                    String regiao = obj.get("Região", String.class);
                    String estado = obj.get("Unidade da Federação", String.class);
                    String cnae = obj.get("CNAE", String.class);
                    int pessoalAssalariado = obj.get("Total de empresas", Integer.class);
                    int pessoalOcupado = obj.get("Pessoal ocupado total", Integer.class);
                    int totalEmpresas = obj.get("Pessoal ocupado assalariado", Integer.class);
                    dataList.add(new OcupacaoESalario(ano, regiao, estado, cnae, pessoalAssalariado, pessoalOcupado, totalEmpresas));
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
