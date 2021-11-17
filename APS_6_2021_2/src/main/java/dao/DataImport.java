/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.*;
import com.mongodb.client.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import org.bson.Document;
import model.RendimentoSafrasModel;

/**
 *
 * @author paulo
 */
public class DataImport {

    private static DataImport dao = null;

    ArrayList dataList = new ArrayList<>();

    public static DataImport getInstance() {
        if (dao == null) {
            dao = new DataImport();
        }
        return dao;
    }

    public ArrayList<RendimentoSafrasModel> getData(String _database, String _collection) throws IOException, ParseException, MongoException {

        dataList.clear();

        String URI = "mongodb+srv://admin:drQ3UmQKrn8vJyRm@aps6data.2mjoe.mongodb.net/rendimento_lavouras_anual?retryWrites=true&w=majority";

        MongoClient client = null;
        MongoDatabase database = null;
        MongoCollection<Document> collection = null;

        ConnectionString connectionString = new ConnectionString(URI);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        try {
            client = MongoClients.create(settings);
            database = client.getDatabase(_database);
            collection = database.getCollection(_collection);
            
            
            
            FindIterable<Document> iterable = collection.find();
            MongoCursor<Document> cursor = iterable.iterator();
            try {
                while (cursor.hasNext()) {
                    Document obj = cursor.next();
                    String ano = (String) obj.get("Ano da Safra");
                    String regiao = (String) obj.get("Região");
                    String estado = (String) obj.get("Estado");
                    String produto = (String) obj.get("Produto das lavouras");
                    String rendimento = (String) obj.get("Rendimento médio Kg/ha");
                    dataList.add(new RendimentoSafrasModel(Integer.parseInt(ano), regiao, estado, produto, Integer.parseInt(rendimento)));
                }
            } catch (MongoException e) {
                System.out.printf("while nao funcionou \n"+ e.toString());
            }
            cursor.close();
            client.close();
        } catch (MongoException e) {
            System.out.printf("não funcionou nada nesse caralho \n" + e.toString());
        }
//        finally {
//            if (cursor != null) {
//                cursor.close();
//            }
//            if (mongoClient != null) {
//                mongoClient.close();
//            }
//        }
        return dataList;
    }
}
