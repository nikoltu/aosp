//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.if_ltz;
import dot.junit.opcodes.if_ltz.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.if_ltz.d.T_if_ltz_8");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
