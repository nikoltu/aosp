//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.shl_long_2addr;
import dot.junit.opcodes.shl_long_2addr.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.shl_long_2addr.d.T_shl_long_2addr_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
