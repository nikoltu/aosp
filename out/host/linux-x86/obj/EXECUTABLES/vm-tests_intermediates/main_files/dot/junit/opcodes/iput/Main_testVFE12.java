//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput;
import dot.junit.opcodes.iput.d.*;
import dot.junit.*;
public class Main_testVFE12 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iput.d.T_iput_1
        //@uses dot.junit.opcodes.iput.d.T_iput_15
        try {
            new T_iput_15().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
