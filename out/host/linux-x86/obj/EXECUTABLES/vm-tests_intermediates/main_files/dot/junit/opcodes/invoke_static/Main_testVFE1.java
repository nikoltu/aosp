//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_static;
import dot.junit.opcodes.invoke_static.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.invoke_static.d.T_invoke_static_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
