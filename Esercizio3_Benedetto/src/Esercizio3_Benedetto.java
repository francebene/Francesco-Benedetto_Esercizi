import java.util.Scanner;
public class Esercizio3_Benedetto {

     public static class Rettangolo
    {
        public float h;
        public float b;
        public Rettangolo(float h,float b)
        {
        this.b=b;
        this.h=h;
        }
        public float getBase() { return b; }
        // method 2
        public float getAltezza() { return h; }
        // method 3
        float CalcolaPerimetro()
        {
            float perimetro;
            perimetro=(b+h)*2;
            return perimetro;
        }

        float CalcolaArea()
        {
            float area;
            area=(b*h);
            return area;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float perimetro=0;

        System.out.println("Inserisci la base");
        float base=sc.nextFloat();

        System.out.println("Inserisci l'altezza");
        float altezza=sc.nextFloat();

        Rettangolo R1=new Rettangolo(base,altezza);
System.out.println("Il perimetro del rettangolo è " + R1.CalcolaPerimetro());
System.out.println("L'area del rettangolo è " + R1.CalcolaArea());


    }
    }



