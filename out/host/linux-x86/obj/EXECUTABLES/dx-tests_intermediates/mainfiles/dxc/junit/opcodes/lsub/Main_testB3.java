//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lsub;
import dxc.junit.opcodes.lsub.jm.*;
import dxc.junit.*;
public class Main_testB3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB3().testB3();
}
public void testB3() {
        T_lsub_1 t = new T_lsub_1();
        assertEquals(-9223372036854775808L, t.run(Long.MAX_VALUE, -1l));
    }
}