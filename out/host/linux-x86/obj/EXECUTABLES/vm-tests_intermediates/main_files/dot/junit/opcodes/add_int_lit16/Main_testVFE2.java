//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.add_int_lit16;
import dot.junit.opcodes.add_int_lit16.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.add_int_lit16.d.T_add_int_lit16_14");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
