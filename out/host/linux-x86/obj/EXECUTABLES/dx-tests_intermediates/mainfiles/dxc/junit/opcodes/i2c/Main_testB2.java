//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.i2c;
import dxc.junit.opcodes.i2c.jm.*;
import dxc.junit.*;
public class Main_testB2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB2().testB2();
}
public void testB2() {
        T_i2c_1 t = new T_i2c_1();
        assertEquals('\uffff', t.run(65535));
    }
}
