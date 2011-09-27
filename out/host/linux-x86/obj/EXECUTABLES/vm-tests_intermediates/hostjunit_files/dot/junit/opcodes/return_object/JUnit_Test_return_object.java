package dot.junit.opcodes.return_object;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_return_object extends DeviceTestCase {
public void testE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testE1.jar", "/data/local/tmp/Main_testE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_8.jar", "/data/local/tmp/T_return_object_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE1.jar:/data/local/tmp/T_return_object_8.jar", "dot.junit.opcodes.return_object.Main_testE1");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_1.jar", "/data/local/tmp/T_return_object_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_return_object_1.jar", "dot.junit.opcodes.return_object.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_1.jar", "/data/local/tmp/T_return_object_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_return_object_1.jar", "dot.junit.opcodes.return_object.Main_testN2");}

public void testN4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testN4.jar", "/data/local/tmp/Main_testN4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_2.jar", "/data/local/tmp/T_return_object_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN4.jar:/data/local/tmp/T_return_object_2.jar", "dot.junit.opcodes.return_object.Main_testN4");}

public void testN5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testN5.jar", "/data/local/tmp/Main_testN5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_6.jar", "/data/local/tmp/T_return_object_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN5.jar:/data/local/tmp/T_return_object_6.jar", "dot.junit.opcodes.return_object.Main_testN5");}

public void testN7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testN7.jar", "/data/local/tmp/Main_testN7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TInterface.jar", "/data/local/tmp/TInterface.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TChild.jar", "/data/local/tmp/TChild.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_12.jar", "/data/local/tmp/T_return_object_12.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN7.jar:/data/local/tmp/TInterface.jar:/data/local/tmp/TChild.jar:/data/local/tmp/TSuper.jar:/data/local/tmp/T_return_object_12.jar", "dot.junit.opcodes.return_object.Main_testN7");}

public void testN8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testN8.jar", "/data/local/tmp/Main_testN8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TInterface.jar", "/data/local/tmp/TInterface.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TChild.jar", "/data/local/tmp/TChild.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_13.jar", "/data/local/tmp/T_return_object_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN8.jar:/data/local/tmp/TInterface.jar:/data/local/tmp/TChild.jar:/data/local/tmp/TSuper.jar:/data/local/tmp/T_return_object_13.jar", "dot.junit.opcodes.return_object.Main_testN8");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_3.jar", "/data/local/tmp/T_return_object_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_return_object_3.jar", "dot.junit.opcodes.return_object.Main_testVFE1");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_4.jar", "/data/local/tmp/T_return_object_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_return_object_4.jar", "dot.junit.opcodes.return_object.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_16.jar", "/data/local/tmp/T_return_object_16.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_return_object_16.jar", "dot.junit.opcodes.return_object.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_5.jar", "/data/local/tmp/T_return_object_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_return_object_5.jar", "dot.junit.opcodes.return_object.Main_testVFE4");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_10.jar", "/data/local/tmp/T_return_object_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_return_object_10.jar", "dot.junit.opcodes.return_object.Main_testVFE6");}

public void testVFE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE7.jar", "/data/local/tmp/Main_testVFE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_11.jar", "/data/local/tmp/T_return_object_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE7.jar:/data/local/tmp/T_return_object_11.jar", "dot.junit.opcodes.return_object.Main_testVFE7");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TInterface.jar", "/data/local/tmp/TInterface.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TChild.jar", "/data/local/tmp/TChild.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_14.jar", "/data/local/tmp/T_return_object_14.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/TInterface.jar:/data/local/tmp/TChild.jar:/data/local/tmp/TSuper.jar:/data/local/tmp/T_return_object_14.jar", "dot.junit.opcodes.return_object.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/T_return_object_15.jar", "/data/local/tmp/T_return_object_15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/RunnerGenerator.jar", "/data/local/tmp/RunnerGenerator.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/Runner.jar", "/data/local/tmp/Runner.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/return_object/d/TSuper2.jar", "/data/local/tmp/TSuper2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/T_return_object_15.jar:/data/local/tmp/RunnerGenerator.jar:/data/local/tmp/Runner.jar:/data/local/tmp/TSuper2.jar", "dot.junit.opcodes.return_object.Main_testVFE9");}


}
