//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.add_double;
import dot.junit.opcodes.add_double.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.add_double.d.T_add_double_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
