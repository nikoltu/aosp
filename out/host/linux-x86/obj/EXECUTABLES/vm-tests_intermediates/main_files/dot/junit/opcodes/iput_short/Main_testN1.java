//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_short;
import dot.junit.opcodes.iput_short.d.*;
import dot.junit.*;
public class Main_testN1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_iput_short_1 t = new T_iput_short_1();
        assertEquals(0, t.st_i1);
        t.run();
        assertEquals(77, t.st_i1);
    }
}