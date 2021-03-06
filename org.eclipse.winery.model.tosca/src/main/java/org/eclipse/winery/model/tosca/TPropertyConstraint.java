/*******************************************************************************
 * Copyright (c) 2013-2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/

package org.eclipse.winery.model.tosca;

import org.eclipse.jdt.annotation.NonNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for tPropertyConstraint complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="tPropertyConstraint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tConstraint">
 *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPropertyConstraint")
public class TPropertyConstraint
    extends TConstraint {

    @XmlAttribute(name = "property", required = true)
    protected String property;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TPropertyConstraint)) return false;
        if (!super.equals(o)) return false;
        TPropertyConstraint that = (TPropertyConstraint) o;
        return Objects.equals(property, that.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), property);
    }

    /**
     * Gets the value of the property property.
     *
     * @return possible object is {@link String }
     */
    @NonNull
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     *
     * @param value allowed object is {@link String }
     */
    public void setProperty(String value) {
        this.property = value;
    }
}
