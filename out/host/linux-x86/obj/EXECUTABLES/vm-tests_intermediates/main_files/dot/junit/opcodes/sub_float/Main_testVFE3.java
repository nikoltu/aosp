//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sub_float;
import dot.junit.opcodes.sub_float.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sub_float.d.T_sub_float_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
