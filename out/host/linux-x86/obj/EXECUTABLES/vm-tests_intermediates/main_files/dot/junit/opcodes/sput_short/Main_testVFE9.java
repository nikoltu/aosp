//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_short;
import dot.junit.opcodes.sput_short.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput_short.TestStubs
        //@uses dot.junit.opcodes.sput_short.d.T_sput_short_8
        try {
            new T_sput_short_8().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}