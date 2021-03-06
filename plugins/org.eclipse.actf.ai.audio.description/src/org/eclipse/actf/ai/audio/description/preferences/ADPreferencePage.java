/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Daisuke SATO - initial API and implementation
 *******************************************************************************/

package org.eclipse.actf.ai.audio.description.preferences;

import org.eclipse.actf.ai.internal.audio.description.DescriptionPlugin;
import org.eclipse.actf.ai.internal.audio.description.Messages;
import org.eclipse.actf.ai.tts.TTSRegistry;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class ADPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public ADPreferencePage() {
		super(GRID);
		setPreferenceStore(DescriptionPlugin.getDefault().getPreferenceStore());
		setDescription(Messages.AudioDescription_preference_title); 
	}

	@Override
	public void createFieldEditors() {
		RadioGroupFieldEditor rgfe;
		String[][] labelAndIds = TTSRegistry.getLabelAndIds();
		addField(rgfe = new RadioGroupFieldEditor(
				DescriptionPlugin.PREF_ENGINE,
				Messages.AudioDescription_voice_engine, 1, labelAndIds, 
				getFieldEditorParent()));
		Composite c = rgfe.getRadioBoxControl(getFieldEditorParent());
		for (int i = 0; i < labelAndIds.length; i++) {
			if (labelAndIds[i][1].length() == 0) {
				c.getChildren()[i].setEnabled(false);
			}
		}
	}

	public void init(IWorkbench workbench) {

	}
}
