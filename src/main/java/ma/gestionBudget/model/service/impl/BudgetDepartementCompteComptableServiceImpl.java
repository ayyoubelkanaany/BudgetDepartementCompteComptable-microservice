package ma.gestionBudget.model.service.impl;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ma.gestionBudget.bean.BudgetDepartementCompteComptable;
import ma.gestionBudget.model.dao.BudgetDepartementCompteComptableRepository;
import ma.gestionBudget.model.service.facade.BudgetDepartementCompteComptableService;
import ma.gestionBudget.model.ws.required.facade.BudgetDepartementRestRequired;
import ma.gestionBudget.model.ws.required.facade.CompteComptableRestRequired;
import ma.gestionBudget.model.ws.required.vo.BudgetDepartementVo;
import ma.gestionBudget.model.ws.required.vo.CompteComptableVo;



@Service
public class BudgetDepartementCompteComptableServiceImpl implements BudgetDepartementCompteComptableService{
	
	@Autowired
    private BudgetDepartementCompteComptableRepository budgetDepartementCompteComptableRepository;
	@Autowired
	private BudgetDepartementRestRequired budgetDepartementRestRequired;
	@Autowired
	private CompteComptableRestRequired compteComptableRestRequired;
	
	@Override
	public int save(BudgetDepartementCompteComptable budgetDepartementCompteComptable) {
		CompteComptableVo compteComptableVo = null;
		BudgetDepartementVo budgetDepartementVo = null;
		
		if(budgetDepartementCompteComptable ==null) {
			return -4;
		}
		if(budgetDepartementCompteComptable.getRefBudgetDepartement() !=null) {
			compteComptableVo = compteComptableRestRequired.findByRefCompteComptable(budgetDepartementCompteComptable.getRefComptable());
		}
		if(budgetDepartementCompteComptable.getRefComptable()!=null) {
			budgetDepartementVo = budgetDepartementRestRequired.findByReference(budgetDepartementCompteComptable.getRefBudgetDepartement());
		}
		
		if(compteComptableVo==null) {
			return -1;
		}
		if(budgetDepartementVo==null) {
			return -2;
		}
		else {
			if(budgetDepartementCompteComptable.getId()!= null) {
				updateBudgetDepartementCompteComptable(budgetDepartementCompteComptable);
			}
			else {

				this.budgetDepartementCompteComptableRepository.save(budgetDepartementCompteComptable);

			}
			return 1;
		}
		
	}

	@Override
	public int updateBudgetDepartementCompteComptable(BudgetDepartementCompteComptable budgetDepartementCompteComptable) {
		if(findById(budgetDepartementCompteComptable.getId()) != null) {
			this.budgetDepartementCompteComptableRepository.save(budgetDepartementCompteComptable);
			 return 1 ;
		}
		else {
			save(budgetDepartementCompteComptable);
			  return 2 ;
		}
		   
	     
			
	}
	@Override
	public List<BudgetDepartementCompteComptable> findAll() {
		return this.budgetDepartementCompteComptableRepository.findAll();
	}

	@Override
	public List<BudgetDepartementCompteComptable> findByRefBudgetDepartement(String refBudgetDepartement) {
		return this.budgetDepartementCompteComptableRepository.findByRefBudgetDepartement(refBudgetDepartement);
	}

	@Override
	public BudgetDepartementCompteComptable findById(Long id) {
		Optional<BudgetDepartementCompteComptable> loadedBudgetDepartementCompteContableOptional = this.budgetDepartementCompteComptableRepository.findById(id);
		if(loadedBudgetDepartementCompteContableOptional != null) {
			return loadedBudgetDepartementCompteContableOptional.get();
		}
		else {
			return null;
		}
	}
    @Transactional
	@Override
	public void deleteById(Long id) {
		 this.budgetDepartementCompteComptableRepository.deleteById(id);
	}

	@Override
	public int save(List<BudgetDepartementCompteComptable> budgetDepartementCompteComptableVos) {
		if(budgetDepartementCompteComptableVos.isEmpty() || budgetDepartementCompteComptableVos == null) {
			return -1;
		}
		else {
			
			for(int i=0;i<budgetDepartementCompteComptableVos.size();i++) {
				this.save(budgetDepartementCompteComptableVos.get(i));
			}
			return 1;
		}
	}
	@Transactional
	@Override
	public int deleteByRefBudgetDepartement(String refBudgetDepartement) {
		return this.budgetDepartementCompteComptableRepository.deleteByRefBudgetDepartement(refBudgetDepartement);		
	}

}
