import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class funciones {
    public static void main(String[] args) throws IOException{
        System.out.println("Dame el primer numero");
        Integer numero1 = cargarNumero();
        System.out.println("Dame el segundo numero");
        Integer numero2 = cargarNumero();
        System.out.println("Dame el tercer numero");
        Integer numero3 = cargarNumero();

        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }

    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero= buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    
    private static void calcularNumeroMayor(Integer numero1,Integer numero2,Integer numero3){
        Integer numeroMayor = numero1;
        if (numero2>numeroMayor){
            numeroMayor = numero2;
        }
        if(numero3>numeroMayor){
            numeroMayor = numero3;
        }
        System.out.println("El numero mayor es : " + numeroMayor);
    }

    private static void calcularNumeroMenor(Integer numero1,Integer numero2,Integer numero3){
        Integer numeroMenor = numero1;
        if (numero2<numeroMenor){
            numeroMenor = numero2;
        }
        if(numero3<numeroMenor){
            numeroMenor = numero3;
        }
        System.out.println("El numero menor es : " + numeroMenor);
    }
}
