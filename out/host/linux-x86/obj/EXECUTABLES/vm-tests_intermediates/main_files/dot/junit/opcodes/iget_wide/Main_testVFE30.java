//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_wide;
import dot.junit.opcodes.iget_wide.d.*;
import dot.junit.*;
public class Main_testVFE30 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iget_wide.d.T_iget_wide_30");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
