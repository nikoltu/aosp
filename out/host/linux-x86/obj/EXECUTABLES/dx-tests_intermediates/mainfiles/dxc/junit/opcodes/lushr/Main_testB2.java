//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lushr;
import dxc.junit.opcodes.lushr.jm.*;
import dxc.junit.*;
public class Main_testB2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB2().testB2();
}
public void testB2() {
        T_lushr_1 t = new T_lushr_1();
        assertEquals(0x3FFFFFFFFFFFFFFFl, t.run(Long.MAX_VALUE, 1));
    }
}