//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.return_object;
import dot.junit.opcodes.return_object.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dxc.junit.opcodes.return_object.jm.T_return_object_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}