//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rem_double_2addr;
import dot.junit.opcodes.rem_double_2addr.d.*;
import dot.junit.*;
public class Main_testB2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_rem_double_2addr_1 t = new T_rem_double_2addr_1();
        assertEquals(Double.NaN, t.run(Double.POSITIVE_INFINITY,
                Double.NEGATIVE_INFINITY));
    }
}
