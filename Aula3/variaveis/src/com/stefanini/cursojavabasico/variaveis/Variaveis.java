package com.stefanini.cursojavabasico.variaveis;

public class Variaveis {

    public static void main(String[] args) {
        // Variáveis primitivas
        byte numByte = -128; // -128 à 127 (8 bits)
        short numShort = 12321; // -32768 à 32767 (16 bits)
        int numInt = 2147483647;// -2.147.483.648 à 2.147.483.647 (32 bits)
        long numLong = 2147483647; // -9.223.372.036.854.770.000 à 9.223.372.036.854.770.000 (64 bits)
        long numLongII = 2147483647123456789L; // Quando ultrapassar o tamanho padrão int.

        float numFloat = 10.000f; // -1,4024E-37 à 3.40282347E+38 (32 bits)
        double numDouble = 1000000000000000.000; // -4,94E-307 à 1.79769313486231570E+308 (64 bits)

        char varChar = 'F'; // 0 à  65535 (16 bits)

        boolean varBoolean = true;

        // Variáveis de Referência
        String texto = "Bem vindo Devs!";
        Integer numeroConta = 4000;
        Long numeroLongo = 1213123L;

        // Deve-se começar com uma letra minúscula, exemplo: nome
        // Não deve começar com caracteres especiais como & (e comercial), $(Dólar), _(sublinhado), exemplo: _nome
        // Se o nome for composta por mais de uma palavra, inicie-se a primeira pavavra com a letra minúscula e em seguida por uma letra maiúscula, exemplo: nomeCompleto
        // Evite utilizar variáveis de um caractere, exemplo: a

        String nomeCompleto = "Eduardo Isidoro Gonçalves";
    }
}
