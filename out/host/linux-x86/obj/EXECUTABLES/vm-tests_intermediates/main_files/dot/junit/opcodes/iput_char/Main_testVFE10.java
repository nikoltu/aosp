//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_char;
import dot.junit.opcodes.iput_char.d.*;
import dot.junit.*;
public class Main_testVFE10 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_iput_char_9().run();
            fail("expected NoClassDefFoundError");
        } catch (NoClassDefFoundError t) {
        }
    }
}