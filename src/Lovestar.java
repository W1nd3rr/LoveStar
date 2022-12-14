
public class Lovestar {

    public static void main(String[] args) {
        for ( int baris =1; baris <= 10; baris++) 
        {
            for (int kolom =1; kolom <= 11; kolom++) {
                if (baris == 1 && kolom >=3 && kolom <= 4 ||  baris == 1 && kolom >= 8 && kolom <= 9 )
                {
                    System.out.print("*");
                } else if (baris == 2 && kolom == 2 || baris == 2 && kolom == 5 || baris == 2 && kolom == 7 || baris == 2 && kolom == 10)
                {
                    System.out.print("*");
                } else if (kolom == 1 && baris >= 3 && baris <= 5 || baris == 3 && kolom == 6 || kolom == 11 && baris >= 3 && baris <=5)
                {
                    System.out.print("*");
                } else if (baris == 6 && kolom == 2 || baris == 6 && kolom == 10)
                {
                    System.out.print("*");
                } else if (baris == 7 && kolom == 3 || baris == 7 && kolom == 9)
                {
                    System.out.print("*");
                } else if (baris == 8 && kolom == 4 || baris == 8 && kolom == 8)
                {
                    System.out.print("*");
                } else if (baris == 9 && kolom == 5 || baris == 9 && kolom == 7)
                {
                    System.out.print("*");
                } else if (baris == 10 && kolom ==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
    
}
