//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.11.03 à 03:41:25 PM CET 
//


package fr.adaming.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personne"
})
@XmlRootElement(name = "encyclopedie")
public class Encyclopedie {

    protected List<Personne> personne;

    /**
     * Gets the value of the personne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Personne }
     * 
     * 
     */
    public List<Personne> getPersonne() {
        if (personne == null) {
            personne = new ArrayList<Personne>();
        }
        return this.personne;
    }

}
