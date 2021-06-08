import javax.swing.JOptionPane;

public class Encuesta {
    public static void main(String[]args)
    {
        char opcion;

        //Se inicia preguntandole al usuario que tipo de textos prefiere
        JOptionPane.showMessageDialog(null, "Hola!, en este cuestionario se le recomendara una serie de libro basado en sus gustos. Por favor, en cada pregunta solo elija una opcion.");
        opcion = JOptionPane.showInputDialog("Generalmente, ¿que tipo de textos disfruta mas? Escriba R para indicar que realistas o escriba F para indicar que ficticios.").charAt(0);
        if (opcion == 'R' || opcion == 'r')//Lo que pasa si elige un texto realista
        {
            opcion = JOptionPane.showInputDialog("¿Por que tipo de texto se siente mas atraido? Algo que trate acerca de historia(escriba H), Una novela sencilla(escriba N) o un texto cientifico(Escriba C)").charAt(0);
            if (opcion == 'H' ||  opcion == 'h')//Lo que  pasa si elige historico
            {
                opcion = JOptionPane.showInputDialog("¿Prefiere la biografia de una persona(Escriba P) o la historia de algun lugar en general (Escriba G) o alguna guerra famosa (Escriba W)").charAt(0);
                if (opcion == 'P' || opcion == 'p')//Lo que pasa si elige biografia
                {
                    //RECOMENDACION DE LAS BIOGRAFIAS
                }
                else if (opcion == 'G' || opcion == 'g')//Lo que pasa se elige historia en general
                {
                    //RECOMENDACION DE HISTORIA EN GENERAL
                }
                else if (opcion  == 'W' || opcion == 'w')//Lo que pasa si elige guerra
                {
                    //RECOMENDACION DE LIBROS DE GUERRA HISTORICOS
                }
            }//Terminan los libros hsitoricos
            else if (opcion == 'N' || opcion == 'n')//Lo que pasa si elige novela sencilla
            {
                opcion = JOptionPane.showInputDialog("Prefiere las novelas juveniles (Escriba J) o prefiere las novelas romanticas(Escriba R)").charAt(0);
                if (opcion == 'J' || opcion == 'j')//Lo que pasa si elige una novela juvenil
                {
                    //RECOMENDACION NOVELA JUVENIL
                }
                else if (opcion == 'R' || opcion == 'r')//Lo que pasa si elige novelas romanticas
                {
                    //RECOMENDACION DE NOVELAS ROMANTICAS
                }
            }//Terminan las novelas
            else if (opcion == 'C' || opcion == 'c' )//Lo que pasa si elige textos cientificos
            {
                opcion = JOptionPane.showInputDialog("A la hora de leer un texto cientifico, lo prefiere relacionado a la biologia(Escriba B), relacionado a la física (Escriba F) o relacionado a la Astronomia(Escriba A)").charAt(0);
                if (opcion == 'B' || opcion == 'b')//Lo que pasa si eligio Biologia
                {
                    //RECOMENDACION LIBRO DE BIOLOGIA
                }
                else if(opcion == 'F' || opcion == 'f')//Lo que pasa si elige fisica
                {
                    //RECOMENDACION LIBRO DE FISICA
                }
                else if (opcion == 'A' || opcion == 'a')
                {
                    //RECOMENDACION LIBRO DE ASTRONOMIA
                }
            }//Terminan los textos cientificos
        }//Terminan los textos realistas
        else if (opcion == 'F' || opcion == 'f')//Lo que pasa si elige un texto ficticio
        {
            opcion = JOptionPane.showInputDialog("¿Usted prefiere las historias de terror(Escriba T), la ciencia ficcion(Escriba C) o las historias de fantasia(Escriba F)").charAt(0);
            if (opcion == 'F' || opcion == 'f')//Lo que pasa si elige fantasia
            {
                opcion = JOptionPane.showInputDialog("¿Prefiere las travesias de fantasia(Escriba T) o los cuentos de fantasia(Escriba C)?").charAt(0);
                if (opcion == 'T' || opcion == 't')//Lo que pasa si elige travesias de fantasia
                {
                    //RECOMENDACIONES DE LIBROS DE TRAVESIA FANTASTICA
                }
                else if (opcion == 'C' || opcion == 'c')//Lo  que pasa si elige cuentos
                {
                    //RECOMENDACIONES DE CUENTOS DE FANTASIA
                }
            }//Termina fantasia
            else if (opcion == 'T' || opcion == 't')//Lo que pasa si elige terror
            {
                //RECOMENDACIONES DE LIBROS DE TERROR
            }//Termina terror
            else if (opcion == 'C' || opcion == 'c')//Lo que pasa si elige ciencia ficcion
            {
                opcion = JOptionPane.showInputDialog("¿Le gusta lo relacionado a la tecnologia (Escriba T), o si le gusta lo relacionado con viajes espaciales (Escriba E) o si le gustan los mundos post-apocalipticos (Escriba P)").charAt(0);
                if (opcion == 'T' || opcion == 't')//Lo que pasa si eligio tecnologia
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE TECNOLOGIA
                }
                else if (opcion == 'E' || opcion == 'e')//Lo que pasa si elige viajes espaciales
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE VIAJES ESPACIALES
                }
                else if(opcion == 'P' || opcion == 'p')//Lo que pasa si elige mundos post-apocalipticos
                {
                    //RECOMENDACION LIBROS CIENCIA FICCION POST-APOCALIPTICOS
                }
            }//Termina ciencia ficcion
        }
        else//Lo que pasa si no introduce el valor requerido
        {
            JOptionPane.showMessageDialog(null,"Vuela a intentarlo introduciendo un valor valido");
        }

    }
    
}
