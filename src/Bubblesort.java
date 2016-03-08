/**
 * Created by hemanth on 08/03/2016.
 */
public class Bubblesort {
    public static void main(String[ ] args)
    {
        String[ ] names = {"Hemanth", "Deep", "Narshima", "George"}; //list of strings
        Bubble (names); // function call here
        for ( int k = 0;  k < 4;  k++ )   //function to print
            System.out.println( names [ k ] );
    }

    public static void Bubble( String  x [ ] )
    {
        int j;
        boolean flag = true;  // will determine when the sort is finished
        String temp;

        while ( flag )
        {
            flag = false;
            for ( j = 0;  j < x.length - 1;  j++ )
            {
                if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                {                                             // ascending sort
                    temp = x [ j ];
                    x [ j ] = x [ j+1];     // swapping
                    x [ j+1] = temp;
                    flag = true;
                }
            }
        }
    }

}
