//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput_wide;
import dot.junit.opcodes.aput_wide.d.*;
import dot.junit.*;
public class Main_testE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aput_wide_1 t = new T_aput_wide_1();
        long[] arr = new long[2];
        try {
            t.run(arr, -1, 100000000000l);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}
