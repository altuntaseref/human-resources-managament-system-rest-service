package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employers;


@RestController
@RequestMapping("/api/employersController")
public class EmployersController {
	
	private EmployersService employersService;

	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Employers>>  getAll(){
		
		return this.employersService.getAll();
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody Employers employers){
		return this.employersService.add(employers);
		
		
	}
}
