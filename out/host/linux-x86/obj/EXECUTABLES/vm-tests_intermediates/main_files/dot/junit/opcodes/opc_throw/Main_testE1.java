//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.opc_throw;
import dot.junit.opcodes.opc_throw.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_opc_throw_4 t = new T_opc_throw_4();
        try {
            t.run();
            fail("expected NullPointerException");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}
