//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fneg;
import dxc.junit.opcodes.fneg.jm.*;
import dxc.junit.*;
public class Main_testB2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB2().testB2();
}
public void testB2() {
        T_fneg_1 t = new T_fneg_1();
        assertEquals(Float.POSITIVE_INFINITY, t.run(Float.NEGATIVE_INFINITY));
    }
}