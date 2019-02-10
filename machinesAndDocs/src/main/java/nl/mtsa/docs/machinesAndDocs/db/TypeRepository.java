package nl.mtsa.docs.machinesAndDocs.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, String> {
	  List<Type> findByNr(String nr); // NB nr moet wel een property zijn !! van machine
	  Iterable<Type> findAll();	
}
