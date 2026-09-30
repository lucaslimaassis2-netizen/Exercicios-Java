package ExercicioLambdas;

public class Principal {
    public static void main(String[] args) {

        InterfaceFuncional minhaMultiplicacao = (a, b) -> a * b;
        int resultado = minhaMultiplicacao.multiplica(2, 3);
        System.out.println(resultado);

        Iconverte convertendo = (palavra) -> palavra.toUpperCase();
        String resposta = convertendo.convertido("lucas lima assis");
        System.out.println(resposta);

        Ipalindromo palindromo = (palavra) -> {
            palavra = palavra.replace(" ", "");
            StringBuilder sb = new StringBuilder(palavra);
            sb.reverse();
            String textoReverse = sb.toString();
            if (textoReverse.equals(palavra)){
                return true;
            } return false;
        };
        String respostaPalindromo = String.valueOf(palindromo.verificaPalindromo("subi no onibus"));
        System.out.println(respostaPalindromo);
    }
}

