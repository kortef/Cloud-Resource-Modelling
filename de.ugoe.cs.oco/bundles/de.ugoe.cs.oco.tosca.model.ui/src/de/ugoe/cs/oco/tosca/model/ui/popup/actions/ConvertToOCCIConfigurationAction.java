package de.ugoe.cs.oco.tosca.model.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.ugoe.cs.oco.tosca2occi.TOSCA2OCCITransformator;

public class ConvertToOCCIConfigurationAction implements IObjectActionDelegate {
	private Shell shell;
	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		IFile selectedFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		IPath outputPath = selectedFile.getFullPath().removeFileExtension().addFileExtension("occic");
		
		URI toscaURI = URI.createFileURI(workspacePath + selectedFile.getFullPath().toString());
		URI occiURI = URI.createFileURI(workspacePath + outputPath.toString());
		
		try {
			new TOSCA2OCCITransformator().transform(toscaURI, occiURI);
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
