//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sub_double;
import dot.junit.opcodes.sub_double.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sub_double.d.T_sub_double_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
