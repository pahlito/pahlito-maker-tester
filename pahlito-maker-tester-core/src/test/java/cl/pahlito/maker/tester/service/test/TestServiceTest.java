package cl.pahlito.maker.tester.service.test;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import cl.pahlito.maker.tester.commons.model.TestDTO;
import cl.pahlito.maker.tester.commons.service.TestService;
import cl.pahlito.maker.tester.core.entity.TestEntity;
import cl.pahlito.maker.tester.core.repository.TestRepository;
import cl.pahlito.maker.tester.core.service.impl.TestServiceImpl;

@RunWith(SpringRunner.class)
public class TestServiceTest {

	@Autowired
	private TestService testService;

	@MockBean
	private TestRepository testRepository;

	@TestConfiguration
	static class EmployeeServiceImplTestContextConfiguration {

		@Bean
		public TestService employeeService() {
			return new TestServiceImpl();
		}
	}

	@Test
	public void testObtenerOK() {
		final Long id = 1L;
		final TestDTO test1 = testService.obtener(id);
		Assert.assertNotNull(test1);
		Assert.assertEquals(id, test1.getId());
	}

	@Before
    public void setUp() {
        TestEntity test1 = new TestEntity();
        
        test1.setId(1L);
        test1.setDescripcion("Prueba 1");
     
		Optional<TestEntity> optional = Optional.of(test1);
        
		Mockito.when(testRepository.findById(test1.getId()))
          .thenReturn(optional);
    }

}
