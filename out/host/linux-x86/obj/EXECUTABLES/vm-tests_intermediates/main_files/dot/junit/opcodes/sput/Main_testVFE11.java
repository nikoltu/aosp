//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput;
import dot.junit.opcodes.sput.d.*;
import dot.junit.*;
public class Main_testVFE11 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_sput_10().run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError t) {
        }
    }
}
