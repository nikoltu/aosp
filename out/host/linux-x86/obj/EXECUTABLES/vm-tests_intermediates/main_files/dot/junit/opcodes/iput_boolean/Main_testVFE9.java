//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_boolean;
import dot.junit.opcodes.iput_boolean.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iput_boolean.TestStubs
        //@uses dot.junit.opcodes.iput_boolean.d.T_iput_boolean_8
        try {
            new T_iput_boolean_8().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}