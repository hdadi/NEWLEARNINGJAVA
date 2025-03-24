package selflearn.selflearn;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class UpdateDataInMongoDB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongo=new MongoClient("localhost", 27017);
		MongoDatabase db=mongo.getDatabase("youtubeDB");
		MongoCollection<Document> collection=db.getCollection("JustForTest");
		Iterator i=collection.find().iterator();
		while(i.hasNext()) {
			System.out.println("Document in collection is: "+i.next());
		}
		
		//***********************updating the value of one document**********************		
//		collection.updateOne(Filters.eq("EmpID:-",1012),Updates.set("EmpName:-", "J Venkata Priyanka"));	

	}

}
