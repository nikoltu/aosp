//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_wide;
import dot.junit.opcodes.iput_wide.d.*;
import dot.junit.*;
public class Main_testVFE16 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iput_wide.d.T_iput_wide_22");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
