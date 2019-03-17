package dao;

import java.util.HashSet;
import java.util.Set;

public class Produit {
	
	private Long idProduit;
	private String nom;
	private String description ;
	private Double prix;
	
	private Set<Categorie> categories = new HashSet<Categorie>();  // c'est une collection pour lier la table Categorie à la Produit dans la base de donnée
	
	
	public Set<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}

	public Produit() {
		super();
	}
	
	public Produit(String nom, String description, Double prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}
	
	
	public Long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public void show() {
		System.out.println("nom :"+ this.nom +"---description :"+this.description+"---prix :"+this.prix);
	}
}
