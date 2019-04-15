package fr.adaming.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "user")
//@XmlType(propOrder={"id","nom","prenom","age"})
public class User {
	
	
	private String id;

	private String nom;
	
	private String prenom;
	
	private int age;

	public User() {
		super();
	}

	public User(String id, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	@XmlAttribute
	public String getId() {
		return id;
	}


	
	public void setId(String id) {
		this.id = id;
	}
	@XmlAttribute
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	@XmlAttribute
	public String getPrenom() {
		return prenom;
	}

	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@XmlAttribute
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	


}
