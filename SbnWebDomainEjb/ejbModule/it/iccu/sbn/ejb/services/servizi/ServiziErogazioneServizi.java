/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.services.servizi;

import it.iccu.sbn.ejb.exception.ApplicationException;
import it.iccu.sbn.ejb.exception.DataException;
import it.iccu.sbn.ejb.exception.ValidationException;
import it.iccu.sbn.ejb.vo.gestionestampe.common.StampaType;
import it.iccu.sbn.ejb.vo.gestionestampe.common.StampeOnlineVO;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Remote interface for ServiziDocumentoFisico.
 * @generated
 * @wtp generated
 */
public interface ServiziErogazioneServizi
   extends javax.ejb.EJBObject
{

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws RemoteException
    * @throws ApplicationException
    * @throws DataException
    * @throws ValidationException
    * @generated //TODO: Must provide implementation for bean create stub    */
	public StampeOnlineVO stampeOnline(String ticket, StampaType tipoStampa,
			List parametri) throws RemoteException, ApplicationException,
			DataException, ValidationException;

}
