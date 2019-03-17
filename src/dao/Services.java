package dao;

import java.util.List;

import org.hibernate.Session;
import util.HibernateUtil;

public class Services {
 
	public void addProduit(Produit p) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	public Produit getProduit(Long idP) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p= (Produit) session.load(Produit.class,idP);  //avec casting
		return p;
	}
	
	
	public List<Produit> getAllProduits() {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		return session.createQuery("from Produit").list();
	}
	
	
	public void addCategorie(Categorie c) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
	

	public Categorie getCategorie(Long idC) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Categorie c= (Categorie) session.load(Categorie.class,idC);  //avec casting
		return c;
	}
	
	public List<Categorie> getAllCategories() {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		return session.createQuery("from Categorie").list();
	}
	
	public void addProduitToCategorie(Long idP,Long idC) {
		
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
			Produit p= (Produit) session.load(Produit.class,idP);  //avec casting
			Categorie c= (Categorie) session.load(Categorie.class,idC);  //avec casting
			
			c.getProduits().add(p);
			p.getCategories().add(c);
		
		session.getTransaction().commit();
	}
	
}
