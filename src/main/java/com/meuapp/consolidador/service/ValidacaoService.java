package com.meuapp.consolidador.service;

import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class ValidacaoService {

    public boolean validaCPF(String cpf){

        // remove  pontos e traços
        cpf = cpf.replaceAll("[^0-9]", "");

        // valida quantidade de digitos
        if(cpf.length() != 11) return false;

        // valida cpf sequenciais inválidos como 111.111.111-11 ...
        if(cpf.chars().distinct().count() == 1) return false;

        int digito10 = calculaDigito(cpf, 10);
        int digito11 = calculaDigito(cpf, 11);

        return digito10 == Character.getNumericValue(cpf.charAt(9)) &&
                digito11 == Character.getNumericValue(cpf.charAt(10));

    }

    public static int calculaDigito(String cpf, int pesoInicial){

        int soma = 0;

        /*
        Cada um dos nove primeiros números do CPF é multiplicado por um peso que começa de 10 e
         que vai sendo diminuido de 1 a cada passo, somando-se as parcelas calculadas
        */
        for (int i = 0; i < pesoInicial; i++) {
            int num = Character.getNumericValue(cpf.charAt(i));
            soma += num * (pesoInicial - i);
        }
        /*
        Calcula-se o dígito através da seguinte expressão:
         11 - (sm % 11) = 11 - (249 % 11) = 11 - 7 = 4
         */
        int resto = 11 - (soma % 11);
        return (resto >= 10) ? 0 : resto;

    }

    public static String imprimeCPF(String cpf) {
        return cpf.substring(0, 3) + "." +
                cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" +
                cpf.substring(9, 11);
    }

}
