//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rem_long_2addr;
import dot.junit.opcodes.rem_long_2addr.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.rem_long_2addr.d.T_rem_long_2addr_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
