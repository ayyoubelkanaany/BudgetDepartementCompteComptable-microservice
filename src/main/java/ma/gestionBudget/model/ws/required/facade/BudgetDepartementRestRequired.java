package ma.gestionBudget.model.ws.required.facade;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.ApiOperation;
import ma.gestionBudget.model.ws.required.vo.BudgetDepartementVo;

@FeignClient(name = "BUDGETDEPARTEMENT-SERVICE")
public interface BudgetDepartementRestRequired {

	@RequestMapping(value = "/budgetDepartements/reference/{reference}",method = RequestMethod.GET)
	public BudgetDepartementVo findByReference(@PathVariable String reference);
		
}
