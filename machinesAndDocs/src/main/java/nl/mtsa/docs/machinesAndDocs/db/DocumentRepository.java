package nl.mtsa.docs.machinesAndDocs.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, String> {
	  List<Document> findByNr(String nr); // NB nr moet wel een property zijn !! van machine
	  Iterable<Document> findAll();	
}
