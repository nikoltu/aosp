//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ladd;
import dxc.junit.opcodes.ladd.jm.*;
import dxc.junit.*;
public class Main_testB8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB8().testB8();
}
public void testB8() {
        T_ladd_1 t = new T_ladd_1();
        assertEquals(-9223372036854775808l, t.run(Long.MAX_VALUE, 1l));
    }
}
