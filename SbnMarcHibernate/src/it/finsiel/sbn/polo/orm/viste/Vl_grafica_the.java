/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: almaviva
 * License Type: Purchased
 */
package it.finsiel.sbn.polo.orm.viste;

import it.finsiel.sbn.polo.orm.KeyParameter;
import it.finsiel.sbn.polo.orm.Tb_titolo;

import java.io.Serializable;
/**
 * ORM-Persistable Class
 */
public class Vl_grafica_the extends Tb_titolo implements Serializable  {

	private static final long serialVersionUID = -5997940977140779760L;

	public boolean equals(Object aObj) {
		if (aObj == null)
			return false;
		if (!(aObj instanceof Vl_grafica_the))
			return false;
		Vl_grafica_the vl_grafica_the = (Vl_grafica_the)aObj;
		if (getBID() != null && !getBID().equals(vl_grafica_the.getBID()))
			return false;
		if (getDID() != null && !getDID().equals(vl_grafica_the.getDID()))
			return false;
		return true;
	}

	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + getBID().hashCode();
		hashcode = hashcode + getDID().hashCode();
		return hashcode;
	}

	private String DID;

	private String CD_LIVELLO_G;

	private String TP_MATERIALE_GRA;

	private String CD_SUPPORTO;

	private String CD_COLORE;

	private String CD_TECNICA_DIS_1;

	private String CD_TECNICA_DIS_2;

	private String CD_TECNICA_DIS_3;

	private String CD_TECNICA_STA_1;

	private String CD_TECNICA_STA_2;

	private String CD_TECNICA_STA_3;

	private String CD_DESIGN_FUNZ;

	private String FL_CONDIVISO;

	private String UTE_CONDIVISO;

	private java.util.Date TS_CONDIVISO;

	public String getFL_CONDIVISO() {
		return FL_CONDIVISO;
	}

	public java.util.Date getTS_CONDIVISO() {
		return TS_CONDIVISO;
	}

	public String getUTE_CONDIVISO() {
		return UTE_CONDIVISO;
	}

	public void setFL_CONDIVISO(String value) {
		this.FL_CONDIVISO = value;
		this.settaParametro(KeyParameter.XXXfl_condiviso, value);
	}

	public void setTS_CONDIVISO(java.util.Date value) {
		this.TS_CONDIVISO = value;
		this.settaParametro(KeyParameter.XXXts_condiviso, value);
	}

	public void setUTE_CONDIVISO(String value) {
		this.UTE_CONDIVISO = value;
		this.settaParametro(KeyParameter.XXXute_condiviso, value);
	}

	public void setDID(String value) {
		this.DID = value;
    this.settaParametro(KeyParameter.XXXdid,value);
	}

	public String getDID() {
		return DID;
	}

	public void setCD_LIVELLO_G(String value) {
		this.CD_LIVELLO_G = value;
    this.settaParametro(KeyParameter.XXXcd_livello_g,value);
	}

	public String getCD_LIVELLO_G() {
		return CD_LIVELLO_G;
	}

	public void setTP_MATERIALE_GRA(String value) {
		this.TP_MATERIALE_GRA = value;
    this.settaParametro(KeyParameter.XXXtp_materiale_gra,value);
	}

	public String getTP_MATERIALE_GRA() {
		return TP_MATERIALE_GRA;
	}

	public void setCD_SUPPORTO(String value) {
		this.CD_SUPPORTO = value;
    this.settaParametro(KeyParameter.XXXcd_supporto,value);
	}

	public String getCD_SUPPORTO() {
		return CD_SUPPORTO;
	}

	public void setCD_COLORE(String value) {
		this.CD_COLORE = value;
    this.settaParametro(KeyParameter.XXXcd_colore,value);
	}

	public String getCD_COLORE() {
		return CD_COLORE;
	}

	public void setCD_TECNICA_DIS_1(String value) {
		this.CD_TECNICA_DIS_1 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_dis_1,value);
	}

	public String getCD_TECNICA_DIS_1() {
		return CD_TECNICA_DIS_1;
	}

	public void setCD_TECNICA_DIS_2(String value) {
		this.CD_TECNICA_DIS_2 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_dis_2,value);
	}

	public String getCD_TECNICA_DIS_2() {
		return CD_TECNICA_DIS_2;
	}

	public void setCD_TECNICA_DIS_3(String value) {
		this.CD_TECNICA_DIS_3 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_dis_3,value);
	}

	public String getCD_TECNICA_DIS_3() {
		return CD_TECNICA_DIS_3;
	}

	public void setCD_TECNICA_STA_1(String value) {
		this.CD_TECNICA_STA_1 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_sta_1,value);
	}

	public String getCD_TECNICA_STA_1() {
		return CD_TECNICA_STA_1;
	}

	public void setCD_TECNICA_STA_2(String value) {
		this.CD_TECNICA_STA_2 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_sta_2,value);
	}

	public String getCD_TECNICA_STA_2() {
		return CD_TECNICA_STA_2;
	}

	public void setCD_TECNICA_STA_3(String value) {
		this.CD_TECNICA_STA_3 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_sta_3,value);
	}

	public String getCD_TECNICA_STA_3() {
		return CD_TECNICA_STA_3;
	}

	public void setCD_DESIGN_FUNZ(String value) {
		this.CD_DESIGN_FUNZ = value;
    this.settaParametro(KeyParameter.XXXcd_design_funz,value);
	}


 public String getCD_DESIGN_FUNZ() {
		return CD_DESIGN_FUNZ;
 }



	public String toString() {
		return String.valueOf(getBID() + " " + getDID());
	}
}
