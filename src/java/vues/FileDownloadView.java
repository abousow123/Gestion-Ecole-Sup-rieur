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
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("text/cvKende.pdf");
        file = new DefaultStreamedContent(stream, "application/pdf", "cvKende.pdf");
    }
 
    public StreamedContent getFile() {
        return file;
    }
}