import java.util.Comparator;

public class SortByModel implements Comparator<Car> {

       // Method
        // Sorting in ascending order of name
        public int compare(Car a, Car b)
        {
            return a.getModel().compareTo(b.getModel());
        }
    }

