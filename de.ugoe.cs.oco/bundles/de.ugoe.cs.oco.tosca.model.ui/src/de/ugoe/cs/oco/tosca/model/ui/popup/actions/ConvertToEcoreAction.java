package de.ugoe.cs.oco.tosca.model.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.ugoe.cs.oco.tosca.gen.extension.TOSCADef2Ecore;

public class ConvertToEcoreAction implements IObjectActionDelegate {
	private Shell shell;
	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		IFile selectedFile = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
		IPath outputPath = selectedFile.getRawLocation().makeAbsolute().removeFileExtension().addFileExtension("ecore");
		
		URI inputURI = URI.createFileURI(selectedFile.getRawLocation().makeAbsolute().toString());
		URI outputURI = URI.createFileURI(outputPath.toString());
		
		TOSCADef2Ecore.generateEcore(inputURI, outputURI);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.shell = targetPart.getSite().getShell();

	}

}
