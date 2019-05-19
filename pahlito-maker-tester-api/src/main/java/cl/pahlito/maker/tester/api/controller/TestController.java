package cl.pahlito.maker.tester.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.pahlito.maker.tester.commons.model.TestDTO;
import cl.pahlito.maker.tester.commons.service.TestService;

@RestController
@RequestMapping("/tests")
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping(value = "/{id}/", produces = "application/json")
	public TestDTO testGetById(@PathVariable Long id) {
		return testService.obtener(id);
	}
	@GetMapping(value="/", produces="application/json")
	public List<TestDTO> testGet(@RequestParam("descripcion") String descripcion) {
		return testService.getLista(descripcion);
	}

	@PostMapping(value = "/", produces = "application/json")
	public TestDTO testPost(@RequestBody TestDTO test) {
		return testService.guardar(test);
	}

	@PutMapping(value = "/", produces = "application/json")
	public void testPut(@RequestBody TestDTO test) {
		testService.guardar(test);
	}
	
	@DeleteMapping(value = "/{id}/", produces = "application/json")
	public void testDelete(@PathVariable Long id) {
		testService.eliminar(id);
	}

}
