//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_object;
import dot.junit.opcodes.sget_object.d.*;
import dot.junit.*;
public class Main_testVFE13 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sget_object.d.T_sget_object_19");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
