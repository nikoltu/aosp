//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.goto_32;
import dot.junit.opcodes.goto_32.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
           try {
               Class.forName("dot.junit.opcodes.goto_32.d.T_goto_32_3");
               fail("expected a verification exception");
           } catch (Throwable t) {
               DxUtil.checkVerifyException(t);
           }
       }
}
