//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.iushr;
import dxc.junit.opcodes.iushr.jm.*;
import dxc.junit.*;
public class Main_testB3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB3().testB3();
}
public void testB3() {
        T_iushr_1 t = new T_iushr_1();
        assertEquals(0x40000000, t.run(Integer.MIN_VALUE, 1));
    }
}
