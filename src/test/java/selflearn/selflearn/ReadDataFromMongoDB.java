package selflearn.selflearn;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ReadDataFromMongoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongo=new MongoClient("localhost", 27017);
		MongoDatabase db=mongo.getDatabase("youtubeDB");
		MongoCollection<Document> collection=db.getCollection("JustForTest");
		Iterator i=collection.find().iterator();
		while(i.hasNext()) {
			System.out.println("Document in collection is: "+i.next());
		}
		
		//to Retrieve specific document in a collection
		BasicDBObject searchQuery=new BasicDBObject();
		searchQuery.put("name","testDoc2");
		System.out.println("\nRetrieving specific Mongo Document");
		MongoCursor<Document> cursor=collection.find(searchQuery).iterator();
		while(cursor.hasNext()) {
			System.out.println("\nSpecific document as per the search query is: "+cursor.next());
		}
	}
}
