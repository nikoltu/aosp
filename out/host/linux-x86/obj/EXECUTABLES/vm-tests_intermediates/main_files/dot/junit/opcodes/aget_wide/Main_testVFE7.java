//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_wide;
import dot.junit.opcodes.aget_wide.d.*;
import dot.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aget_wide.d.T_aget_wide_11");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
