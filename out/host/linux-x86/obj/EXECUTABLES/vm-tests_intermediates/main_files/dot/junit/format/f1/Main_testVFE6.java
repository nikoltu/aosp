//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.format.f1;
import dot.junit.format.f1.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.format.f1.d.T_f1_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}