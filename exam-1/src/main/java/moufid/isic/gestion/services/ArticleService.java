package moufid.isic.gestion.services;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moufid.isic.gestion.entities.Categorie;
import moufid.isic.gestion.entities.Article;
import moufid.isic.gestion.idao.IDao;
import moufid.isic.gestion.repository.ArticleRepository;
import moufid.isic.gestion.repository.CategorieRepository;




@Service
public class ArticleService implements IDao<Article>{

	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public Article create(Article o) {
		return articleRepository.save(o) ;
	}

	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}
	
//	public List<Article> findByCategorie(Categorie categorie){
//		return articleRepository.findByCategorie(categorie);
//	}
	public List<Article> findByCategorie(int categorieId){
		return articleRepository.findByCategorie(categorieId);
	}

	@Override
	public Article update(Article o) {
		return articleRepository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
            articleRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
	}

	public Article findById(Long id) {
		return articleRepository.findById(id).orElse(null);
	}

	@Override
	public Article findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 public List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin) {
	        return articleRepository.findByDateProductionBetween(dateDebut, dateFin);
	    }

	

}