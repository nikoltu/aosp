//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget;
import dot.junit.opcodes.iget.d.*;
import dot.junit.*;
public class Main_testVFE12 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iget.d.T_iget_18");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
