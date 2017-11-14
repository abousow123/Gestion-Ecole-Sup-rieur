
package vues;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AttestationPDF {
	Document document = new Document();
	public AttestationPDF(){
		
		
	}
public void genererPDF(String nom,String prenom,String date,String lieu,String niveau) throws DocumentException{
		
		String CSA="Mr CSA UCAD FST";
		String out="attestation"+nom+prenom+".pdf";
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream(out));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        document.open();

        document.addTitle("ATTESTATION DE REUSSITE");
  	  
  			Paragraph p=new Paragraph("Republique du Senegal");
  			p.setAlignment(Paragraph.ALIGN_TOP);
  			try {
				document.add(p);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	
  			 ajouterLigne(new Paragraph(), 2);

  			Paragraph p0=new Paragraph("Ministere de l'Enseignement Superieur\n,de la Recherche");
  			 p0.setAlignment(Paragraph.ALIGN_CENTER);
  		 document.add(p0);

  		 Paragraph para=new Paragraph(" ");
  		Paragraph para1=new Paragraph();
  		//ajouterLigne(para, 3);
  		Chunk chunk=new Chunk("ATTESTATION DE REUSSITE",FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.ITALIC));	
  		 
  		para.setAlignment(Paragraph.ALIGN_CENTER);
  		ajouterLigne(para, 4);
  		para.add(chunk);
  		

  		para1=new Paragraph("Je soussigné Mr (Mlle) "+CSA+", Chef des Services Admiistratifs de l'UFR SET\n"
  			 		+ " de l'université de Thies, atteste que\n Mr (Mlle) "+prenom+" "+nom+" né le "+date+ " a "+lieu+"   a reussi sa "+niveau
  			 		+" pour cette année\n\n En foi de quoi, je lui délivre cette presente attestation pour servir et valoir ce que de droit",FontFactory.getFont(FontFactory.HELVETICA, 16));
  			 para1.setAlignment(Paragraph.ALIGN_CENTER);
  			 ajouterLigne(para1, 2);
  			 Paragraph para2=new Paragraph( "LE CHEF DE SERVICES ADMINISTRATIFS" );
  			 para2.setAlignment(Paragraph.ALIGN_LEFT);
  			 
  			 document.add(para);
  			 document.add(para1);
  			 document.add(para2);
            open(out);
		document.close();
		    
	}
public Document getDocument(){
	return document;
	
}

private void ajouterLigne(Paragraph para,int number){
		  
		  
		  for(int i=0;i<number;i++){
			  
			  para.add(new Paragraph(""));
		  }
	  }
	
	static void open(String toOpen) {
		
		if (toOpen == null)
			throw new NullPointerException();
		if (!Desktop.isDesktopSupported())
			return;
		Desktop desktop = Desktop.getDesktop();

		try {
			desktop.open(new File(toOpen));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
