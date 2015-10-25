package models;

import com.mongodb.client.FindIterable;
import com.mongodb.MongoClient;
import com.mongodb.Block;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.BasicBSONList;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;
import play.libs.Json;

/**
 * Created by vasua on 20/10/2015.
 */
public class UserDAO {
    private static MongoClient mongoClient = new MongoClient("localhost", 27017);;
    private static  MongoDatabase database  = mongoClient.getDatabase("pandrDb");
    private static MongoCollection<Document> collection = database.getCollection("users");

    public static void insertUser(User user) {
        BasicBSONList ownedProjects = new BasicBSONList();
        for(Project proj : user.ownedProjects){
            ownedProjects.add(proj);
        }


        BasicBSONList likedProjects = new BasicBSONList();
        for (Project proj : user.likedProjects) {
            likedProjects.add(proj);
        }

        BasicBSONList dislikedProjects = new BasicBSONList();
        for(Project proj : user.dislikedProjects){
            dislikedProjects.add(proj);
        }

        Document doc = new Document("username", user.username)
                .append("firstname", user.firstName)
                .append("surname", user.lastName)
                .append("email", user.email)
                .append("ownedProjects", ownedProjects)
                .append("likedProjects", likedProjects)
                .append("dislikedProjects", dislikedProjects);

        //System.out.println(doc.toJson());

        collection.insertOne(doc);
    }

    public static void userFromUsername(String username){
        FindIterable<Document> iterable = collection.find(new Document("username", username));
        String user = "";

        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        });
    }
}