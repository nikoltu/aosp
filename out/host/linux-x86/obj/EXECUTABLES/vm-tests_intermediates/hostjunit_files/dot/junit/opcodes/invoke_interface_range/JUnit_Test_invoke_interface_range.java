package dot.junit.opcodes.invoke_interface_range;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_invoke_interface_range extends DeviceTestCase {
public void testE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testE3.jar", "/data/local/tmp/Main_testE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_3.jar", "/data/local/tmp/T_invoke_interface_range_3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE3.jar:/data/local/tmp/T_invoke_interface_range_3.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testE3");}

public void testE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testE4.jar", "/data/local/tmp/Main_testE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_11.jar", "/data/local/tmp/T_invoke_interface_range_11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE4.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/T_invoke_interface_range_11.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testE4");}

public void testE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testE5.jar", "/data/local/tmp/Main_testE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_12.jar", "/data/local/tmp/T_invoke_interface_range_12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE5.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/T_invoke_interface_range_12.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testE5");}

public void testE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testE6.jar", "/data/local/tmp/Main_testE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImplAbstract.jar", "/data/local/tmp/ITestImplAbstract.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_13.jar", "/data/local/tmp/T_invoke_interface_range_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE6.jar:/data/local/tmp/ITestImplAbstract.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/ITest.jar:/data/local/tmp/T_invoke_interface_range_13.jar", "dot.junit.opcodes.invoke_interface_range.Main_testE6");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_1.jar", "/data/local/tmp/T_invoke_interface_range_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_invoke_interface_range_1.jar", "dot.junit.opcodes.invoke_interface_range.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_14.jar", "/data/local/tmp/T_invoke_interface_range_14.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/ITest.jar:/data/local/tmp/T_invoke_interface_range_14.jar", "dot.junit.opcodes.invoke_interface_range.Main_testN2");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_2.jar", "/data/local/tmp/T_invoke_interface_range_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_invoke_interface_range_2.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImplAbstract.jar", "/data/local/tmp/ITestImplAbstract.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_18.jar", "/data/local/tmp/T_invoke_interface_range_18.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/ITestImplAbstract.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/T_invoke_interface_range_18.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE10");}

public void testVFE11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE11.jar", "/data/local/tmp/Main_testVFE11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_20.jar", "/data/local/tmp/T_invoke_interface_range_20.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE11.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/T_invoke_interface_range_20.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE11");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_21.jar", "/data/local/tmp/T_invoke_interface_range_21.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/T_invoke_interface_range_21.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_8.jar", "/data/local/tmp/T_invoke_interface_range_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/T_invoke_interface_range_8.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE13");}

public void testVFE14() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE14.jar", "/data/local/tmp/Main_testVFE14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_7.jar", "/data/local/tmp/T_invoke_interface_range_7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE14.jar:/data/local/tmp/T_invoke_interface_range_7.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE14");}

public void testVFE15() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE15.jar", "/data/local/tmp/Main_testVFE15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_16.jar", "/data/local/tmp/T_invoke_interface_range_16.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE15.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/ITest.jar:/data/local/tmp/T_invoke_interface_range_16.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE15");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_4.jar", "/data/local/tmp/T_invoke_interface_range_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_invoke_interface_range_4.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE2");}

public void testVFE21() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE21.jar", "/data/local/tmp/Main_testVFE21.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_22.jar", "/data/local/tmp/T_invoke_interface_range_22.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE21.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/ITest.jar:/data/local/tmp/T_invoke_interface_range_22.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE21");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITestImpl.jar", "/data/local/tmp/ITestImpl.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_5.jar", "/data/local/tmp/T_invoke_interface_range_5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/ITest.jar", "/data/local/tmp/ITest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/ITestImpl.jar:/data/local/tmp/T_invoke_interface_range_5.jar:/data/local/tmp/ITest.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_10.jar", "/data/local/tmp/T_invoke_interface_range_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_invoke_interface_range_10.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE6");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_interface_range/d/T_invoke_interface_range_9.jar", "/data/local/tmp/T_invoke_interface_range_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/T_invoke_interface_range_9.jar", "dot.junit.opcodes.invoke_interface_range.Main_testVFE9");}


}