//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rem_int_lit8;
import dot.junit.opcodes.rem_int_lit8.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.rem_int_lit8.d.T_rem_int_lit8_13");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
