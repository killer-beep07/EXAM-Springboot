package moufid.isic.gestion.repository;



import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import moufid.isic.gestion.entities.Article;


@Repository
public interface CategorieRepository extends JpaRepository<Article, Long> {
	
}

