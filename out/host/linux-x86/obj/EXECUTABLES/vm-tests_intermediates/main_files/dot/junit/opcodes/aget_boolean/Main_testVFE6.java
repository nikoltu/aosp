//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_boolean;
import dot.junit.opcodes.aget_boolean.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aget_boolean.d.T_aget_boolean_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
