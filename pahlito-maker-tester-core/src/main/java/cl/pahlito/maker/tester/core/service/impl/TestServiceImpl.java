// package cl.pahlito.maker.tester.core.service.impl;
//
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;
//
// import org.modelmapper.ModelMapper;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.util.StringUtils;
//
// import com.querydsl.core.types.dsl.BooleanExpression;
//
// import cl.pahlito.maker.tester.commons.model.TestDTO;
// import cl.pahlito.maker.tester.commons.service.TestService;
// import cl.pahlito.maker.tester.core.entity.QTestEntity;
// import cl.pahlito.maker.tester.core.entity.TestEntity;
// import cl.pahlito.maker.tester.core.repository.TestRepository;
//
// @Service
// public class TestServiceImpl implements TestService {
//
// private static final String COMODIN = "%";
//
// @Autowired
// private TestRepository testRepository;
//
// private ModelMapper mapper = new ModelMapper();
//
// @Override
// public TestDTO obtener(final Long id) {
// final Optional<TestEntity> optional = testRepository.findById(id);
// if (optional.isPresent()) {
// return mapper.map(optional.get(), TestDTO.class);
// }
// return null;
// }
//
// @Override
// public List<TestDTO> getLista(final String descripcion) {
//
// final List<TestDTO> lista = new ArrayList<TestDTO>();
// BooleanExpression conditions = QTestEntity.testEntity.isNotNull();
// if (StringUtils.hasText(descripcion)) {
// final StringBuilder busqueda = new StringBuilder();
// busqueda.append(COMODIN);
// busqueda.append(descripcion);
// busqueda.append(COMODIN);
// conditions =
// conditions.and(QTestEntity.testEntity.descripcion.like(busqueda.toString()));
// }
// final Iterable<TestEntity> result = testRepository.findAll(conditions);
// result.forEach(testEntity -> lista.add(mapper.map(testEntity,
// TestDTO.class)));
// return lista;
// }
//
// @Override
// public TestDTO guardar(final TestDTO test) {
//
// final TestEntity testEntity = testRepository.save(mapper.map(test,
// TestEntity.class));
// return mapper.map(testEntity, TestDTO.class);
// }
//
// @Override
// public void eliminar(final Long id) {
//
// if (testRepository.existsById(id)) {
// testRepository.deleteById(id);
// }
// }
//
// }
