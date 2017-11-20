package vues;

import java.io.InputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class File {
	private StreamedContent file;
	public File(){
	 InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("text/m3.pdf");
     file = new DefaultStreamedContent(stream, "application/pdf", "m3.pdf");
	}
	public StreamedContent getFile() {
        return file;

}
	}
