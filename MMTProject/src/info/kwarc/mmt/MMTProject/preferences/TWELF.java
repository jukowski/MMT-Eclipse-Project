package info.kwarc.mmt.MMTProject.preferences;

import info.kwarc.mmt.MMTProject.Activator;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class TWELF extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	IPreferenceStore preferenceStore;
	
	public TWELF() {
		
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("TWELF compiler preferences");		
	}

	@Override
	protected void createFieldEditors() {
		addField(new DirectoryFieldEditor("TWELF_PATH", "&TWELF bin directory:",
		getFieldEditorParent()));		
	}


}
