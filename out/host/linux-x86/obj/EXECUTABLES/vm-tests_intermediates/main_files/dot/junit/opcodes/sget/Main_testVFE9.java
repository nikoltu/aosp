//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget;
import dot.junit.opcodes.sget.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sget.d.T_sget_15");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
