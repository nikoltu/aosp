//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.or_int;
import dot.junit.opcodes.or_int.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.or_int.d.T_or_int_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
