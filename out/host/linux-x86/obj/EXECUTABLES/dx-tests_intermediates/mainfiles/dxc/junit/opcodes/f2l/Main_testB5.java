//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.f2l;
import dxc.junit.opcodes.f2l.jm.*;
import dxc.junit.*;
public class Main_testB5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB5().testB5();
}
public void testB5() {
        T_f2l_1 t = new T_f2l_1();
        assertEquals(Long.MAX_VALUE, t.run(Float.POSITIVE_INFINITY));
    }
}