//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_boolean;
import dot.junit.opcodes.sget_boolean.d.*;
import dot.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sget_boolean.d.T_sget_boolean_14");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
