//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.const_class;
import dot.junit.opcodes.const_class.d.*;
import dot.junit.*;
public class Main_testE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.const_class.TestStubs
        //@uses dot.junit.opcodes.const_class.d.T_const_class_7
        try {
            T_const_class_7 t = new T_const_class_7();
            t.run();
            fail("expected an IllegalAccessError exception");
        } catch (IllegalAccessError e) {
            // expected
        }
    }
}