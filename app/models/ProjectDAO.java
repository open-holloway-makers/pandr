package models;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.BasicBSONList;

public class ProjectDAO{
        
  private static MongoClient mongoClient = new MongoClient("localhost", 27017);
  private static MongoDatabase database   = mongoClient.getDatabase("pandrDb");
  private static MongoCollection<Document> collection = database.getCollection("projectsDB");

  public ProjectDAO() {
    
  }

  public static void addNewProject(Project project){
    System.out.println(collection.find());
    Document doc = new Document("name", project.name)
                .append("desc", project.desc)
                .append("lang", project.lang)
                .append("link", project.link)
                .append("owner", project.owner.username);

    // System.out.println(doc.toJson());
    collection.insertOne(doc);
  }

  public void retreiveAllProjects(){

  }
}