//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.return_void;
import dot.junit.opcodes.return_void.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.return_void.d.T_return_void_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
