//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.not_int;
import dot.junit.opcodes.not_int.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.not_int.d.T_not_int_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
