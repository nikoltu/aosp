//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.neg_int;
import dot.junit.opcodes.neg_int.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.neg_int.d.T_neg_int_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
