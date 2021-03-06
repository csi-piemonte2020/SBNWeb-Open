/*******************************************************************************
 * Copyright (C) 2019 ICCU - Istituto Centrale per il Catalogo Unico
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
//	SBNWeb - Rifacimento ClientServer
//	FORM sintetica autori
//	almaviva2 - Inizio Codifica Agosto 2006

package it.iccu.sbn.web.actionforms.gestionebibliografica.luogo;

import it.iccu.sbn.ejb.vo.gestionebibliografica.AreePassaggioSifVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.altre.AreaDatiPassaggioInterrogazioneLuogoVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.altre.AreaDatiVariazioneLuogoVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiLegameTitoloVO;
import it.iccu.sbn.web.actions.gestionebibliografica.utility.TabellaEsaminaVO;


public class SinteticaLuoghiForm extends AbstractSinteticaLuoghiForm {


	private static final long serialVersionUID = 2779245232733943053L;

	//	 Aree della sintetica utilizzate per interrogare in indice con l'area passata da interrogazione
	AreaDatiPassaggioInterrogazioneLuogoVO datiInterrLuogo = new AreaDatiPassaggioInterrogazioneLuogoVO();

	TabellaEsaminaVO tabellaEsaminaVO = new TabellaEsaminaVO();

	public String creaLuo = "SI";
	public String creaLuoLoc = "SI";

	private Integer linkProgressivo;

	private String prospettaDatiOggColl;
	private String idOggColl;
	private String descOggColl;
	private String tipologiaTastiera;

	//	 Aree della sintetica utilizzate per la prospettazione dei titoli collegati (utilizzo come Sif)
	private AreePassaggioSifVO areePassSifVo = new AreePassaggioSifVO();
	private String utilizzoComeSif;

	// Aree della sintetica utilizzate per la prospettazione dei simili in variazione descrizione
	private String livRicerca;
	private String prospettazioneSimili;
	AreaDatiVariazioneLuogoVO areaDatiPassPerConfVariazione = new AreaDatiVariazioneLuogoVO();

	// Aree della sintetica utilizzate per la prospettazione degli oggetti in creazione legame titolo
	private String prospettazionePerLegami;
	AreaDatiLegameTitoloVO areaDatiLegameTitoloVO	= new AreaDatiLegameTitoloVO();

	public String getLivRicerca() {
		return livRicerca;
	}

	public void setLivRicerca(String livRicerca) {
		this.livRicerca = livRicerca;
	}

	public AreaDatiLegameTitoloVO getAreaDatiLegameTitoloVO() {
		return areaDatiLegameTitoloVO;
	}

	public void setAreaDatiLegameTitoloVO(
			AreaDatiLegameTitoloVO areaDatiLegameTitoloVO) {
		this.areaDatiLegameTitoloVO = areaDatiLegameTitoloVO;
	}

	public String getProspettazionePerLegami() {
		return prospettazionePerLegami;
	}

	public void setProspettazionePerLegami(String prospettazionePerLegami) {
		this.prospettazionePerLegami = prospettazionePerLegami;
	}
	public AreaDatiVariazioneLuogoVO getAreaDatiPassPerConfVariazione() {
		return areaDatiPassPerConfVariazione;
	}

	public void setAreaDatiPassPerConfVariazione(
			AreaDatiVariazioneLuogoVO areaDatiPassPerConfVariazione) {
		this.areaDatiPassPerConfVariazione = areaDatiPassPerConfVariazione;
	}

	public AreaDatiPassaggioInterrogazioneLuogoVO getDatiInterrLuogo() {
		return datiInterrLuogo;
	}

	public void setDatiInterrLuogo(
			AreaDatiPassaggioInterrogazioneLuogoVO datiInterrLuogo) {
		this.datiInterrLuogo = datiInterrLuogo;
	}

	public String getProspettazioneSimili() {
		return prospettazioneSimili;
	}

	public void setProspettazioneSimili(String prospettazioneSimili) {
		this.prospettazioneSimili = prospettazioneSimili;
	}

	public AreePassaggioSifVO getAreePassSifVo() {
		return areePassSifVo;
	}

	public void setAreePassSifVo(AreePassaggioSifVO areePassSifVo) {
		this.areePassSifVo = areePassSifVo;
	}

	public String getDescOggColl() {
		return descOggColl;
	}

	public void setDescOggColl(String descOggColl) {
		this.descOggColl = descOggColl;
	}

	public String getIdOggColl() {
		return idOggColl;
	}

	public void setIdOggColl(String idOggColl) {
		this.idOggColl = idOggColl;
	}

	public String getProspettaDatiOggColl() {
		return prospettaDatiOggColl;
	}

	public void setProspettaDatiOggColl(String prospettaDatiOggColl) {
		this.prospettaDatiOggColl = prospettaDatiOggColl;
	}

	public String getUtilizzoComeSif() {
		return utilizzoComeSif;
	}

	public void setUtilizzoComeSif(String utilizzoComeSif) {
		this.utilizzoComeSif = utilizzoComeSif;
	}

	public Integer getLinkProgressivo() {
		return linkProgressivo;
	}

	public void setLinkProgressivo(Integer linkProgressivo) {
		this.linkProgressivo = linkProgressivo;
	}

	public String getTipologiaTastiera() {
		return tipologiaTastiera;
	}

	public void setTipologiaTastiera(String tipologiaTastiera) {
		this.tipologiaTastiera = tipologiaTastiera;
	}

	public TabellaEsaminaVO getTabellaEsaminaVO() {
		return tabellaEsaminaVO;
	}

	public void setTabellaEsaminaVO(TabellaEsaminaVO tabellaEsaminaVO) {
		this.tabellaEsaminaVO = tabellaEsaminaVO;
	}

	public String getCreaLuo() {
		return creaLuo;
	}

	public void setCreaLuo(String creaLuo) {
		this.creaLuo = creaLuo;
	}

	public String getCreaLuoLoc() {
		return creaLuoLoc;
	}

	public void setCreaLuoLoc(String creaLuoLoc) {
		this.creaLuoLoc = creaLuoLoc;
	}

}
