package vues;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImagesView {
     
    private List<String> images;
    private List <String> filieres;
    
    
    
    
     private String choixSg="secretaire";
    private String choixProf="Professeur";

    public String getChoixSg() {
        return choixSg;
    }

    public void setChoixSg(String choixSg) {
        this.choixSg = choixSg;
    }

    public String getChoixProf() {
        return choixProf;
    }

    public void setChoixProf(String choixProf) {
        this.choixProf = choixProf;
    }
    
    
    
    
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
    for(int i=1;i<=3;i++){    
            images.add("image"+ i +".jpg");
    }
    
    
    filieres=new ArrayList<String>();
	filieres.add("Mathematiques");
	filieres.add("Informatique");
	filieres.add("Science Environnement");
    }
    
 
    public List<String> getImages() {
        return images;
    }
    public List<String>getFilieres(){
    	return filieres;
    }
}
