//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_object;
import dot.junit.opcodes.iput_object.d.*;
import dot.junit.*;
public class Main_testVFE19 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iput_object.TestStubs
        //@uses dot.junit.opcodes.iput_object.d.T_iput_object_11
    	try {
            new T_iput_object_11().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}