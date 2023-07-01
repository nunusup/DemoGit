package BTL;

import java.util.Comparator;

abstract class sapXep implements Comparator{
    public static final Comparator<thuNgan> TEN =
            (thuNgan o1, thuNgan o2) -> o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
    public static final Comparator<thuNgan> TIEN =
            (thuNgan o1, thuNgan o2) -> Double.compare(o1.getSoTienthu(), o2.getSoTienthu());
}
