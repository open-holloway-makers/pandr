package models;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.BasicBSONList;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;

/**
 * Created by vasua on 20/10/2015.
 */
public class UserDAO {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public UserDAO() {
        mongoClient = new MongoClient("localhost", 27017);
        database = mongoClient.getDatabase("pandrDb");
        collection = database.getCollection("users");
    }

    public void insertUser(User user) {

        BasicBSONList ownedProjects = new BasicBSONList();
        for (int i = 0; i < user.getOwnedProjects().size(); i++) {
            ownedProjects.add(user.getOwnedProjects().get(i));
        }

        BasicBSONList rightSwipes = new BasicBSONList();
        for (int i = 0; i < user.getRightSwipes().size(); i++) {
            ownedProjects.add(user.getRightSwipes().get(i));
        }

        Document doc = new Document("username", user.getUsername())
                .append("firstname", user.getFirstName())
                .append("surname", user.getSurname())
                .append("email", user.getEmail())
                .append("ownedProjects", ownedProjects)
                .append("rightSwipes", rightSwipes);

        //System.out.println(doc.toJson());

        collection.insertOne(doc);
    }

//    public void addNewOwnedProject(User user, Project project) {
//        collection.updateOne(eq("username", user.getUsername()),
//                new Document("$set", new Document("ownedProjects", projectsToBSON(user, project))));
//
//    }
//
//
//    private BasicBSONList projectsToBSON(User user, Project project) {
//        Document document = collection.find(eq("username", user.getUsername())).first();
//        ArrayList<Project> ownedProjects = (ArrayList<Project>) document.get("ownedProjects");
//
//        BasicBSONList projects = new BasicBSONList();
//        for (int i = 0; i < ownedProjects.size(); i++) {
//            projects.add(new Project(ownedProjects.get(i).name,
//                    ownedProjects.get(i).desc,
//                    ownedProjects.get(i).lang,
//                    ownedProjects.get(i).link,
//                    ownedProjects.get(i).owner));
//        }
//        System.out.println(projects.toString());
//        return projects;
//    }
}
