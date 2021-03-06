/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: antoniospatera@libero.it
 * License Type: Evaluation
 */
package it.finsiel.sbn.polo.orm;

import java.io.Serializable;
/**
 * ORM-Persistable Class
 */
public class Ts_tag_legame extends OggettoServerSbnMarc implements Serializable {

	private static final long serialVersionUID = 2816294717219559895L;

	public boolean equals(Object aObj) {
		if (aObj == null)
			return false;
		if (!(aObj instanceof Ts_tag_legame))
			return false;
		Ts_tag_legame ts_tag_legame = (Ts_tag_legame)aObj;
		if (getID_TAG_MARC() != ts_tag_legame.getID_TAG_MARC())
			return false;
		if (getID_TITOLO_MARC() != ts_tag_legame.getID_TITOLO_MARC())
			return false;
		return true;
	}

	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID_TAG_MARC();
		hashcode = hashcode + getID_TITOLO_MARC().hashCode();
		return hashcode;
	}

	private long ID_TAG_MARC;

	private Long ID_TITOLO_MARC;

	private String NOME_TAG_LEGAME;

	private String NOME_TAG;

	private String INDICATORI;

	private String SOTTOCAMPO;

	private String VALORE_SOTTOCAMPO;

	private String NATURALEG;

	private String NATURA;

	private String TIPOMATERIALE;

	private String LIVELLOAUT;

	private String TIPORECORD;

	private String LIVELLOGERARCHICO;

	public void setID_TAG_MARC(long value) {
		this.ID_TAG_MARC = value;
    this.settaParametro(KeyParameter.XXXid_tag_marc,value);
	}

	public long getID_TAG_MARC() {
		return ID_TAG_MARC;
	}

	public void setNOME_TAG_LEGAME(String value) {
		this.NOME_TAG_LEGAME = value;
    this.settaParametro(KeyParameter.XXXnome_tag_legame,value);
	}

	public String getNOME_TAG_LEGAME() {
		return NOME_TAG_LEGAME;
	}

	public void setNOME_TAG(String value) {
		this.NOME_TAG = value;
    this.settaParametro(KeyParameter.XXXnome_tag,value);
	}

	public String getNOME_TAG() {
		return NOME_TAG;
	}

	public void setINDICATORI(String value) {
		this.INDICATORI = value;
    this.settaParametro(KeyParameter.XXXindicatori,value);
	}

	public String getINDICATORI() {
		return INDICATORI;
	}

	public void setSOTTOCAMPO(String value) {
		this.SOTTOCAMPO = value;
    this.settaParametro(KeyParameter.XXXsottocampo,value);
	}

	public String getSOTTOCAMPO() {
		return SOTTOCAMPO;
	}

	public void setVALORE_SOTTOCAMPO(String value) {
		this.VALORE_SOTTOCAMPO = value;
    this.settaParametro(KeyParameter.XXXvalore_sottocampo,value);
	}

	public String getVALORE_SOTTOCAMPO() {
		return VALORE_SOTTOCAMPO;
	}

	public void setID_TITOLO_MARC(long value) {
		setID_TITOLO_MARC(new Long(value));
    this.settaParametro(KeyParameter.XXXid_titolo_marc,value);
	}

	public void setID_TITOLO_MARC(Long value) {
		this.ID_TITOLO_MARC = value;
    this.settaParametro(KeyParameter.XXXid_titolo_marc,value);
	}

	public Long getID_TITOLO_MARC() {
		return ID_TITOLO_MARC;
	}

	public void setNATURALEG(String value) {
		this.NATURALEG = value;
    this.settaParametro(KeyParameter.XXXnaturaleg,value);
	}

	public String getNATURALEG() {
		return NATURALEG;
	}

	public void setNATURA(String value) {
		this.NATURA = value;
    this.settaParametro(KeyParameter.XXXnatura,value);
	}

	public String getNATURA() {
		return NATURA;
	}

	public void setTIPOMATERIALE(String value) {
		this.TIPOMATERIALE = value;
    this.settaParametro(KeyParameter.XXXtipomateriale,value);
	}

	public String getTIPOMATERIALE() {
		return TIPOMATERIALE;
	}

	public void setLIVELLOAUT(String value) {
		this.LIVELLOAUT = value;
    this.settaParametro(KeyParameter.XXXlivelloaut,value);
	}

	public String getLIVELLOAUT() {
		return LIVELLOAUT;
	}

	public void setTIPORECORD(String value) {
		this.TIPORECORD = value;
    this.settaParametro(KeyParameter.XXXtiporecord,value);
	}

	public String getTIPORECORD() {
		return TIPORECORD;
	}

	public void setLIVELLOGERARCHICO(String value) {
		this.LIVELLOGERARCHICO = value;
    this.settaParametro(KeyParameter.XXXlivellogerarchico,value);
	}


 public String getLIVELLOGERARCHICO() {
		return LIVELLOGERARCHICO;
	}

	public String toString() {
		return String.valueOf(getID_TAG_MARC() + " " + getID_TITOLO_MARC());
	}

	private boolean _saved = false;

	public void onSave() {
		_saved=true;
	}


	public void onLoad() {
		_saved=true;
	}


	public boolean isSaved() {
		return _saved;
	}


}
