//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget;
import dot.junit.opcodes.iget.d.*;
import dot.junit.*;
public class Main_testVFE15 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iget.d.T_iget_21
        //@uses dot.junit.opcodes.iget.TestStubs
        try {
            new T_iget_21().run();
            fail("expected an IllegalAccessError exception");
        } catch (IllegalAccessError e) {
            // expected
        }
    }
}
