/*******************************************************************************
 * Copyright (c) 2012, 2016, 2017 PDT Extension Group and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PDT Extension Group - initial API and implementation
 *     Kaloyan Raev - [501269] externalize strings
 *******************************************************************************/
package org.eclipse.php.composer.ui.job;

import java.io.IOException;

import org.apache.commons.exec.ExecuteException;
import org.eclipse.core.resources.IProject;
import org.eclipse.php.composer.core.launch.ScriptLauncher;

public class InstallDevJob extends ComposerJob {

	public InstallDevJob(IProject project) {
		super(project, Messages.InstallDevJob_Name);
	}

	protected void launch(ScriptLauncher launcher) throws ExecuteException, IOException, InterruptedException {
		launcher.launch("install", new String[] { "--dev", "--no-progress", "--no-ansi" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}
}
