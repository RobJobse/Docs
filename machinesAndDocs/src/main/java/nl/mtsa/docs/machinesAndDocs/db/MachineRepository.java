package nl.mtsa.docs.machinesAndDocs.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MachineRepository extends CrudRepository<Machine, String> {	
	  List<Machine> findByNr(String nr); // NB nr moet wel een property zijn !! van machine
	  Iterable<Machine> findAll();	
}
