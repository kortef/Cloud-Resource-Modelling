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

import de.ugoe.cs.oco.tosca.gen.configuration.TOSCADefToConfigTransformator;

public class ConvertToTOSCAConfigurationAction implements IObjectActionDelegate {
	private Shell shell;
	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		IFile selectedFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		IPath outputPath = selectedFile.getRawLocation().makeAbsolute().removeFileExtension().addFileExtension("toscac");
		
		URI toscaURI = URI.createFileURI(selectedFile.getRawLocation().makeAbsolute().toString());
		URI occiURI = URI.createFileURI(outputPath.toString());
		
		try {
			new TOSCADefToConfigTransformator().transform(toscaURI, occiURI);
			selectedFile.refreshLocal(2, null);
			selectedFile.getParent().refreshLocal(2, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
