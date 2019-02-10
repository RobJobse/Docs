package nl.mtsa.docs.machinesAndDocs.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENT",schema="E")
public class Document {

	@Id
	private String nr;
	private String soort;
	private String omschrijving;
	private String paraaf;
	private String datum;
	private String locatie;
	private String afgeleid;
	
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getSoort() {
		return soort;
	}
	public void setSoort(String soort) {
		this.soort = soort;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public String getParaaf() {
		return paraaf;
	}
	public void setParaaf(String paraaf) {
		this.paraaf = paraaf;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getLocatie() {
		return locatie;
	}
	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}
	public String getAfgeleid() {
		return afgeleid;
	}
	public void setAfgeleid(String afgeleid) {
		this.afgeleid = afgeleid;
	}	

}
