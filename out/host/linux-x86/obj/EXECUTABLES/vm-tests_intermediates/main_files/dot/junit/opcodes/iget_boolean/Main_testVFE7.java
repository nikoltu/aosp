//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_boolean;
import dot.junit.opcodes.iget_boolean.d.*;
import dot.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iget_boolean.d.T_iget_boolean_12
        //@uses dot.junit.opcodes.iget_boolean.d.T_iget_boolean_1
        try {
            new T_iget_boolean_12().run();
            fail("expected an IllegalAccessError exception");
        } catch (IllegalAccessError e) {
            // expected
        }
    }
}
