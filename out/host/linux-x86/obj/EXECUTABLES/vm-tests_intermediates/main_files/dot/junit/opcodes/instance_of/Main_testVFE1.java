//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.instance_of;
import dot.junit.opcodes.instance_of.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.instance_of.d.T_instance_of_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
