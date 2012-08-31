package se.miun.itm.input.example.inputoutput;

import se.miun.itm.input.export.LaTeXFileExporter;
import se.miun.itm.input.export.XMLFileExporter;
import se.miun.itm.input.model.InPUTException;
import se.miun.itm.input.model.design.DesignSpace;
import se.miun.itm.input.model.design.IDesign;
import se.miun.itm.input.model.design.IDesignSpace;

public class SimpleImportExport {

	public static void main(String[] args) throws InPUTException {
		IDesignSpace ds = new DesignSpace("externalizedSpace.xml");
		IDesign design = ds.nextDesign("someId");
		
		design.export(new XMLFileExporter("randomDesign.xml"));
		design.export(new LaTeXFileExporter("randomDesign.tex"));
		ds.export(new LaTeXFileExporter("designSpace.tex"));
	}
}
