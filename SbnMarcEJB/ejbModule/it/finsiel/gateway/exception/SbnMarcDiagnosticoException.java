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
package it.finsiel.gateway.exception;

public class SbnMarcDiagnosticoException extends Exception {

	private static final long serialVersionUID = 778805281438595448L;
	private final int errorID;
	private final String message;

	public SbnMarcDiagnosticoException(int errorID, String message) {
		this.errorID = errorID;
		this.message = message;
	}

	public int getErrorID() {
		return errorID;
	}

	public String getMessage() {
		return message;
	}

}
