package projetointegrador.calctop;

import java.text.DecimalFormat;

public class Temperatura {
    DecimalFormat f = new DecimalFormat("0.0000");
    //AQUI FICA AS CONVESÕES DE °F
    public double FahToCel (double f){
        double res = (f-32)/1.8;
    return (res);
    }
    
    public double FahToKel (double f){
        double res = (f+459.67)*(0.5555555555555556);
    return (res);
    }
    
    //AQUI FICA AS CONVESÕES DE °K
    public double KelToCel (double k){
            double res = k-273.15;
    return (res);
    }
    
    public double KelToFah (double k){
        double res = (k*1.8)-459.67;
    return (res);
    }
    
    //AQUI FICA AS CONVESÕES DE °C
    public double CelToFah (double c){
        double res = (c*1.8)+32;
    return (res);
    }
    
    public double CelToKel(double c){
        double res = c+273.15;
    return (res);
    }
}