//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_wide;
import dot.junit.opcodes.sput_wide.d.*;
import dot.junit.*;
public class Main_testVFE15 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sput_wide.d.T_sput_wide_21");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
