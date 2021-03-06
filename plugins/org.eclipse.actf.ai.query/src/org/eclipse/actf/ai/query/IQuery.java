/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hisashi MIYASHITA - initial API and implementation
 *******************************************************************************/

package org.eclipse.actf.ai.query;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * This represents a query object.
 */
public interface IQuery {
	/**
	 * @param base
	 *            the base node of the query.
	 * @return the NodeList gathered by the query.
	 */
	NodeList query(Node base);

	/**
	 * @return whether the query has target attribute.
	 */
	boolean hasTarget();
}
