//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_wide;
import dot.junit.opcodes.iput_wide.d.*;
import dot.junit.*;
public class Main_testVFE12 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iput_wide.d.T_iput_wide_1
        //@uses dot.junit.opcodes.iput_wide.d.T_iput_wide_15
        try {
            new T_iput_wide_15().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}