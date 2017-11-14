package vues;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImagesView {
     
    private List<String> images;
    private List <String> filieres;
    
    
     
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
