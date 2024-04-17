class Main{
         public static void sun() {
                  System.out.print( "Shine" );
         }
         public static void summer( int temp ) {
                  if( temp > 80 ){
                          System.out.print( " * " );
                          temp -= 2; //changed to decrement by 2 each time
                          summer( temp );
                  }
         }
         public static void main( String [] args ) {
                  summer( 91 );
                  sun();
         }   
}
