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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.21 at 02:52:06 PM CEST
//


package it.iccu.sbn.vo.xml.binding.ill.apdu;

import it.iccu.sbn.ejb.vo.SerializableVO;
import it.iccu.sbn.servizi.ill.api.ILLBaseAction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusOrErrorReportType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StatusOrErrorReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Transaction-Id" minOccurs="0"/>
 *         &lt;element name="Service-date-time" type="{}ServiceDateTimeType" minOccurs="0"/>
 *         &lt;element ref="{}Requester-Id" minOccurs="0"/>
 *         &lt;element ref="{}Responder-Id" minOccurs="0"/>
 *         &lt;element ref="{}Status-report" minOccurs="0"/>
 *         &lt;element ref="{}Error-report" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOrErrorReportType", propOrder = {
    "transactionId",
    "serviceDateTime",
    "requesterId",
    "responderId",
    "statusReport",
    "errorReport"
})
public class StatusOrErrorReportType
    extends SerializableVO
    implements ILLBaseAction
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Transaction-Id")
    protected TransactionIdType transactionId;
    @XmlElement(name = "Service-date-time")
    protected ServiceDateTimeType serviceDateTime;
    @XmlElement(name = "Requester-Id")
    protected String requesterId;
    @XmlElement(name = "Responder-Id")
    protected String responderId;
    @XmlElement(name = "Status-report")
    protected StatusReportType statusReport;
    @XmlElement(name = "Error-report")
    protected String errorReport;

    /**
     * Gets the value of the transactionId property.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdType }
     *
     */
    public TransactionIdType getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdType }
     *
     */
    public void setTransactionId(TransactionIdType value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the serviceDateTime property.
     *
     * @return
     *     possible object is
     *     {@link ServiceDateTimeType }
     *
     */
    public ServiceDateTimeType getServiceDateTime() {
        return serviceDateTime;
    }

    /**
     * Sets the value of the serviceDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceDateTimeType }
     *
     */
    public void setServiceDateTime(ServiceDateTimeType value) {
        this.serviceDateTime = value;
    }

    /**
     * Gets the value of the requesterId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

    /**
     * Gets the value of the responderId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponderId() {
        return responderId;
    }

    /**
     * Sets the value of the responderId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponderId(String value) {
        this.responderId = value;
    }

    /**
     * Gets the value of the statusReport property.
     *
     * @return
     *     possible object is
     *     {@link StatusReportType }
     *
     */
    public StatusReportType getStatusReport() {
        return statusReport;
    }

    /**
     * Sets the value of the statusReport property.
     *
     * @param value
     *     allowed object is
     *     {@link StatusReportType }
     *
     */
    public void setStatusReport(StatusReportType value) {
        this.statusReport = value;
    }

    /**
     * Gets the value of the errorReport property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorReport() {
        return errorReport;
    }

    /**
     * Sets the value of the errorReport property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorReport(String value) {
        this.errorReport = value;
    }

}
