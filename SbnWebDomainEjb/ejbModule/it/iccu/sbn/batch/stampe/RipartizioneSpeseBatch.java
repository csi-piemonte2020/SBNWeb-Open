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
package it.iccu.sbn.batch.stampe;

import it.iccu.sbn.ejb.DomainEJBStampeFactory;
import it.iccu.sbn.ejb.domain.stampe.SBNStampaStatistiche;
import it.iccu.sbn.ejb.domain.stampe.SBNStampeSpese;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.ElaborazioniDifferiteOutputVo;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.ParametriRichiestaElaborazioneDifferitaVO;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.RipartizioneSpeseDiffVO;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.StampaStatisticheDiffVO;
import it.iccu.sbn.servizi.batch.BatchExecutor;
import it.iccu.sbn.servizi.batch.BatchLogWriter;

import javax.transaction.UserTransaction;

public class RipartizioneSpeseBatch implements BatchExecutor {

	SBNStampeSpese getEjb() throws Exception {
		return DomainEJBStampeFactory.getInstance().getSBNStampeSpese();
	}


	SBNStampaStatistiche getEjbStat() throws Exception {
		return DomainEJBStampeFactory.getInstance().getSBNStampaStatistiche();
	}

	public ElaborazioniDifferiteOutputVo execute(String prefissoOutput,
			ParametriRichiestaElaborazioneDifferitaVO params, BatchLogWriter log, UserTransaction tx)
			throws Exception {
		ElaborazioniDifferiteOutputVo output = new ElaborazioniDifferiteOutputVo(params) ;

		if ( params instanceof RipartizioneSpeseDiffVO) //{((RipartizioneSpeseDiffVO) params).getStampavo().getTipoOperazione().equals("STAMPA_SPESE"))
		{
			log.logWriteLine("Sto eseguendo la stampa della ripartizione delle spese");
			output = (ElaborazioniDifferiteOutputVo) getEjb().elabora((RipartizioneSpeseDiffVO) params, log);
		}
		else
		{
			log.logWriteLine("Sto eseguendo la stampa delle statistiche");
			output = (ElaborazioniDifferiteOutputVo) getEjbStat().elabora((StampaStatisticheDiffVO) params, log);
		}
		return output;
	}

	public boolean validateInput(ParametriRichiestaElaborazioneDifferitaVO params, BatchLogWriter log) {

		return true;
	}

}
