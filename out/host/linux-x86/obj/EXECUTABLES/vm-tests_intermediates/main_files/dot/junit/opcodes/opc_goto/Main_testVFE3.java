//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.opc_goto;
import dot.junit.opcodes.opc_goto.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
       try {
           Class.forName("dot.junit.opcodes.opc_goto.d.T_opc_goto_4");
           fail("expected a verification exception");
       } catch (Throwable t) {
           DxUtil.checkVerifyException(t);
       }
   }
}
