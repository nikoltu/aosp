//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_object;
import dot.junit.opcodes.sget_object.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_sget_object_8().run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError t) {
        }
    }
}
