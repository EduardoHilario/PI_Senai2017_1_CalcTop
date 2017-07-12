package projetointegrador.calctop;
/**
 * @author msilva.py3
 */
public class Comprimento {
    //AQUI É FEITO A CONVERSÃO DE "Metros".
    public double MetToKM (double m){
        double res = m*0.001;
    return (res);
    }
    
    public double MetToMi (double m){
        double res = m*0.00062137;
    return (res);
    }
    
    public double MetToPol (double m){
        double res = m*39.370;
    return (res);
    }
    
    //AQUI É FEITO A CONVERSÃO DE "Quilômetros".
    public double KmToMet (double km){
        double res = km/0.0010000;
    return (res);
    }
    
    public double KmToMi (double km){
        double res = km/1.609344;
    return (res);
    }
    
    public double KmToPol (double km){
        double res = km/39370.07874015748;
    return (res);
    }
    
    //AQUI É FEITO A CONVERSÃO DE "Milhas".
    public double MiToMet (double mi){
        double res = mi/0.00062137;
    return (res);
    }
    
    public double MiToKm (double mi){
        double res = mi*1.609344;
    return (res);
    }
    
    public double MiToPol (double mi){
        double res = mi*63360;
    return (res);
    }
    
    //AQUI É FEITO A CONVERSÃO DE "Polegadas".
    public double PolToMet (double pol){
        double res = pol*0.0254;
    return (res);
    }
    
    public double PolToKm (double pol){
        double res = pol/39370;
    return (res);
    }
    
    public double PolToMi (double pol){
        double res = pol/63.360;
    return (res);
    }
    
}