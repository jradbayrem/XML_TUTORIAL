package fr.adaming.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import fr.adaming.model.User;
import fr.adaming.model.Users;

public class ClassTest {

	public static void main(String[] args) throws IOException {
		
//		//-------------------- créer un fichier de données .XML --------------------
//		
//		 User user1 = new User("1", "LAHAMAR", "Nour", 29);
//		 try {
//		 File file = new File("C:\\Users\\mnlahmar\\Desktop\\XML\\users.xml");
//		 
//		 	/*L'objet principal pour les opérations de transformation est l'objet JAXBContext :
//		 	il permet d'utiliser l'API JAXB. 
//		 	Pour obtenir une instance de cet objet, il faut utiliser la méthode statique newInstance() en lui passant en paramètre 
//		 	le ou les packages contenant les classes générées à utiliser.
//		 	Dans le cas où plusieurs packages doivent être précisés, il faut les séparer par une virgule.*/
//		 
//		 JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
//		 
//		 	// un objet de type Marshaller qui va permettre la transformation d'un ensemble d'objets en un document XML
//		 Marshaller mrl=jaxbContext.createMarshaller();
//		 	//indique si le document XML doit être formaté >>  demander le formattage du document créé
//		 mrl.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true); 
//		 	//création du document XML
//		 mrl.marshal(user1, file);
//		 	//affichage du resultat
//		 mrl.marshal(user1, System.out);
//		 	
//		 
//		 
//		 
//		// create new schema out put resolver
//         SchemaOutputResolver sor = new SchemaOutputResolver() {
//			
//			@Override
//			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
//				// create new file
//			      File file = new File("C:\\Users\\mnlahmar\\Desktop\\XML\\schema.xsd");
//			      
//			      // create stream result
//			      StreamResult result = new StreamResult(file);
//
//			      
//			      // return result
//			      return result;
//			}
//		}; 
//			
//		
//         
//         // generer schema
//         jaxbContext.generateSchema(sor);
//         
//		 } catch (JAXBException e) {
//		 e.printStackTrace();
//		 }
		
		
		
		//-------------------- lire un fichier de données .XML --------------------
		
		try {
			File file = new File("C:\\Users\\mnlahmar\\Desktop\\XML\\users.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Unmarshaller unmrl=jaxbContext.createUnmarshaller();
			
			/*Un objet SchemaFactory est un compilateur de schéma qui va utiliser le schéma pour valider le flux XML 
			En cas de non-conformité du flux XML par rapport au schéma,
			la méthode unmarshall() lève une Exception.
			*/
			
			SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema"); 
			//recuperation du schema xsd
			Schema schema = schemaFactory.newSchema(new File("C:\\Users\\mnlahmar\\Desktop\\XML", "schema.xsd"));
			
			//affecter le schema xsd a l'instance unmarshall
			unmrl.setSchema(schema);
			
			
			
			User user2=(User) unmrl.unmarshal(file);
			
			System.out.println(user2.getNom());
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	
		
//		//----------------- Marshaler list--------------------
//		
//		 User u1 = new User("1", "boul", "nom", 31);
//		 User u2 = new User("2", "boulmer", "noma", 32);
//		 User u3 = new User("3", "boulmerdj", "nomane", 34);
//		 
//		 Users users=new Users();
//		 
//		 users.setListeUsers(new ArrayList<User>());
//		 
//		 users.getListeUsers().add(u1);
//		 users.getListeUsers().add(u2);
//		 users.getListeUsers().add(u3);
//		 try {
//		 File file = new File("C:\\Users\\mnlahmar\\Desktop\\XML\\users.xml");
//		 JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
//		 Marshaller mrl=jaxbContext.createMarshaller();
//		 mrl.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
//		 mrl.marshal(users, file);
//		 mrl.marshal(users, System.out);
//		
//		 } catch (JAXBException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }
		
		
//			try {
//			File file = new File("C:\\Users\\mnlahmar\\Desktop\\XML\\users.xml");
//			JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
//			Unmarshaller unmrl=jaxbContext.createUnmarshaller();
//			Users users=(Users) unmrl.unmarshal(file);
//			for(User u:users.getListeUsers()){
//			System.out.println("\n"+u.getNom());
//			}
//			
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	}

}
