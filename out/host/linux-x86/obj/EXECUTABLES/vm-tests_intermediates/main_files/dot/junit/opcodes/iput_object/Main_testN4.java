//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_object;
import dot.junit.opcodes.iput_object.d.*;
import dot.junit.*;
public class Main_testN4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.iput_object.d.T_iput_object_1
        //@uses dot.junit.opcodes.iput_object.d.T_iput_object_14
        T_iput_object_14 t = new T_iput_object_14();
        assertEquals(null, t.getProtectedField());
        t.run();
        assertEquals(t, t.getProtectedField());
    }
}