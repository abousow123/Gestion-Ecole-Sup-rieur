package vues;

import java.io.InputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class Filedown {
	
	 private StreamedContent file;

	 
	  public Filedown() {    
	    	 
	        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("web/text/m2.pdf");
	        file = new DefaultStreamedContent(stream, "application/pdf", "m2.pdf");
	  }
	  
	  public StreamedContent getFile() {
	        return file;

}
}