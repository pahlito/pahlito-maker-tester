package cl.pahlito.maker.tester.commons.service;

import java.util.List;

import cl.pahlito.maker.tester.commons.model.TestDTO;

public interface TestService {

	TestDTO obtener(Long id);

	List<TestDTO> getLista(String descripcion);

	TestDTO guardar(TestDTO test);

	void eliminar(Long id);


}
