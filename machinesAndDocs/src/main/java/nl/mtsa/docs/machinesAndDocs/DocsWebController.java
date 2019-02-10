package nl.mtsa.docs.machinesAndDocs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.mtsa.docs.machinesAndDocs.db.Document;
import nl.mtsa.docs.machinesAndDocs.db.DocumentRepository;
import nl.mtsa.docs.machinesAndDocs.db.Machine;
import nl.mtsa.docs.machinesAndDocs.db.MachineRepository;
import nl.mtsa.docs.machinesAndDocs.db.Type;
import nl.mtsa.docs.machinesAndDocs.db.TypeMap;
import nl.mtsa.docs.machinesAndDocs.db.TypeMapRepository;
import nl.mtsa.docs.machinesAndDocs.db.TypeRepository;

@Controller
public class DocsWebController {
	
    @Autowired
    MachineRepository machineRepo;
    
    @Autowired
    DocumentRepository documentRepo;   
    
    @Autowired
    TypeRepository typeRepo;    
    
    @Autowired
    TypeMapRepository typeMapRepo;      

    @RequestMapping("/one")  // url
    public String one() {  // methode name doesn't matter
        return "one";  // returns template name
    }	
    
    @RequestMapping("/type")
    public String showtypes(Model model) {
    	//System.out.println(">>> DocsWebController + @RequestMapping(\"/machine\") Called");
        List<Type> list = new ArrayList<>();
        for(Type item: typeRepo.findAll()){
            list.add(item);
            //System.out.println(item);
        }    	
        model.addAttribute("items", list);

        return "type_tbl";  // NB template name !! moet exsact matchen !!
    }      
	
    @RequestMapping("/machine")
    public String showmachs(Model model) {
    	//System.out.println(">>> DocsWebController + @RequestMapping(\"/machine\") Called");
        List<Machine> list = new ArrayList<>();
        for(Machine item: machineRepo.findAll()){
            list.add(item);
            //System.out.println(item);
        }    	
        model.addAttribute("items", list);

        return "machine_tbl";  // NB template name !! moet exsact matchen !!
    }     
    
    @RequestMapping("/document")
    public String showdocs(Model model) {
    	//System.out.println(">>> DocsWebController + @RequestMapping(\"/machine\") Called");
        List<Document> list = new ArrayList<>();
        for(Document item: documentRepo.findAll()){
            list.add(item);
            //System.out.println(item);
        }    	
        model.addAttribute("items", list);

        return "document_tbl";  // NB template name !! moet exsact matchen !!
    }      
    
    @RequestMapping("/typemap")
    public String showTypeMaps(Model model) {
    	//System.out.println(">>> DocsWebController + @RequestMapping(\"/machine\") Called");
        List<TypeMap> list = new ArrayList<>();
        for(TypeMap item: typeMapRepo.findAll()){
            list.add(item);
            //System.out.println(item);
        }    	
        model.addAttribute("items", list);

        return "typemap_tbl";  // NB template name !! moet exsact matchen !!
    }    
    
    @RequestMapping("/topics")
    public String showTopics(Model model) {

       // List<Document> list = new ArrayList<>();
       // for(Document item: documentRepo.findAll()){
       //     list.add(item);
       // }    	
       // model.addAttribute("items", list);

        return "topics";  // NB template name !! moet exsact matchen !!
    }     
    
    
}


/*
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.data.Assy;
import com.example.demo.data.AssyRepository;

@Controller
public class WelcomeController {


  //  @RequestMapping("/welcome")
  //  public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
  //      model.addAttribute("name", name);
  //      return "welcomeww";
  //  } 
	
	
    @RequestMapping("/one")  // url
    public String one() {  // methode name doesn't matter
        return "one";  // returns template name
    }
    
    @RequestMapping("/two")  // url
    public String two() {  // methode name doesn't matter
        return "two";  // returns template name
    }   
    
    @RequestMapping("/static")  // url
    public String three() {  // methode name doesn't matter
        return "static";  // returns template name
    }    
    
    @Autowired
    Repository repo;
    
    @Autowired
    LinkTypeRepository linkTypeRepo;      
    

    @Autowired
    ItemRepository itemRepo;          

    @RequestMapping("/table")
    public String showtable(Model model) {

        List<ItemClass> list = new ArrayList<>();
        for(ItemClass item: repo.findAll()){
            list.add(item);
        }    	
        model.addAttribute("itemclasses", list);

        return "tableItemClass";
    }    
    
    
    @RequestMapping("/linktype")
    public String showLinks(Model model) {

        List<LinkType> list = new ArrayList<>();
        for(LinkType item: linkTypeRepo.findAll()){
            list.add(item);
        }    	
        model.addAttribute("linktypes", list);

        return "tablelinktype";
    } 	
    
    
    @RequestMapping("/item")
    public String showItem(Model model) {

        List<Item> list = new ArrayList<>();
        for(Item item: itemRepo.findAll()){
            list.add(item);
        }    	
        model.addAttribute("items", list);

        return "tableItem";
    }       
    
    @Autowired
    AssyRepository assyRepo;
    
    @RequestMapping("/assy")
    public String showAssy(Model model) {

        List<Assy> list = new ArrayList<>();
        for(Assy item: assyRepo.findAll()){
            list.add(item);
        }    	
        model.addAttribute("items", list);

        return "tableAssy";
    }      
        
    
    
}
*/