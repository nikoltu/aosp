//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_super_range;
import dot.junit.opcodes.invoke_super_range.d.*;
import dot.junit.*;
public class Main_testVFE16 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_super_range.d.T_invoke_super_range_13
        //@uses dot.junit.opcodes.invoke_super_range.d.TSuper
         try {
             Class.forName("dot.junit.opcodes.invoke_super_range.d.T_invoke_super_range_13");
             fail("expected a verification exception");
         } catch (Throwable t) {
             DxUtil.checkVerifyException(t);
         }
    }
}
