//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_short;
import dot.junit.opcodes.sput_short.d.*;
import dot.junit.*;
public class Main_testVFE12 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput_short.d.T_sput_short_1
        //@uses dot.junit.opcodes.sput_short.d.T_sput_short_15
        try {
            new T_sput_short_15().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}
