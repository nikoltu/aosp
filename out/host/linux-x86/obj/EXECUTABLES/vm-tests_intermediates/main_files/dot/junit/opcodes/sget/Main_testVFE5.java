//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget;
import dot.junit.opcodes.sget.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_sget_7().run();
            fail("expected NoClassDefFoundError");
        } catch (NoClassDefFoundError t) {
        }
    }
}
