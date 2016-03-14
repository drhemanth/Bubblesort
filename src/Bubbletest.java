/**
 * Created by hemanth on 14/03/2016.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Bubbletest {
    String[ ] names = {"Hemanth", "Deep", "Narshima", "George"}; //list of strings
    @Test
    public void factorial0(){
        Bubblesort f= new Bubblesort ();
        int result = f.Bubble(names);
        assertEquals(1,result);
    }
}