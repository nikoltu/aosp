//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fdiv;
import dxc.junit.opcodes.fdiv.jm.*;
import dxc.junit.*;
public class Main_testB9 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB9().testB9();
}
public void testB9() {
        T_fdiv_1 t = new T_fdiv_1();
        assertEquals(Float.NEGATIVE_INFINITY, t.run(Float.MAX_VALUE, -1E-9f));
    }
}