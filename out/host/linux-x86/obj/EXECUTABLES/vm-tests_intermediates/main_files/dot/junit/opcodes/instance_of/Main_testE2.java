//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.instance_of;
import dot.junit.opcodes.instance_of.d.*;
import dot.junit.*;
public class Main_testE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.instance_of.TestStubs
        //@uses dot.junit.opcodes.instance_of.d.T_instance_of_3
        try {
            T_instance_of_3 tt = new T_instance_of_3();
            tt.run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError e) {
        }
    }
}