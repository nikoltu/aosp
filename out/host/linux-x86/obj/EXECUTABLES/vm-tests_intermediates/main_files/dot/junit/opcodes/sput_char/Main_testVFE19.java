//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_char;
import dot.junit.opcodes.sput_char.d.*;
import dot.junit.*;
public class Main_testVFE19 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput_char.TestStubs
        //@uses dot.junit.opcodes.sput_char.d.T_sput_char_11
    	try {
            new T_sput_char_11().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}