//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.if_nez;
import dot.junit.opcodes.if_nez.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.if_nez.d.T_if_nez_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
