import java.util.Scanner;

public class Main {
    public static void main( String[ ] args ) throws ClassNotFoundException {
        Scanner sc = new Scanner( System.in );

        while( true )
        {
            pintarMenu( );
            int opcionSeleccionada = sc.nextInt( );

            switch( opcionSeleccionada )
            {
                case 1: { //SQLite
                    ConnSQLite conn = new ConnSQLite( );
                    break;
                }
                case 2: { //Apache Derby
                    ConnApacheDerby conn = new ConnApacheDerby( );
                    break;
                }
                case 3: { //HSQLDB
                    ConnHSQLDB conn = new ConnHSQLDB( );
                    break;
                }
                case 4: { //H2
                    ConnH2 conn = new ConnH2( );
                    break;
                }
                case 5: { //Access
                    ConnAccess conn = new ConnAccess( );
                    break;
                }
                case 6: { //Oracle
                    ConnOracle conn = new ConnOracle( );
                    break;
                }
                case 0: {
                    return;
                }
            }

        }
    }

    private static void pintarMenu( )
    {
        System.out.println( "-> Menu de conexiones <-" );
        System.out.println( "1. SQlLite" );
        System.out.println( "2. Apache derby" );
        System.out.println( "3. HSQLDB" );
        System.out.println( "4. H2" );
        System.out.println( "5. Access" );
        System.out.println( "6. Oracle" );
        System.out.println( "0. Salir" );
        System.out.println( "> Selecciona la opción deseada: " );
    }
}
