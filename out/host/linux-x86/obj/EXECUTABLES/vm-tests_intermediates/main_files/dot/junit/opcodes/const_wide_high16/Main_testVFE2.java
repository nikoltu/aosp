//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.const_wide_high16;
import dot.junit.opcodes.const_wide_high16.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.const_wide_high16.d.T_const_wide_high16_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
