//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.cmpg_double;
import dot.junit.opcodes.cmpg_double.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.cmpg_double.d.T_cmpg_double_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
