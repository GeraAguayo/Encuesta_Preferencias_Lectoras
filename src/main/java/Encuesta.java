import javax.swing.JOptionPane;

public class Encuesta {
    public static void main(String[]args)
    {
        char opcion;
        //pis

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
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Elon Musk, el creador de tesla,paypal y spacex que anticipa el futuro- por Ashlee Vance, \n No hay vuelta atrás- por Melinda Gates, \n Steve Jobs- por Walter Isacsson, \n Gabriel García Márquez: Una vida- por Gerald Martin, \n Frida Kahlo: Una biografía.- por María Hesse");
                }
                else if (opcion == 'G' || opcion == 'g')//Lo que pasa se elige historia en general
                {
                    //RECOMENDACION DE HISTORIA EN GENERAL
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Historia del mundo con los trozos más codiciados- por Fernando Garcés Blázquez \n Historia del mundo sin los trozos aburridos- por Fernando Garcés Blázquez \n La europa de las cinco naciones- por Luis Suárez \n La prehistoria- Cécile Benoist \n Breve historia del mundo- por Ernst H. Gombrich");
                }
                else if (opcion  == 'W' || opcion == 'w')//Lo que pasa si elige guerra
                {
                    //RECOMENDACION DE LIBROS DE GUERRA HISTORICOS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los sguientes libros: \n El diario de Anna Frank- por Anna Frank \n Hiroshima- por Jhon Hersey \n Los hornos de Hitler- por Olga Lengyel \n La independencia de México- por Ernesto de la Torre Villar \n El arte de la guerra- por Sun Tzu ");
                }
            }//Terminan los libros hsitoricos
            else if (opcion == 'N' || opcion == 'n')//Lo que pasa si elige novela sencilla
            {
                opcion = JOptionPane.showInputDialog("Prefiere las novelas juveniles (Escriba J)\n o prefiere las novelas románticas(Escriba R)").charAt(0);
                if (opcion == 'J' || opcion == 'j')//Lo que pasa si elige una novela juvenil
                {
                    //RECOMENDACION NOVELA JUVENIL
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n El inventor de juegos- por Pablo de Santis \n Ciudades de papel- por Jhon Green \n Más extraño que un fanfiction- por Chris Colfer \n Persona Normal- por Benito Taibo \n A los hombres que bese- por Chris Pueyo");
                }
                else if (opcion == 'R' || opcion == 'r')//Lo que pasa si elige novelas romanticas
                {
                    //RECOMENDACION DE NOVELAS ROMANTICAS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n El amor en los tiempos del cólera — por Gabriel García Márquez \n La Tregua— por Mario Benedetti \n Rayuela — por Julio Cortázar \n Aura — por Carlos Fuentes \n Las intermitencias de la muerte— por José Saramago");
                }
            }//Terminan las novelas
            else if (opcion == 'C' || opcion == 'c' )//Lo que pasa si elige textos cientificos
            {
                opcion = JOptionPane.showInputDialog("A la hora de leer un texto científico, lo prefiere relacionado a la biología(Escriba B),\n relacionado a la Física (Escriba F) o relacionado a la Astronomía(Escriba A)").charAt(0);
                if (opcion == 'B' || opcion == 'b')//Lo que pasa si eligio Biologia
                {
                    //RECOMENDACION LIBRO DE BIOLOGIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n ¡Que le den a la ciencia! - por Rocio Vidal \n ¡Eureka!: 50 descubrimientos científicos que cambiaron al mundo- por Rocio Vidal \n Biología para Dummies - por René Fester Kratz y Donna Rae Siegfried \n Virus y pandemia- por Ignacio López-Goñi \n ¿Cómo funciona el cerebro?- por Francisco Mora");
                }
                else if(opcion == 'F' || opcion == 'f')//Lo que pasa si elige fisica
                {
                    //RECOMENDACION LIBRO DE FISICA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n ¡Que le den a la ciencia! - por Rocio Vidal \n ¡Eureka!: 50 descubrimientos científicos que cambiaron al mundo- por Rocio Vidal \n El fascinante mundo de la física - por Pablo Vaz \n Física de lo imposible - Michio Kaku \n Física para dummies- por Holzner Steven");
                }
                else if (opcion == 'A' || opcion == 'a')
                {
                    //RECOMENDACION LIBRO DE ASTRONOMIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n ¡Que le den a la ciencia! - por Rocio Vidal \n ¡Eureka!: 50 descubrimientos científicos que cambiaron al mundo- por Rocio Vidal \n La clave secreta del universo- por Lucy & Stephen Hawking \n La teoría del todo - Stephen Hawking \n La naturaleza del espacio y el tiempo - Stephen Hawking & Roger Penrose");
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
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n Harry Potter y la piedra filosofal- por J.K.Rowling \n El señor de los anillos- por J.R.R. Tolkien \n Historias de Terramar- por Úrsula K. Le Guin \n La torre oscura- por Stephen King \n Las crónicas de Narnia- por C.S. Lewis");
                }
                else if (opcion == 'C' || opcion == 'c')//Lo  que pasa si elige cuentos
                {
                    //RECOMENDACIONES DE CUENTOS DE FANTASIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n La noche navegable- por Juan Villoro \n Velocidad de los jardines- por Eloy Tizón \n Cuentos- por Ernest Hemingway \n Bestiario - por Julio Cortázar \n Cuentos reunidos- por William Faulker");
                }
            }//Termina fantasia
            else if (opcion == 'T' || opcion == 't')//Lo que pasa si elige terror
            {
                //RECOMENDACIONES DE LIBROS DE TERROR
                JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Drácula- por Bram Stoker \n El gato negro- por Edgar Allan Poe \n Relatos escalofriantes- por Roald Dahl \n El club de los lectores criminales- por Carlos García Miranda \n La cabaña- por Natasha Preston");
            }//Termina terror
            else if (opcion == 'C' || opcion == 'c')//Lo que pasa si elige ciencia ficcion
            {
                opcion = JOptionPane.showInputDialog("¿Le gusta lo relacionado a la tecnología (Escriba T), o si le gusta lo relacionado con viajes espaciales (Escriba E)\n o si le gustan los mundos post-apocalípticos (Escriba P)").charAt(0);
                if (opcion == 'T' || opcion == 't')//Lo que pasa si eligio tecnologia
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE TECNOLOGIA
                    JOptionPane.showInputDialog(null, "Le recomiendo los siguientes libros: \n El chico sin nombre- por Ricardo Zárate \n  Insignia - S.J.Kincaid \n Vortex- S.J.Kincaid \n Catalyst- S.J.Kincaid \n    La naranja mecánica- por Anthony Burges");
                }
                else if (opcion == 'E' || opcion == 'e')//Lo que pasa si elige viajes espaciales
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE VIAJES ESPACIALES
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n Star Wars, estrellas perdidas- por Claudia Gray \n La clave secreta del universo- por Lucy & Stephen Hawking \n Guía del autoestopista galáctico- por Douglas Adams \n Cronicas marcianas - por Ray Bradbury \n Las estrellas de mi destino - por Alfred Bester");
                }
                else if(opcion == 'P' || opcion == 'p')//Lo que pasa si elige mundos post-apocalipticos
                {
                    //RECOMENDACION LIBROS CIENCIA FICCION POST-APOCALIPTICOS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Maze Runner, Correr o morir- por James Dashner \n Maze Runner, Prueba de fuego- por James Dashner \n Fahrenheit 541- por Ray BradBury \n Guerra mundial Z - por Max Brooks \n La noche en la zona M - por Alberto Chima");
                }
            }//Termina ciencia ficcion
        }
        else//Lo que pasa si no introduce el valor requerido
        {
            JOptionPane.showMessageDialog(null,"Vuelva a intentarlo introduciendo un valor válido");
        }
    }
    
}
