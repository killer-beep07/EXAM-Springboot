package moufid.isic.gestion.services;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moufid.isic.gestion.entities.Categorie;
import moufid.isic.gestion.entities.Categorie;
import moufid.isic.gestion.idao.IDao;
import moufid.isic.gestion.repository.CategorieRepository;
import moufid.isic.gestion.repository.CategorieRepository;




@Service
public class CategorieService implements IDao<Categorie>{

	@Autowired
	CategorieRepository categorieRepository;
	
	@Override
	public Categorie create(Categorie o) {
		return categorieRepository.save(o) ;
	}

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}
	
//	public List<Categorie> findByCategorie(Categorie categorie){
//		return categorieRepository.findByCategorie(categorie);
//	}
	public List<Categorie> findByCategorie(int categorieId){
		return categorieRepository.findByCategorie(categorieId);
	}

	@Override
	public Categorie update(Categorie o) {
		return categorieRepository.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
            categorieRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
	}

	public Categorie findById(Long id) {
		return categorieRepository.findById(id).orElse(null);
	}

	@Override
	public Categorie findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}