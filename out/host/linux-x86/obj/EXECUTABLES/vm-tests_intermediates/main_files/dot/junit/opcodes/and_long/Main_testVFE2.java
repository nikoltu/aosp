//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.and_long;
import dot.junit.opcodes.and_long.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.and_long.d.T_and_long_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
