package dot.junit.opcodes.iget_object;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_iget_object extends DeviceTestCase {
public void testE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testE2.jar", "/data/local/tmp/Main_testE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_9.jar", "/data/local/tmp/T_iget_object_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE2.jar:/data/local/tmp/T_iget_object_9.jar", "dot.junit.opcodes.iget_object.Main_testE2");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_1.jar", "/data/local/tmp/T_iget_object_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_iget_object_1.jar", "dot.junit.opcodes.iget_object.Main_testN1");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_1.jar", "/data/local/tmp/T_iget_object_1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_11.jar", "/data/local/tmp/T_iget_object_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_iget_object_1.jar:/data/local/tmp/T_iget_object_11.jar", "dot.junit.opcodes.iget_object.Main_testN3");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_4.jar", "/data/local/tmp/T_iget_object_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_iget_object_4.jar", "dot.junit.opcodes.iget_object.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_16.jar", "/data/local/tmp/T_iget_object_16.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/T_iget_object_16.jar", "dot.junit.opcodes.iget_object.Main_testVFE10");}

public void testVFE11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE11.jar", "/data/local/tmp/Main_testVFE11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_17.jar", "/data/local/tmp/T_iget_object_17.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE11.jar:/data/local/tmp/T_iget_object_17.jar", "dot.junit.opcodes.iget_object.Main_testVFE11");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_18.jar", "/data/local/tmp/T_iget_object_18.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/T_iget_object_18.jar", "dot.junit.opcodes.iget_object.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_19.jar", "/data/local/tmp/T_iget_object_19.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/T_iget_object_19.jar", "dot.junit.opcodes.iget_object.Main_testVFE13");}

public void testVFE14() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE14.jar", "/data/local/tmp/Main_testVFE14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_20.jar", "/data/local/tmp/T_iget_object_20.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE14.jar:/data/local/tmp/T_iget_object_20.jar", "dot.junit.opcodes.iget_object.Main_testVFE14");}

public void testVFE15() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE15.jar", "/data/local/tmp/Main_testVFE15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_21.jar", "/data/local/tmp/T_iget_object_21.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE15.jar:/data/local/tmp/T_iget_object_21.jar", "dot.junit.opcodes.iget_object.Main_testVFE15");}

public void testVFE16() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE16.jar", "/data/local/tmp/Main_testVFE16.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_22.jar", "/data/local/tmp/T_iget_object_22.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE16.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_iget_object_22.jar", "dot.junit.opcodes.iget_object.Main_testVFE16");}

public void testVFE17() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE17.jar", "/data/local/tmp/Main_testVFE17.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_5.jar", "/data/local/tmp/T_iget_object_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE17.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_iget_object_5.jar", "dot.junit.opcodes.iget_object.Main_testVFE17");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_3.jar", "/data/local/tmp/T_iget_object_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_iget_object_3.jar", "dot.junit.opcodes.iget_object.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_13.jar", "/data/local/tmp/T_iget_object_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_iget_object_13.jar", "dot.junit.opcodes.iget_object.Main_testVFE3");}

public void testVFE30() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE30.jar", "/data/local/tmp/Main_testVFE30.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_30.jar", "/data/local/tmp/T_iget_object_30.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE30.jar:/data/local/tmp/T_iget_object_30.jar", "dot.junit.opcodes.iget_object.Main_testVFE30");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_6.jar", "/data/local/tmp/T_iget_object_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_iget_object_6.jar", "dot.junit.opcodes.iget_object.Main_testVFE4");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_7.jar", "/data/local/tmp/T_iget_object_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_iget_object_7.jar", "dot.junit.opcodes.iget_object.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_8.jar", "/data/local/tmp/T_iget_object_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_iget_object_8.jar", "dot.junit.opcodes.iget_object.Main_testVFE6");}

public void testVFE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE7.jar", "/data/local/tmp/Main_testVFE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_1.jar", "/data/local/tmp/T_iget_object_1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_12.jar", "/data/local/tmp/T_iget_object_12.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE7.jar:/data/local/tmp/T_iget_object_1.jar:/data/local/tmp/T_iget_object_12.jar", "dot.junit.opcodes.iget_object.Main_testVFE7");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_14.jar", "/data/local/tmp/T_iget_object_14.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/T_iget_object_14.jar", "dot.junit.opcodes.iget_object.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iget_object/d/T_iget_object_15.jar", "/data/local/tmp/T_iget_object_15.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/T_iget_object_15.jar", "dot.junit.opcodes.iget_object.Main_testVFE9");}


}
