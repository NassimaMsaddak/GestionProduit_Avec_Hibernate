package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



// le mapping objet relationnel (ORM) se fait à travers les annotations (pour hibernate)
 // @table("categorie")   exmple de mapping de la table categorie associer à cette classe

//mais ici, on va travailler avec les fichiers xml pour le mapping (puisque les fichiers xml sont basique pour tous framework)
public class Categorie {

	private Long idCategorie;
	private String titre;
	private String description ;
	private Date dateAjout;

	private Set<Produit> produits = new HashSet<Produit>();  // c'est une collection pour lier la table Categorie à la Produit dans la base de donnée
	
	// les constructeurs 
	public Categorie(String titre, String description, Date dateAjout) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateAjout = dateAjout;
	}

	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	  
    // les getters et les setters 
	
	
	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	
	public void show() {
		System.out.println("titre :"+ this.titre +"---description :"+this.description+"---date ajout :"+this.dateAjout.toString());
	}
}
