//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.const_16;
import dot.junit.opcodes.const_16.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.const_16.d.T_const_16_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}