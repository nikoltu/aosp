//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_short;
import dot.junit.opcodes.sget_short.d.*;
import dot.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sget_short.d.T_sget_short_12
        //@uses dot.junit.opcodes.sget_short.d.T_sget_short_1
        try {
            new T_sget_short_12().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}