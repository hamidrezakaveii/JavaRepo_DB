package entite;
// Generated 2018-05-16 08:56:58 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private BigDecimal noclient;
     private String nomclient;
     private String notelephone;
     private Set commandes = new HashSet(0);

    public Client() {
    }

	
    public Client(BigDecimal noclient, String nomclient, String notelephone) {
        this.noclient = noclient;
        this.nomclient = nomclient;
        this.notelephone = notelephone;
    }
    public Client(BigDecimal noclient, String nomclient, String notelephone, Set commandes) {
       this.noclient = noclient;
       this.nomclient = nomclient;
       this.notelephone = notelephone;
       this.commandes = commandes;
    }
   
    public BigDecimal getNoclient() {
        return this.noclient;
    }
    
    public void setNoclient(BigDecimal noclient) {
        this.noclient = noclient;
    }
    public String getNomclient() {
        return this.nomclient;
    }
    
    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }
    public String getNotelephone() {
        return this.notelephone;
    }
    
    public void setNotelephone(String notelephone) {
        this.notelephone = notelephone;
    }
    public Set getCommandes() {
        return this.commandes;
    }
    
    public void setCommandes(Set commandes) {
        this.commandes = commandes;
    }




}

