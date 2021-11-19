/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AcessoPublico;

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
import model.AcessoPublico.LavourasRendimento;
import org.bson.Document;

/**
 *
 * @author paulo
 */
public class LavourasRendimentoControl {

    private static LavourasRendimentoControl dao = null;

    ArrayList dataList = new ArrayList<>();
    String _database = "acesso_nivel1";
    String _collection = "rendimento_lavouras";

    public static LavourasRendimentoControl getInstance() {
        if (dao == null) {
            dao = new LavourasRendimentoControl();
        }
        return dao;
    }

    public ArrayList<LavourasRendimento> getData() {

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
                    String ano = obj.get("Ano da safra", String.class);
                    String regiao = obj.get("Região", String.class);
                    String estado = obj.get("Unidade da Federação", String.class);
                    String produto = obj.get("Produto das lavouras", String.class);
                    int areaPlantadaHa = obj.get("Área plantada (Hectares)", Integer.class);
                    int areaColhidaHa = obj.get("Área colhida (Hectares)", Integer.class);
                    int producaoT = obj.get("Produção (Toneladas)", Integer.class);
                    dataList.add(new LavourasRendimento(ano, regiao, estado, produto, areaPlantadaHa, areaColhidaHa, producaoT));
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
