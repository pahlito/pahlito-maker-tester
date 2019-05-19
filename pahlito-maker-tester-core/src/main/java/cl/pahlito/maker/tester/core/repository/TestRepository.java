package cl.pahlito.maker.tester.core.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import cl.pahlito.maker.tester.core.entity.TestEntity;

public interface TestRepository extends CrudRepository<TestEntity, Long>, QuerydslPredicateExecutor<TestEntity> {

}
