import javax.swing.JOptionPane;

public class Encuesta {
    public static void main(String[]args)
    {
        char opcion;

        //Se inicia preguntandole al usuario que tipo de textos prefiere
        JOptionPane.showMessageDialog(null, "¡Hola! En este cuestionario se le recomendará una serie de libros basados en sus gustos.\n Por favor, en cada pregunta solo elija una opción.");
        opcion = JOptionPane.showInputDialog("Generalmente, ¿Qué tipo de textos disfruta más? \nEscriba R para indicar que realistas o escriba F para indicar que ficticios.").charAt(0);
        if (opcion == 'R' || opcion == 'r')//Lo que pasa si elige un texto realista
        {
            opcion = JOptionPane.showInputDialog("¿Por qué tipo de texto se siente más atraído? Algo que trate acerca de historia(escriba H), \nUna novela(escriba N) o un texto científico(Escriba C)").charAt(0);
            if (opcion == 'H' ||  opcion == 'h')//Lo que  pasa si elige historico
            {
                opcion = JOptionPane.showInputDialog("¿Prefiere la biografía de una persona(Escriba P) o la historia de algún lugar en general (Escriba G)\n o alguna guerra famosa (Escriba W)").charAt(0);
                if (opcion == 'P' || opcion == 'p')//Lo que pasa si elige biografia
                {
                    //RECOMENDACION DE LAS BIOGRAFIAS
                    System.out.println("Biografia");
                }
                else if (opcion == 'G' || opcion == 'g')//Lo que pasa se elige historia en general
                {
                    //RECOMENDACION DE HISTORIA EN GENERAL
                    System.out.println("Historia en general");
                }
                else if (opcion  == 'W' || opcion == 'w')//Lo que pasa si elige guerra
                {
                    //RECOMENDACION DE LIBROS DE GUERRA HISTORICOS
                    System.out.println("Guerra");
                }
            }//Terminan los libros hsitoricos
            else if (opcion == 'N' || opcion == 'n')//Lo que pasa si elige novela sencilla
            {
                opcion = JOptionPane.showInputDialog("Prefiere las novelas juveniles (Escriba J)\n o prefiere las novelas románticas(Escriba R)").charAt(0);
                if (opcion == 'J' || opcion == 'j')//Lo que pasa si elige una novela juvenil
                {
                    //RECOMENDACION NOVELA JUVENIL
                    System.out.println("Novela juvenil");
                }
                else if (opcion == 'R' || opcion == 'r')//Lo que pasa si elige novelas romanticas
                {
                    //RECOMENDACION DE NOVELAS ROMANTICAS
                    System.out.println("Novelas romanticas");
                }
            }//Terminan las novelas
            else if (opcion == 'C' || opcion == 'c' )//Lo que pasa si elige textos cientificos
            {
                opcion = JOptionPane.showInputDialog("A la hora de leer un texto científico, lo prefiere relacionado a la biología(Escriba B),\n relacionado a la Física (Escriba F) o relacionado a la Astronomía(Escriba A)").charAt(0);
                if (opcion == 'B' || opcion == 'b')//Lo que pasa si eligio Biologia
                {
                    //RECOMENDACION LIBRO DE BIOLOGIA
                    System.out.println("Libro de biologia");
                }
                else if(opcion == 'F' || opcion == 'f')//Lo que pasa si elige fisica
                {
                    //RECOMENDACION LIBRO DE FISICA
                    System.out.println("Libro de fisica");
                }
                else if (opcion == 'A' || opcion == 'a')
                {
                    //RECOMENDACION LIBRO DE ASTRONOMIA
                    System.out.println("Libro de Astronomia");
                }
            }//Terminan los textos cientificos
        }//Terminan los textos realistas
        else if (opcion == 'F' || opcion == 'f')//Lo que pasa si elige un texto ficticio
        {
            opcion = JOptionPane.showInputDialog("¿Usted prefiere las historias de terror(Escriba T), de ciencia ficción(Escriba C)\n o las historias de fantasía(Escriba F)").charAt(0);
            if (opcion == 'F' || opcion == 'f')//Lo que pasa si elige fantasia
            {
                opcion = JOptionPane.showInputDialog("¿Prefiere las travesías de fantasía(Escriba T) o los cuentos de fantasía(Escriba C)?").charAt(0);
                if (opcion == 'T' || opcion == 't')//Lo que pasa si elige travesias de fantasia
                {
                    //RECOMENDACIONES DE LIBROS DE TRAVESIA FANTASTICA
                    System.out.println("Libros de travesia fantastica");
                }
                else if (opcion == 'C' || opcion == 'c')//Lo  que pasa si elige cuentos
                {
                    //RECOMENDACIONES DE CUENTOS DE FANTASIA
                    System.out.println("Cuentos de fantasia");
                }
            }//Termina fantasia
            else if (opcion == 'T' || opcion == 't')//Lo que pasa si elige terror
            {
                //RECOMENDACIONES DE LIBROS DE TERROR
                System.out.println("Libro de terror");
            }//Termina terror
            else if (opcion == 'C' || opcion == 'c')//Lo que pasa si elige ciencia ficcion
            {
                opcion = JOptionPane.showInputDialog("¿Le gusta lo relacionado a la tecnología (Escriba T), o si le gusta lo relacionado con viajes espaciales (Escriba E)\n o si le gustan los mundos post-apocalípticos (Escriba P)").charAt(0);
                if (opcion == 'T' || opcion == 't')//Lo que pasa si eligio tecnologia
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE TECNOLOGIA
                    System.out.println("Libro ciencia ficcion tecnologia");
                }
                else if (opcion == 'E' || opcion == 'e')//Lo que pasa si elige viajes espaciales
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE VIAJES ESPACIALES
                    System.out.println("Libro ciencia ficcion viajes espaciales");
                }
                else if(opcion == 'P' || opcion == 'p')//Lo que pasa si elige mundos post-apocalipticos
                {
                    //RECOMENDACION LIBROS CIENCIA FICCION POST-APOCALIPTICOS
                    System.out.println("Libro ciencia ficcion post.apocaliptico");
                }
            }//Termina ciencia ficcion
        }
        else//Lo que pasa si no introduce el valor requerido
        {
            JOptionPane.showMessageDialog(null,"Vuelva a intentarlo introduciendo un valor válido");
        }
    }
    
}