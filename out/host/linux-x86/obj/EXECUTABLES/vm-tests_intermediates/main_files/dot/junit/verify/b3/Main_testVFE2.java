//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.verify.b3;
import dot.junit.verify.b3.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.verify.b3.d.T_b3_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
