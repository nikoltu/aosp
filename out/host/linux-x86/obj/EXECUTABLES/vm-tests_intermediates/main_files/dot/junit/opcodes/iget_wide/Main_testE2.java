//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_wide;
import dot.junit.opcodes.iget_wide.d.*;
import dot.junit.*;
public class Main_testE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_iget_wide_9 t = new T_iget_wide_9();
        try {
            t.run();
            fail("expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}
