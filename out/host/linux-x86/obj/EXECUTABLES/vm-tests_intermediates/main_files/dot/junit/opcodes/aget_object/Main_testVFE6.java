//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_object;
import dot.junit.opcodes.aget_object.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aget_object.d.T_aget_object_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
