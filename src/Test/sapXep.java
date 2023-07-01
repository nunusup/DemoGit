package Test;

import java.util.Comparator;

abstract class sapXep implements Comparator {
    public static final Comparator<test1> ten =
            (test1 o1, test1 o2) -> o1.getName().compareToIgnoreCase(o2.getName());
}
