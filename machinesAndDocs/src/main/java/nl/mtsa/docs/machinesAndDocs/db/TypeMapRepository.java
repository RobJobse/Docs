package nl.mtsa.docs.machinesAndDocs.db;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TypeMapRepository extends CrudRepository<TypeMap, String>{
	  List<TypeMap> findByNr(String nr); // NB nr moet wel een property zijn !! van machine
	  Iterable<TypeMap> findAll();	
	// wekt niet  TypeMap Save(TypeMap arg);
	  
}

