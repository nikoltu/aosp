//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.new_instance;
import dot.junit.opcodes.new_instance.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.new_instance.d.T_new_instance_10");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
