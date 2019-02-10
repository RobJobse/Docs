package nl.mtsa.docs.machinesAndDocs.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeMapService {

	@Autowired
	private TypeMapRepository typeMapRepo;
	
	public List<TypeMap> getTwoTypeMaps(){
		List<TypeMap> pairOfTypeMaps = new ArrayList<>();
		typeMapRepo.findAll().forEach(pairOfTypeMaps::add); // functional programming !!
		return pairOfTypeMaps;
	}
	
	public void addObject(TypeMap object){
		System.out.println(object.getNr()+" "+object.getNaam());
		typeMapRepo.save(object);
	}
	
	
	
	
	
}
