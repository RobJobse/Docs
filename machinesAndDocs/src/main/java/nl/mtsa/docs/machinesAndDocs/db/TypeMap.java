package nl.mtsa.docs.machinesAndDocs.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPEMAP",schema="E")
public class TypeMap {
	@Id
	private String nr;
	private String naam;
	
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	

}
