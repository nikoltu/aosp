//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sparse_switch;
import dot.junit.opcodes.sparse_switch.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sparse_switch.d.T_sparse_switch_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
