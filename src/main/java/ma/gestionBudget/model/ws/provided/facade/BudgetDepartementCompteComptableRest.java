	package ma.gestionBudget.model.ws.provided.facade;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	
	import ma.gestionBudget.bean.BudgetDepartementCompteComptable;
	import ma.gestionBudget.model.service.impl.BudgetDepartementCompteComptableServiceImpl;
import ma.gestionBudget.model.ws.provided.converter.BDCCConverter;
import ma.gestionBudget.model.ws.provided.vo.BudgetDepartementCompteComptableVo;

	
	@RestController
	public class BudgetDepartementCompteComptableRest {
	@Autowired
	private BDCCConverter bdccConverter;
	@Autowired
	private BudgetDepartementCompteComptableServiceImpl budgetDepartementCompteComptableServiceImpl;
	
	@RequestMapping(value = "/budgetDepartementCompteComptables/refBudgetDepartement/{refBudgetDepartement}",method = RequestMethod.DELETE)
	public int deleteByRefBudgetDepartement(@PathVariable String refBudgetDepartement) {
		return budgetDepartementCompteComptableServiceImpl.deleteByRefBudgetDepartement(refBudgetDepartement);
	}
	@RequestMapping(value = "/budgetDepartementCompteComptables/all",method = RequestMethod.POST)
	public int save(@RequestBody List<BudgetDepartementCompteComptable> budgetDepartementCompteComptableVos) {
		return budgetDepartementCompteComptableServiceImpl.save(budgetDepartementCompteComptableVos);
	}
	@RequestMapping(value = "/budgetDepartementCompteComptables",method = RequestMethod.POST)
	public int save(@RequestBody BudgetDepartementCompteComptableVo budgetDepartementCompteComptableVo) {
		return budgetDepartementCompteComptableServiceImpl.save(bdccConverter.toBean(budgetDepartementCompteComptableVo));
	}
	@RequestMapping(value = "/budgetDepartementCompteComptables",method = RequestMethod.GET)
	public List<BudgetDepartementCompteComptableVo> findAll() {
		return  bdccConverter.toListVo(budgetDepartementCompteComptableServiceImpl.findAll());
	}
	
	@RequestMapping(value = "/budgetDepartementCompteComptables",method = RequestMethod.PUT)
	public int updateBudgetDepartementCompteComptable(@RequestBody BudgetDepartementCompteComptableVo budgetDepartement) {
		return budgetDepartementCompteComptableServiceImpl.updateBudgetDepartementCompteComptable(bdccConverter.toBean(budgetDepartement));
	}
	
	@RequestMapping(value = "/budgetDepartementCompteComptables/refBudgetDepartement/{refBudgetDepartement}",method = RequestMethod.GET)
	public List<BudgetDepartementCompteComptableVo> findByRefBudgetDepartement(@PathVariable String refBudgetDepartement) {
		return bdccConverter.toListVo(budgetDepartementCompteComptableServiceImpl.findByRefBudgetDepartement(refBudgetDepartement));
	}
	
	@RequestMapping(value = "/budgetDepartementCompteComptables/id/{id}",method = RequestMethod.GET)
	public BudgetDepartementCompteComptableVo findById(@PathVariable Long id) {
		return bdccConverter.toVo(budgetDepartementCompteComptableServiceImpl.findById(id));
	}
	}
