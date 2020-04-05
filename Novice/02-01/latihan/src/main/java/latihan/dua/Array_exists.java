package latihan.dua;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public final class Array_exists{
    public static void main(final String[] args) {
        final Array<String> a = array("Hello", "There", "What", "DAY", "iS", "iT");
        final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));

        System.out.println(b);// true("what" is the only that qualifies; try removing it)
    }

	public static void mulai() {
	}
}