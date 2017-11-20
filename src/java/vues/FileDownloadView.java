package vues;

import java.io.InputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
 
@ManagedBean
public class FileDownloadView {
     
    private StreamedContent file;
    
    
     
    public FileDownloadView() {    
    	 
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("text/m1.pdf");
        file = new DefaultStreamedContent(stream, "application/pdf", "m1.pdf");
         
        
    	
    }
 
   
    public StreamedContent getFile() {
        return file;
    } }