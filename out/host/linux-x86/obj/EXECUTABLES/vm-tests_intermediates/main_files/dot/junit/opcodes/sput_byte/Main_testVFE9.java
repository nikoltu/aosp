//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_byte;
import dot.junit.opcodes.sput_byte.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput_byte.TestStubs
        //@uses dot.junit.opcodes.sput_byte.d.T_sput_byte_8
        try {
            new T_sput_byte_8().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}
