//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.areturn;
import dxc.junit.opcodes.areturn.jm.*;
import dxc.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE7().testVFE7();
}
public void testVFE7() {
        // @uses dxc.junit.opcodes.areturn.jm.TSuper2
        // @uses dxc.junit.opcodes.areturn.Runner
        // @uses dxc.junit.opcodes.areturn.RunnerGenerator
        try {
            RunnerGenerator rg = (RunnerGenerator) Class.forName(
                    "dxc.junit.opcodes.areturn.jm.T_areturn_15").newInstance();
            Runner r = rg.run();
            assertFalse(r instanceof Runner);
            assertFalse(Runner.class.isAssignableFrom(r.getClass()));
            // only upon invocation of a concrete method,
            // a java.lang.IncompatibleClassChangeError is thrown
            r.doit();
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
