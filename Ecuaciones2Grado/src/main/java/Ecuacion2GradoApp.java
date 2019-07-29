import java.util.Scanner;
public class Ecuacion2GradoApp {
  
    static double[] calcular(int a,int b,int c){
    double discriminante=Math.pow(b, 2)-(4*a*c);
        double x1=0;
        double x2=0;
        //Mensaje de traza
        if (discriminante>0){
            //Tambien se puede hacer por parte si lo ves más facil
            //recuerda que debes tener en cuenta la prioridad de elementos
            x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
           // System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            //System.out.println("El discriminante es negativo");
        }
        double i[]  = new double [2];
        i[0]=x1;
        i[1]=x2;
        return i;
    
    }
    
    
    public static void main(String[] args) {
         double x1=0;
        double x2=0;
        int a=2;
        int b=9;
        int c=10;
        double i[];
        i = calcular(a, b,c);
        x1=i[0];
        x2=i[1];
        System.out.println(x1);
        System.out.println(x2);
        
    }
}