package selflearn.selflearn;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeleteDataInMongoDb {

	public static void main(String[] args) {
		// deleting document in MongoDB
		MongoClient mongo=new MongoClient("localhost", 27017);
		MongoDatabase db=mongo.getDatabase("youtubeDB");
		MongoCollection<Document> collection=db.getCollection("JustForTest");				
		collection.deleteOne(Filters.eq("name", "testDoc3"));		
		Iterator i=collection.find().iterator();
		while(i.hasNext()) {
			System.out.println("Document in collection is: "+i.next());
		}
	}
}
