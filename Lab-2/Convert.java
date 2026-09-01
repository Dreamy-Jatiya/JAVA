//*******conversion from int to float,float to double........so on********//

public class Convert
{
    public static void main(String[] args) 
    {
        //int---->float
        int i = 526;
        float f = 256.369f;

        f = (float) i;

        System.out.println("Float value: " + f);

     //float----->int 
     i=(int)f;
      System.out.println("Int value:"+i);

      //float----->long
      float G=2593.365f;
      long L=58964325l;
       L=(long)G;
       System.out.println("Long::"+L);
       //long----->float
       G=(float)L;
       System.out.println("FLoat:"+G);

       //int------->double
       int A=859;
       double b=5896;
       b=(double)A;
       System.out.println("Double:"+b);

       // double-------->int
       A=(int)b;
       System.out.println("int:"+A);

       //float----------->double
       float I=55693.36f;
       double J= 1000;
       J=(double)I;
       System.out.println("Double:"+J);

       //double *------->float
       I=(float)J;
       System.out.println("Float:"+I);

         //int----->long
         int N=589;
         long o=30000l;
         o=(long)N;
         System.out.println("Long:"+o);

      //long------>int
      N=(int)o;
      System.out.println("Int:"+N);

      //int------>character
      int Q=97;
      char R='&';
      R=(char)Q;
      System.out.println("Character:"+R);
     //character --------->int
      Q=(int)R;
      System.out.println("Int:"+Q); 
    }
}
