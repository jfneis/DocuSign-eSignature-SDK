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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchBox complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MatchBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="XPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchBox", propOrder = {
    "pageNumber",
    "xPosition",
    "yPosition",
    "width",
    "height"
})
public class MatchBox {

    @XmlElement(name = "PageNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageNumber;
    @XmlElement(name = "XPosition")
    protected int xPosition;
    @XmlElement(name = "YPosition")
    protected int yPosition;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Height")
    protected int height;

    /**
     * Gets the value of the pageNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPageNumber(BigInteger value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the xPosition property.
     *
     */
    public int getXPosition() {
        return xPosition;
    }

    /**
     * Sets the value of the xPosition property.
     *
     */
    public void setXPosition(int value) {
        this.xPosition = value;
    }

    /**
     * Gets the value of the yPosition property.
     *
     */
    public int getYPosition() {
        return yPosition;
    }

    /**
     * Sets the value of the yPosition property.
     *
     */
    public void setYPosition(int value) {
        this.yPosition = value;
    }

    /**
     * Gets the value of the width property.
     *
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     *
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     */
    public void setHeight(int value) {
        this.height = value;
    }

}
