//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_short;
import dot.junit.opcodes.iget_short.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iget_short.d.T_iget_short_15");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}