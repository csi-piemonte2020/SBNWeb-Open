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
package it.iccu.sbn.ejb.domain.amministrazione;

import it.iccu.sbn.ejb.vo.SerializableVO;
import it.iccu.sbn.vo.custom.amministrazione.MailProperties;

import java.util.HashMap;
import java.util.Map;

class MailPropertiesImpl extends SerializableVO implements MailProperties {

	private static final long serialVersionUID = 1L;

	String smtp;
	String pop;
	String mailUser;
	String mailPassword;
	String indirizzo;
	String descrizione;
	boolean forzaMittentePolo;
	Map<String, String> params = new HashMap<String, String>();

	public String getSmtp() {
		return smtp;
	}

	public String getPop() {
		return pop;
	}

	public String getMailUser() {
		return mailUser;
	}

	public String getMailPassword() {
		return mailPassword;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public boolean isForzaMittentePolo() {
		return forzaMittentePolo;
	}

	public Map<String, String> getOtherParams() {
		return params;
	}
}
