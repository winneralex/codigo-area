import java.util.Scanner;

public class CodigoArea {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int DDD = input.nextInt();
    switch (DDD) {
      
        case 61: System.out.printf("Brasilia"); break;
        case 71: System.out.printf("Salvador"); break;
        case 11: System.out.printf("Sao Paulo"); break;
        case 21: System.out.printf("Rio de Janeiro"); break;
        case 32: System.out.printf("Juiz de Fora"); break;
        case 19: System.out.printf("Campinas"); break;
        case 27: System.out.printf("Vitoria"); break;
        case 31: System.out.printf("Belo Horizonte"); break;
        
        default: System.out.printf("DDD nao cadastrado"); break;
        }
                        input.close();
     }
  }




