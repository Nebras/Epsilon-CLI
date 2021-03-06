/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.cli.test.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.epsilon.commons.util.FileUtil;
import org.junit.Test;

public abstract class CliThatRunsToCompletionTest extends CliWithValidParametersTest {
	
	@Test
	public void outputModelShouldExist() {
		assertTrue(getTargetModel().exists());
	}
	
	@Test
	public void logFileShouldBeEmpty() throws Exception {
		assertEquals("", FileUtil.getFileContents(getLogFile()));
	}
}
