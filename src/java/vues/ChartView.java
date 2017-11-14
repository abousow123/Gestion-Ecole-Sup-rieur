package vues;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
public class ChartView  implements Serializable{
	
	
	 
	
	 
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private CartesianChartModel combinedModel;
		private LineChartModel animatedModel1;
	    @PostConstruct
	    public void init() {
	        createCombinedModel();
	        createAnimatedModels();
	    
	    }
	 
	    public CartesianChartModel getCombinedModel() {
	        return combinedModel;
	    }
	     
	    public LineChartModel getAnimatedModel1() {
	        return animatedModel1;
	    }
	    
	        
	    
	    private void createAnimatedModels() {
	        animatedModel1 = initLinearModel();
	        animatedModel1.setTitle("Résultats de ces dernieres années");
	        animatedModel1.setAnimate(true);
	        animatedModel1.setLegendPosition("se");
	        Axis yAxis = animatedModel1.getAxis(AxisType.Y);
	        yAxis.setMin(0);
	        yAxis.setMax(10);
	     }
	  
	    private LineChartModel initLinearModel() {
	        LineChartModel model = new LineChartModel();
	 
	        LineChartSeries series1 = new LineChartSeries();
	        series1.setLabel("Series 1");
	 
	        series1.set(1, 2);
	        series1.set(2, 1);
	        series1.set(3, 3);
	        series1.set(4, 6);
	        series1.set(5, 8);
	 
	        LineChartSeries series2 = new LineChartSeries();
	        series2.setLabel("Series 2");
	 
	        series2.set(1, 6);
	        series2.set(2, 3);
	        series2.set(3, 2);
	        series2.set(4, 7);
	        series2.set(5, 9);
	 
	        model.addSeries(series1);
	        model.addSeries(series2);
	         
	        return model;
	    }
	   
	    private void createCombinedModel() {
	        combinedModel = new BarChartModel();
	 
	        BarChartSeries boys = new BarChartSeries();
	        boys.setLabel("Années");
	 
	        boys.set("2004", 120);
	        boys.set("2005", 100);
	        boys.set("2006", 44);
	        boys.set("2007", 150);
	        boys.set("2008", 25);
	 
	        LineChartSeries girls = new LineChartSeries();
	        girls.setLabel("Taux Admis");
	 
	        girls.set("2004", 52);
	        girls.set("2005", 60);
	        girls.set("2006", 110);
	        girls.set("2007", 135);
	        girls.set("2008", 120);
	 
	        combinedModel.addSeries(boys);
	        combinedModel.addSeries(girls);
	         
	        combinedModel.setTitle("Bar and Line");
	        combinedModel.setLegendPosition("ne");
	        combinedModel.setMouseoverHighlight(false);
	        combinedModel.setShowDatatip(false);
	        combinedModel.setShowPointLabels(true);
	        Axis yAxis = combinedModel.getAxis(AxisType.Y);
	        yAxis.setMin(0);
	        yAxis.setMax(200);
	    }
	     
	    
	    
	}
	

 
