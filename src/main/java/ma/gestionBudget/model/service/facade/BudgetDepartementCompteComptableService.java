package ma.gestionBudget.model.service.facade;

import java.util.List;

import ma.gestionBudget.bean.BudgetDepartementCompteComptable;
import ma.gestionBudget.model.ws.required.vo.BudgetDepartementVo;


public interface BudgetDepartementCompteComptableService {
   public int save(BudgetDepartementCompteComptable budgetDepartement);
   public int save(List<BudgetDepartementCompteComptable> budgetDepartements);
   public List<BudgetDepartementCompteComptable> findAll();
   public int updateBudgetDepartementCompteComptable(BudgetDepartementCompteComptable budgetDepartement);
   public List<BudgetDepartementCompteComptable> findByRefBudgetDepartement(String refBudgetDepartement);
   public BudgetDepartementCompteComptable findById(Long id);
   public void deleteById(Long id);
   public int deleteByRefBudgetDepartement(String refBudgetDepartement);
}
