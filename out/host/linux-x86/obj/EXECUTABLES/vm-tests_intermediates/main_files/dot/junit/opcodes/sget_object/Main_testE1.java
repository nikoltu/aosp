//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_object;
import dot.junit.opcodes.sget_object.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {

        T_sget_object_5 t = new T_sget_object_5();
        try {
            t.run();
            fail("expected IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError e) {
            // expected
        }
    }
}
