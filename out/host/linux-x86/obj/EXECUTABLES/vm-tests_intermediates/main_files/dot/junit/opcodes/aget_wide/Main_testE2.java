//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_wide;
import dot.junit.opcodes.aget_wide.d.*;
import dot.junit.*;
public class Main_testE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_wide_1 t = new T_aget_wide_1();
        try {
            t.run(null, 2);
            fail("expected NullPointerException");
        } catch (NullPointerException np) {
            // expected
        }
    }
}