//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput_wide;
import dot.junit.opcodes.aput_wide.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aput_wide.d.T_aput_wide_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
