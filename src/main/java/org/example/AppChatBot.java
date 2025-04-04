package org.example;

import java.util.Scanner;

public class AppChatBot {

    public static boolean salir = false;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Chatbot: Bienvenido! Escribe <salir> cuando quieras acabar la conversación...");

        while(!salir) {
            System.out.print("Tú: ");
            String prompt = teclado.nextLine();
            opciones(prompt);
        }



    }

    public static void opciones(String prompt){

        switch(prompt){
            case "hola":
                System.out.println("Chatbot: Hola, ¿En qué puedo ayudarte?");
                break;
            case "¿cómo estás?":
                System.out.println("Chatbot: Estoy listo para ayudarte!");
                break;
            case "adiós":
                System.out.println("Chatbot: ¡Hasta luego!");
                break;
            case "gracias":
                System.out.println("¡De nada! Qué tengas un buen día.");
                break;
            case "salir":
                System.out.println("Adiós!");
                salir = true;
                System.exit(0);
                break;
            default:
                System.out.println("Chatbot: No te entiendo :(");
        }

    }
}
