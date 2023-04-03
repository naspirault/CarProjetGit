import java.util.Comparator;

public class SortByBrand implements Comparator<Car> {

       // Method
        // Sorting in ascending order of name
        public int compare(Car a, Car b)
        {
            return a.getBrand().compareTo(b.getBrand());
        }
    }

