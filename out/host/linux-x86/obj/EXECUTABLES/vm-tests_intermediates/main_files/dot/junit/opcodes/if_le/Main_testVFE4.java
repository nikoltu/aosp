//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.if_le;
import dot.junit.opcodes.if_le.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.if_le.d.T_if_le_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
