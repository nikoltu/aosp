//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_object;
import dot.junit.opcodes.sget_object.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sget_object.d.T_sget_object_6
        //@uses dot.junit.opcodes.sget_object.TestStubs
        try {
            new T_sget_object_6().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}
