/*******************************************************************************
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
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

package org.eclipse.winery.repository.rest.resources.apiData;

import javax.xml.namespace.QName;

public class RequiredCapabilityTypeApiData {

    public AvailableSuperclassesApiData capabilityTypeList;
    public QName currentRequiredCapabilityType;

    public RequiredCapabilityTypeApiData() {
    }

    public RequiredCapabilityTypeApiData(AvailableSuperclassesApiData capabilityTypeList, QName currentRequiredCapabilityType) {
        this.capabilityTypeList = capabilityTypeList;
        this.currentRequiredCapabilityType = currentRequiredCapabilityType;
    }
}
