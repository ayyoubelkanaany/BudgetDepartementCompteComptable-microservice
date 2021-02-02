package ma.gestionBudget.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestionBudget.bean.BudgetDepartementCompteComptable;


@Repository
public interface BudgetDepartementCompteComptableRepository extends JpaRepository<BudgetDepartementCompteComptable, Long>{
	public List<BudgetDepartementCompteComptable> findByRefBudgetDepartement(String refbudgetDepartement);
	public int deleteByRefBudgetDepartement(String refBudgetDepartement);
	
}
