package fr.adaming.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement//(name="ClassUsers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {
	@XmlElementWrapper(name="liste")
	@XmlElement(name = "user")	
private List<User> listeUsers=null;

public List<User> getListeUsers() {
	return listeUsers;
}


public void setListeUsers(List<User> listeUsers) {
	this.listeUsers = listeUsers;
}





}
