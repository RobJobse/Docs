package nl.mtsa.docs.machinesAndDocs.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MACHINE",schema="E")
public class Machine {
	@Id
	private String nr;
	private String dol;
	private String type;
	private String naam;
	private String order;
	private String klant;
	private String opmerking;
	
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getDol() {
		return dol;
	}
	public void setDol(String dol) {
		this.dol = dol;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getKlant() {
		return klant;
	}
	public void setKlant(String klant) {
		this.klant = klant;
	}
	public String getOpmerking() {
		return opmerking;
	}
	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}
	

}
