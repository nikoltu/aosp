//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ishr;
import dxc.junit.opcodes.ishr.jm.*;
import dxc.junit.*;
public class Main_testB3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB3().testB3();
}
public void testB3() {
        T_ishr_1 t = new T_ishr_1();
        assertEquals(0xc0000000, t.run(Integer.MIN_VALUE, 1));
    }
}