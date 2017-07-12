package projetointegrador.calctop;

public class Geometria {
 public double grauToRad(double g){
     double res = g*(Math.PI/180);
     return (res);
     }
    public double radToGrau(double r){
        double rest = r*(180/Math.PI);
        return (rest);
    }
}

