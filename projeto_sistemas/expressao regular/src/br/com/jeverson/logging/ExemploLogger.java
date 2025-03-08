package br.com.jeverson.logging;

import java.util.logging.Logger;

public class ExemploLogger {
    private static final Logger logger = Logger.getLogger(ExemploLogger.class.getName());


    public static void main(String[]args){
        logger.info("Iniciando programa..");
        try {
        int resultado = 10/0; //forcando erro para usar de exemplo

        }catch(Exception e){
            logger.severe("Erro: Divisao impedida");
        }
        logger.info("Fim do programa");
    }
}
