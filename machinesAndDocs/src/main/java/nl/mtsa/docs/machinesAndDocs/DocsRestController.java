package nl.mtsa.docs.machinesAndDocs;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.mtsa.docs.machinesAndDocs.db.TypeMap;
import nl.mtsa.docs.machinesAndDocs.db.TypeMapService;

@RestController
public class DocsRestController {

	@Autowired
	private TypeMapService typeMapService;
	
	@RequestMapping("/typemaps")
	public List<TypeMap> getAllTypeMaps(){
		return typeMapService.getTwoTypeMaps();
	}
	
	@PostMapping( "/typemaps" )
	public TypeMap someControllerMethod(TypeMap body ) {
		typeMapService.addObject(body);
		return body;
	}	
	
//	@RequestMapping(method=RequestMethod.POST, value = "/typemaps")
//	public void addTypeMap(@RequestBody TypeMap object){
//		typeMapService.addObject(object);
//	}	
	
}
