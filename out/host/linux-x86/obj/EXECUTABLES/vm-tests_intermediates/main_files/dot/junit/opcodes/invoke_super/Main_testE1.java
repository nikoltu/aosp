//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_super;
import dot.junit.opcodes.invoke_super.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_super.d.T_invoke_super_1
        //@uses dot.junit.opcodes.invoke_super.d.TSuper
        T_invoke_super_2 t = new T_invoke_super_2();
        try {
            t.run();
            fail("expected NullPointerException");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}