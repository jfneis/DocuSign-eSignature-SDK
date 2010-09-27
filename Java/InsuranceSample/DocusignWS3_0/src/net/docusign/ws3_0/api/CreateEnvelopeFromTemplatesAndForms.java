/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
*/

package net.docusign.ws3_0.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvelopeInformation" type="{http://www.docusign.net/API/3.0}EnvelopeInformation" minOccurs="0"/>
 *         &lt;element name="CompositeTemplates" type="{http://www.docusign.net/API/3.0}ArrayOfCompositeTemplate" minOccurs="0"/>
 *         &lt;element name="ActivateEnvelope" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "envelopeInformation",
    "compositeTemplates",
    "activateEnvelope"
})
@XmlRootElement(name = "CreateEnvelopeFromTemplatesAndForms")
public class CreateEnvelopeFromTemplatesAndForms {

    @XmlElement(name = "EnvelopeInformation")
    protected EnvelopeInformation envelopeInformation;
    @XmlElement(name = "CompositeTemplates")
    protected ArrayOfCompositeTemplate compositeTemplates;
    @XmlElement(name = "ActivateEnvelope")
    protected boolean activateEnvelope;

    /**
     * Gets the value of the envelopeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeInformation }
     *     
     */
    public EnvelopeInformation getEnvelopeInformation() {
        return envelopeInformation;
    }

    /**
     * Sets the value of the envelopeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeInformation }
     *     
     */
    public void setEnvelopeInformation(EnvelopeInformation value) {
        this.envelopeInformation = value;
    }

    /**
     * Gets the value of the compositeTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompositeTemplate }
     *     
     */
    public ArrayOfCompositeTemplate getCompositeTemplates() {
        return compositeTemplates;
    }

    /**
     * Sets the value of the compositeTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompositeTemplate }
     *     
     */
    public void setCompositeTemplates(ArrayOfCompositeTemplate value) {
        this.compositeTemplates = value;
    }

    /**
     * Gets the value of the activateEnvelope property.
     * 
     */
    public boolean isActivateEnvelope() {
        return activateEnvelope;
    }

    /**
     * Sets the value of the activateEnvelope property.
     * 
     */
    public void setActivateEnvelope(boolean value) {
        this.activateEnvelope = value;
    }

}
