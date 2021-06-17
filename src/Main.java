import javax.swing.*;

public class Main {
    public static void main(String[]args)
    {
        int x;

        //Se inicia preguntandole al usuario que tipos de textos prefiere
        JOptionPane.showMessageDialog(null, "¡Hola! En este cuestionario se le recomendará una serie de libros basados en sus gustos.\n Por favor, en cada pregunta solo elija una opción.");

        //En base al array sera la opcion que el usuario elija
        String[]opciones = {"Realistas", "Ficticios"};
        x = JOptionPane.showOptionDialog(null,"¿Que tipos de texto prefiere mas? ","Elija una de las dos opciones",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
        if (x == 0)//Lo que pasa si elige un texto realista
        {
            String[]realistas = {"Uno que trate sobre historia", "Un texto cientifico", "Una novela"};
            x = JOptionPane.showOptionDialog(null,"¿Por qué tipo de texto se siente más atraído?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,realistas,"");
            if (x == 0)//Lo que pasa si elige uno que trate sobre historia
            {
                String[]historia = {"La biografia de una persona","La historia de algun lugar o civilizacion","Que trate sobre alguna guerra"};
                x = JOptionPane.showOptionDialog(null,"¿Que tematica se le hace mas interesante?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,historia,"");
                if (x == 0)//Lo que pasa si elige biografia
                {
                    //RECOMENDACION DE LAS BIOGRAFIAS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Elon Musk, el creador de tesla,paypal y spacex que anticipa el futuro- por Ashlee Vance, \n No hay vuelta atrás- por Melinda Gates, \n Steve Jobs- por Walter Isacsson, \n Gabriel García Márquez: Una vida- por Gerald Martin, \n Frida Kahlo: Una biografía.- por María Hesse");
                }
                else if (x == 1)
                {
                    //RECOMENDACION DE HISTORIA EN GENERAL
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Historia del mundo con los trozos más codiciados- por Fernando Garcés Blázquez \n Historia del mundo sin los trozos aburridos- por Fernando Garcés Blázquez \n La europa de las cinco naciones- por Luis Suárez \n La prehistoria- Cécile Benoist \n Breve historia del mundo- por Ernst H. Gombrich");
                }
                else if (x == 2)
                {
                    //RECOMENDACION DE LIBROS DE GUERRA HISTORICOS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los sguientes libros: \n El diario de Anna Frank- por Anna Frank \n Hiroshima- por Jhon Hersey \n Los hornos de Hitler- por Olga Lengyel \n La independencia de México- por Ernesto de la Torre Villar \n El arte de la guerra- por Sun Tzu ");
                }
            }
            else if (x == 1)//Lo que pasa si elige un texto cientifico
            {
                String[]ciencia = {"Biologia", "Fisica", "Astronomia"};
                x = JOptionPane.showOptionDialog(null,"¿Que tematica se le hace mas interesante?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,ciencia,"");
                if (x == 0)//Lo que pasa si elige biologia
                {
                    //RECOMENDACION LIBRO DE BIOLOGIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n ¡Que le den a la ciencia! - por Rocio Vidal \n ¡Eureka!: 50 descubrimientos científicos que cambiaron al mundo- por Rocio Vidal \n Biología para Dummies - por René Fester Kratz y Donna Rae Siegfried \n Virus y pandemia- por Ignacio López-Goñi \n ¿Cómo funciona el cerebro?- por Francisco Mora");
                }
                else if (x == 1)//Lo que pasa si elige fisica
                {
                    //RECOMENDACION LIBRO DE FISICA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n ¡Que le den a la ciencia! - por Rocio Vidal \n ¡Eureka!: 50 descubrimientos científicos que cambiaron al mundo- por Rocio Vidal \n El fascinante mundo de la física - por Pablo Vaz \n Física de lo imposible - Michio Kaku \n Física para dummies- por Holzner Steven");
                }
                else if (x == 2)//Lo que pasa si elige astronomia
                {
                    //RECOMENDACION LIBRO DE ASTRONOMIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n ¡Que le den a la ciencia! - por Rocio Vidal \n ¡Eureka!: 50 descubrimientos científicos que cambiaron al mundo- por Rocio Vidal \n La clave secreta del universo- por Lucy & Stephen Hawking \n La teoría del todo - Stephen Hawking \n La naturaleza del espacio y el tiempo - Stephen Hawking & Roger Penrose");
                }

            }
            else if(x == 2)//Lo que pasa si elige una novela
            {
                String[]novelas = {"Juveniles","Romanticas"};
                x = JOptionPane.showOptionDialog(null,"¿Que tipo de novela se le hace mas interesante?", "Elija una de las dos opciones",0,JOptionPane.QUESTION_MESSAGE,null,novelas,"");
                if (x == 0)//Lo que pasa si elige novela juvenil
                {
                    //RECOMENDACION NOVELA JUVENIL
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n El inventor de juegos- por Pablo de Santis \n Ciudades de papel- por Jhon Green \n Más extraño que un fanfiction- por Chris Colfer \n Persona Normal- por Benito Taibo \n A los hombres que bese- por Chris Pueyo");
                }
                else if (x == 1)//Lo que pasa si elige novela romantica
                {
                    //RECOMENDACION DE NOVELAS ROMANTICAS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n El amor en los tiempos del cólera — por Gabriel García Márquez \n La Tregua— por Mario Benedetti \n Rayuela — por Julio Cortázar \n Aura — por Carlos Fuentes \n Las intermitencias de la muerte— por José Saramago");
                }
            }
        }//Terminan los textos realistas
        else if (x == 1)//Lo que pasa si elige un texto ficticio
        {
            String[]ficticios = {"Las de terror","Las de ciencia Ficcion","Las historias de fantasia"};
            x = JOptionPane.showOptionDialog(null,"¿Que tipo de historias le gustan mas?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,ficticios,"");
            if (x == 0)//Lo que pasa si elige terror
            {
                //RECOMENDACIONES DE LIBROS DE TERROR
                JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Drácula- por Bram Stoker \n El gato negro- por Edgar Allan Poe \n Relatos escalofriantes- por Roald Dahl \n El club de los lectores criminales- por Carlos García Miranda \n La cabaña- por Natasha Preston");
            }
            else if (x == 1)//Lo que pasa si elige ciencia ficcion
            {
                String[]scfi = {"Algo relacionado a la tecnologia","Viajes espaciales","Mundos post-apocalipticos"};
                x = JOptionPane.showOptionDialog(null,"¿Que tema le agrada mas?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,scfi,"");
                if (x == 0)//Lo que pasa si elige tecnologia
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE TECNOLOGIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n El chico sin nombre- por Ricardo Zárate \n  Insignia - S.J.Kincaid \n Vortex- S.J.Kincaid \n Catalyst- S.J.Kincaid \nLa naranja mecánica- por Anthony Burges");
                }
                else if (x == 1)//Lo que pasa si elige viajes espaciales
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE VIAJES ESPACIALES
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n Star Wars, estrellas perdidas- por Claudia Gray \n La clave secreta del universo- por Lucy & Stephen Hawking \n Guía del autoestopista galáctico- por Douglas Adams \n Cronicas marcianas - por Ray Bradbury \n Las estrellas de mi destino - por Alfred Bester");
                }
                else if (x == 2)//Lo que pasa si elige mundos post.apocalipticos
                {
                    //RECOMENDACION LIBROS CIENCIA FICCION POST-APOCALIPTICOS
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n Maze Runner, Correr o morir- por James Dashner \n Maze Runner, Prueba de fuego- por James Dashner \n Fahrenheit 541- por Ray BradBury \n Guerra mundial Z - por Max Brooks \n La noche en la zona M - por Alberto Chimal");
                }
            }
            else if (x == 2)//Lo que pasa si elige historias de fantasia
            {
                String[]fantasia = {"Un cuento","Una travesia fantastica"};
                x = JOptionPane.showOptionDialog(null,"¿Que se le hace mas interesante?", "Elija una de las dos opciones",0,JOptionPane.QUESTION_MESSAGE,null,fantasia,"");
                if (x == 0)//Lo que pasa si elije un cuento
                {
                    //RECOMENDACIONES DE CUENTOS DE FANTASIA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguientes libros: \n La noche navegable- por Juan Villoro \n Velocidad de los jardines- por Eloy Tizón \n Cuentos- por Ernest Hemingway \n Bestiario - por Julio Cortázar \n Cuentos reunidos- por William Faulker");
                }
                else if (x == 1)//Lo que pasa si elige una travesia fantastica
                {
                    //RECOMENDACIONES DE LIBROS DE TRAVESIA FANTASTICA
                    JOptionPane.showMessageDialog(null, "Le recomiendo los siguentes libros: \n Harry Potter y la piedra filosofal- por J.K.Rowling \n El señor de los anillos- por J.R.R. Tolkien \n Historias de Terramar- por Úrsula K. Le Guin \n La torre oscura- por Stephen King \n Las crónicas de Narnia- por C.S. Lewis");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo por favor");
        }
    }
}
