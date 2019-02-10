package nl.mtsa.docs.machinesAndDocs.db;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;  // NB import  org.springframework.data.annotation.Id; IS DIT BETER ??

@Entity
@Table(name="TYPE",schema="E")
public class Type {
	@Id
	private String nr;
	private String naam;
	private String klant;
	private String order;
	private String archief;
	private String backup;
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
	public String getKlant() {
		return klant;
	}
	public void setKlant(String klant) {
		this.klant = klant;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getArchief() {
		return archief;
	}
	public void setArchief(String archief) {
		this.archief = archief;
	}
	public String getBackup() {
		return backup;
	}
	public void setBackup(String backup) {
		this.backup = backup;
	}
	
	

}
