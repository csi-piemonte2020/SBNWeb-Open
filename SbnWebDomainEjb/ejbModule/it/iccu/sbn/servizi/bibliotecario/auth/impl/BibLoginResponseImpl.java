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
package it.iccu.sbn.servizi.bibliotecario.auth.impl;

import it.iccu.sbn.extension.auth.bibliotecario.BibLoginResponse;
import it.iccu.sbn.persistence.dao.common.DaoManager;

import java.sql.Timestamp;

public class BibLoginResponseImpl implements BibLoginResponse {

	private LoginResult result;
	private Timestamp when;

	public BibLoginResponseImpl(LoginResult result) {
		this.result = result;
		this.when = DaoManager.now();
	}

	public LoginResult getStatus() {
		return result;
	}

	public Timestamp getWhen() {
		return when;
	}

}
