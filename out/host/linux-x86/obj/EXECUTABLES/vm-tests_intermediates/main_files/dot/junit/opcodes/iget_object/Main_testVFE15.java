//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_object;
import dot.junit.opcodes.iget_object.d.*;
import dot.junit.*;
public class Main_testVFE15 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_iget_object_21().run();
            fail("expected a NoSuchFieldError exception");
        } catch (NoSuchFieldError e) {
            // expected
        }
    }
}