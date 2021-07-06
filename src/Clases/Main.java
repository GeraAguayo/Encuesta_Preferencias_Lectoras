package Clases;
import javax.swing.JOptionPane;

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
            String[]realistas = {"Uno que trate sobre historia", "Un texto científico", "Una novela"};
            x = JOptionPane.showOptionDialog(null,"¿Por qué tipo de texto se siente más atraído?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,realistas,"");
            if (x == 0)//Lo que pasa si elige uno que trate sobre historia
            {
                String[]historia = {"La biografía de una persona","La historia de algún lugar o civilización","Que trate sobre alguna guerra"};
                x = JOptionPane.showOptionDialog(null,"¿Que temática se le hace mas interesante?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,historia,"");
                if (x == 0)//Lo que pasa si elige biografia
                {
                    //RECOMENDACION DE LAS BIOGRAFIAS
                    Recomendaciones biografia = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,biografia.getRecomendacionBiografia());
                }
                else if (x == 1)
                {
                    //RECOMENDACION DE HISTORIA EN GENERAL
                    Recomendaciones historiaEnGeneral = new Recomendaciones();
                    JOptionPane.showMessageDialog(null, historiaEnGeneral.getRecomendacionHistoria());
                }
                else if (x == 2)
                {
                    //RECOMENDACION DE LIBROS DE GUERRA HISTORICOS
                    Recomendaciones guerra = new Recomendaciones();
                    JOptionPane.showMessageDialog(null, guerra.getRecomendacionGuerra());

                }
            }
            else if (x == 1)//Lo que pasa si elige un texto cientifico
            {
                String[]ciencia = {"Biología", "Física", "Astronomía"};
                x = JOptionPane.showOptionDialog(null,"¿Que tematica se le hace mas interesante?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,ciencia,"");
                if (x == 0)//Lo que pasa si elige biologia
                {
                    //RECOMENDACION LIBRO DE BIOLOGIA
                    Recomendaciones biologia = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,biologia.getRecomendacionBiologia() );
                }
                else if (x == 1)//Lo que pasa si elige fisica
                {
                    //RECOMENDACION LIBRO DE FISICA
                    Recomendaciones fisica = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,fisica.getRecomendacionFisica() );
                }
                else if (x == 2)//Lo que pasa si elige astronomia
                {
                    //RECOMENDACION LIBRO DE ASTRONOMIA
                    Recomendaciones astronomia = new Recomendaciones();
                    JOptionPane.showMessageDialog(null, astronomia.getRecomendacionAstronomia());
                }

            }
            else if(x == 2)//Lo que pasa si elige una novela
            {
                String[]novelas = {"Juveniles","Románticas"};
                x = JOptionPane.showOptionDialog(null,"¿Que tipo de novela se le hace mas interesante?", "Elija una de las dos opciones",0,JOptionPane.QUESTION_MESSAGE,null,novelas,"");
                if (x == 0)//Lo que pasa si elige novela juvenil
                {
                    //RECOMENDACION NOVELA JUVENIL
                    Recomendaciones juvenil = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,juvenil.getRecomendacionNovelaJuvenil());
                }
                else if (x == 1)//Lo que pasa si elige novela romantica
                {
                    //RECOMENDACION DE NOVELAS ROMANTICAS
                    Recomendaciones romanticas = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,romanticas.getRecomendacionRomantica());
                }
            }
        }//Terminan los textos realistas
        else if (x == 1)//Lo que pasa si elige un texto ficticio
        {
            String[]ficticios = {"Las de terror","Las de ciencia Ficción","Las historias de fantasía"};
            x = JOptionPane.showOptionDialog(null,"¿Que tipo de historias le gustan mas?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,ficticios,"");
            if (x == 0)//Lo que pasa si elige terror
            {
                //RECOMENDACIONES DE LIBROS DE TERROR
                Recomendaciones terror = new Recomendaciones();
                JOptionPane.showMessageDialog(null,terror.getRecomendacionTerror());
            }
            else if (x == 1)//Lo que pasa si elige ciencia ficcion
            {
                String[]scfi = {"Algo relacionado a la tecnología","Viajes espaciales","Mundos post-apocalípticos"};
                x = JOptionPane.showOptionDialog(null,"¿Que tema le agrada mas?", "Elija una de las tres opciones",0,JOptionPane.QUESTION_MESSAGE,null,scfi,"");
                if (x == 0)//Lo que pasa si elige tecnologia
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE TECNOLOGIA
                    Recomendaciones tecnologia = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,tecnologia.getRecomendacionTecnologia());
                }
                else if (x == 1)//Lo que pasa si elige viajes espaciales
                {
                    //RECOMENDACIONES DE LIBROS DE CIENCIA FICCION DE VIAJES ESPACIALES
                    Recomendaciones viajes = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,viajes.getRecomendacionViajesEspaciales());
                }
                else if (x == 2)//Lo que pasa si elige mundos post.apocalipticos
                {
                    //RECOMENDACION LIBROS CIENCIA FICCION POST-APOCALIPTICOS
                    Recomendaciones  postApocalipticos = new Recomendaciones();
                    JOptionPane.showMessageDialog(null, postApocalipticos.getRecomendacionPostApocaliptico());
                }
            }
            else if (x == 2)//Lo que pasa si elige historias de fantasia
            {
                String[]fantasia = {"Un cuento","Una travesía fantástica"};
                x = JOptionPane.showOptionDialog(null,"¿Que se le hace mas interesante?", "Elija una de las dos opciones",0,JOptionPane.QUESTION_MESSAGE,null,fantasia,"");
                if (x == 0)//Lo que pasa si elije un cuento
                {
                    //RECOMENDACIONES DE CUENTOS DE FANTASIA
                    Recomendaciones cuento = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,cuento.getRecomendacionCuento());
                }
                else if (x == 1)//Lo que pasa si elige una travesia fantastica
                {
                    //RECOMENDACIONES DE LIBROS DE TRAVESIA FANTASTICA
                    Recomendaciones travesia = new Recomendaciones();
                    JOptionPane.showMessageDialog(null,travesia.getRecomendacionTravesia());
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo por favor");
        }
    }
}
