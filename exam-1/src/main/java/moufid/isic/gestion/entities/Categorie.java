package moufid.isic.gestion.entities;


	import java.io.Serializable;
	import java.util.List;

	import jakarta.persistence.Entity;
	import jakarta.persistence.FetchType;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.ManyToOne;
	import jakarta.persistence.OneToMany;

	@Entity
	public class Categorie implements Serializable{
		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 private long id;
		 private String nom;

		 
		 @ManyToOne
		private Categorie categorie;
		 
		 

	
		




		public Categorie() {
			super();
		}




		public long getId() {
			return id;
		}




		public void setId(long id) {
			this.id = id;
		}




		public String getNom() {
			return nom;
		}




		public void setNom(String nom) {
			this.nom = nom;
		}




//		public List<Categorie> getCategories() {
//			return categories;
//		}




//		public void setCategories(List<Categorie> categories) {
//			this.categories = categories;
//		}




		public Categorie getCategorie() {
			return categorie;
		}




		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}

		 
	}

