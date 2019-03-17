import java.util.Date;
import java.util.Iterator;

import dao.Categorie;
import dao.Produit;
import dao.Services;

public class Test { 

	public static void main(String[] args) { 
		//load services
		Services  s= new Services();
		
		// ajout des produits
		Produit p1=new Produit("PC2","dell",(double) 8000);
		Produit p2=new Produit("PC3","dell",(double) 9000);
		Produit p3=new Produit("PC4","dell",(double) 10000);
		Produit p4=new Produit("PC5","dell",(double) 11000);
		
		s.addProduit(p1);
		s.addProduit(p2);
		s.addProduit(p3);
		s.addProduit(p4);
		
		//ajout des categories
		Categorie c1=new Categorie("informatique1","info1",new Date());
		Categorie c2=new Categorie("informatique2","info2",new Date());
		Categorie c3=new Categorie("informatique3","info3",new Date());
		Categorie c4=new Categorie("informatique4","info4",new Date());
		
		s.addCategorie(c1);
		s.addCategorie(c2);
		s.addCategorie(c3);
		s.addCategorie(c4);
		
		/*
		//tester les get Produit et categorie from base de donnée
		Categorie categorie = s.getCategorie(new Long(1));
		categorie.show();
		
		Produit produit = s.getProduit(2L);
		produit.show();
		*/
		
		
		System.out.println("La liste de tous les produits :");
		Iterator<Produit> produits = s.getAllProduits().iterator();
		
		while(produits.hasNext()) {
			
			Produit p = produits.next();
			p.show();
			
		}
	   
		//affectation
		
		s.addProduitToCategorie(1L,1L);
		s.addProduitToCategorie(2L,1L);
		s.addProduitToCategorie(3L,1L);
		s.addProduitToCategorie(4L,1L);
		
		Categorie categorie= s.getCategorie(new Long(1));  //recuperer la categorie a partir de l' ID
		System.out.println("l info de categorie est :");
		categorie.show();
		System.out.println("les produits de cette categorie sont :");
		        Iterator<Produit> produitsOfcategorie = categorie.getProduits().iterator();   //recuperer les produits (qui est attribut de la classe categorie) a partir de la categorie trouvée precedemment 
				// afficher la liste des produits de cette categorie
				while(produitsOfcategorie.hasNext()) {
					
					Produit p = produitsOfcategorie.next();
					p.show();
					
				}
				
				
				
	    Produit produit= s.getProduit(1L);  //recuperer le produit a partir de l' ID
		System.out.println("l info de produit est :");
		produit.show();
		System.out.println("les categories de ce produit sont :");
		Iterator<Categorie> categoriesOfProduit = produit.getCategories().iterator();   //recuperer les categories (qui est attribut de la classe produit) a partir du produit trouvé precedemment 
		// afficher la liste des categories  de ce produit
		while(categoriesOfProduit .hasNext()) {
							
				Categorie c =categoriesOfProduit.next();
				c.show();
							
		}
		
	}

}
