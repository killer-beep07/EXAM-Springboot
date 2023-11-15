package moufid.isic.gestion.repository;



import java.util.Date;
import java.util.List;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import moufid.isic.gestion.entities.Article;
import moufid.isic.gestion.entities.Categorie;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	// @Query("SELECT p FROM 	Article a JOIN p.categorie s WHERE s.id = :x")
	@Query("SELECT a FROM Article a JOIN a.categorie c WHERE c.id = :categorieId")
	public List<Article> findByCategorie(int categorieId);
	 //public List<Article> findByCategorie(Categorie categorie);




@Query("SELECT a FROM Article a WHERE a.dateProduction BETWEEN :dateDebut AND :dateFin")
List<Article> findByDateProductionBetween(@Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}