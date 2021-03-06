/********************************************************************************
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
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
 ********************************************************************************/
package org.eclipse.winery.compliance.model;

import org.apache.commons.lang3.StringUtils;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.DefaultDirectedGraph;

public class TOSCAGraph extends DefaultDirectedGraph<TOSCANode, TOSCAEdge> {

	private static final long serialVersionUID = 1L;

	public TOSCAGraph(EdgeFactory<TOSCANode, TOSCAEdge> ef) {
		super(ef);
	}

	public TOSCANode getNode(String id) {
		return vertexSet().stream().filter(n -> StringUtils.equals(id, n.getId())).findFirst().orElse(null);
	}

	public TOSCANode getReferenceNode() {
		return vertexSet().stream().findAny().orElse(null);
	}
}
