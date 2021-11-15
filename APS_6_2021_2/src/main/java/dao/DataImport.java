/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author paulo
 */
public class DataImport {
    
    String CONNECTION_STRING = "mongodb+srv://admin:drQ3UmQKrn8vJyRm@aps6data.2mjoe.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
    ConnectionString connectionString = new ConnectionString(CONNECTION_STRING);
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("rendimento_lavouras_anual");
    MongoCollection collection = database.getCollection("producao_kg_hectare");
    MongoCursor cursor = (MongoCursor) collection.find();
    
}
