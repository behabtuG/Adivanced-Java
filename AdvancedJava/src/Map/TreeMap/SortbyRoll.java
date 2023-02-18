package Map.TreeMap;

import java.util.Comparator;

// Class 2 Helper class - Comparator implementation
public class SortbyRoll implements Comparator<Student> {

    // Used for sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.roll_no - b.roll_no;
    }
}
