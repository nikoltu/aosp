//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rem_long;
import dot.junit.opcodes.rem_long.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.rem_long.d.T_rem_long_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
