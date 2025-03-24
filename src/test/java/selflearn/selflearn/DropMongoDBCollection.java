package selflearn.selflearn;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DropMongoDBCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		MongoClient mongo=new MongoClient("localhost", 27017);
		MongoDatabase db=mongo.getDatabase("youtubeDB");
		MongoCollection<Document> collection=db.getCollection("JustForTest");				
		collection.drop();
		System.out.println("Collection dropped successfully");

	}

}
