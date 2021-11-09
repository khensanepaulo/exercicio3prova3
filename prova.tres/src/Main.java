import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int m=10;
        int M=0;
        int p, s , t, q;
        String ps, ss, ts, qs;

        List<String> numeros = new ArrayList();
        numeros.add("2");
        numeros.add("3");
        numeros.add("5");
        numeros.add("4");

        System.out.println(numeros);

        ps = numeros.get(0);
        ss = numeros.get(1);
        ts = numeros.get(2);
        qs = numeros.get(3);


         p = Integer.parseInt(ps);
         s = Integer.parseInt(ss);
         t = Integer.parseInt(ts);
         q = Integer.parseInt(qs);

        int a = (p + s + t + q) / 4;
        System.out.printf("a media e %d%n", a);

      for (int i=0;i < numeros.size();i++)
      {
          if(Integer.parseInt(numeros.get(i)) > M)
           M = Integer.parseInt(numeros.get(i));

      }

        for (int i=0;i < numeros.size();i++)
        {
            if(Integer.parseInt(numeros.get(i)) < m)
                m = Integer.parseInt(numeros.get(i));

        }
        System.out.printf("o maior e %d%n", M);
        System.out.printf("o menor e %d%n", m);
    }
}
