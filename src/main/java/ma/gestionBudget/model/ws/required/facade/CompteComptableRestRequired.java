package ma.gestionBudget.model.ws.required.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ma.gestionBudget.model.ws.required.vo.BudgetDepartementVo;
import ma.gestionBudget.model.ws.required.vo.CompteComptableVo;

@FeignClient(name = "COMPTECOMPTABLE-SERVICE")
public interface CompteComptableRestRequired {
	@RequestMapping(value = "/CompteComptable/refCompteComptable/{refCompteComptable}",method= RequestMethod.GET)
	public CompteComptableVo findByRefCompteComptable(@PathVariable String refCompteComptable);
		
}
