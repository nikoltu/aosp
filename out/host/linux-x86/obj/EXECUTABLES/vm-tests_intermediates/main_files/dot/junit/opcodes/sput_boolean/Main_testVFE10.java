//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_boolean;
import dot.junit.opcodes.sput_boolean.d.*;
import dot.junit.*;
public class Main_testVFE10 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_sput_boolean_9().run();
            fail("expected NoClassDefFoundError");
        } catch (NoClassDefFoundError t) {
        }
    }
}
