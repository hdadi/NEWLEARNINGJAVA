package selflearn.selflearn;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaMongoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongo=new MongoClient("localhost", 27017);
		System.out.println("Connection established successfully");
		MongoDatabase db=mongo.getDatabase("youtubeDB");
		System.out.println("Get Database is successful");
		
		MongoCursor<String> dbCursor=mongo.listDatabaseNames().iterator();
		while(dbCursor.hasNext()) {
			System.out.println(" DB are: "+dbCursor.next());
		}
		//inserting records by using MongoCollection
		MongoCollection<Document> collection=db.getCollection("JustForTest");
		Document doc1=new Document("name", "testDoc1");
		doc1.append("EmpID:-","1009");
		doc1.append("EmpName:-","Harish Dadi");
		collection.insertOne(doc1);
		
		Document doc2=new Document("name", "testDoc2");
		doc2.append("EmpID:-","1010");
		doc2.append("EmpName:-","Venkata Priyanka");
		collection.insertOne(doc2);
		
		Document doc3=new Document("name", "testDoc3");
		doc3.append("EmpID:-","1011");
		doc3.append("EmpName:-","Satish Dadi");
		collection.insertOne(doc3);
		
		
		
		
		
		
		
		
	}

}
