//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_object;
import dot.junit.opcodes.iget_object.d.*;
import dot.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iget_object.d.T_iget_object_14");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
