//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.i2l;
import dxc.junit.opcodes.i2l.jm.*;
import dxc.junit.*;
public class Main_testB3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB3().testB3();
}
public void testB3() {
        T_i2l_1 t = new T_i2l_1();
        assertEquals(-2147483648l, t.run(Integer.MIN_VALUE));
    }
}
