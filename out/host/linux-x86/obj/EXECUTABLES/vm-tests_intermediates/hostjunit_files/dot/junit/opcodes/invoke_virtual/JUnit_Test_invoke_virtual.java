package dot.junit.opcodes.invoke_virtual;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_invoke_virtual extends DeviceTestCase {
public void testE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testE1.jar", "/data/local/tmp/Main_testE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_1.jar", "/data/local/tmp/T_invoke_virtual_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE1.jar:/data/local/tmp/T_invoke_virtual_1.jar", "dot.junit.opcodes.invoke_virtual.Main_testE1");}

public void testE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testE2.jar", "/data/local/tmp/Main_testE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_4.jar", "/data/local/tmp/T_invoke_virtual_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE2.jar:/data/local/tmp/T_invoke_virtual_4.jar", "dot.junit.opcodes.invoke_virtual.Main_testE2");}

public void testE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testE4.jar", "/data/local/tmp/Main_testE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_6.jar", "/data/local/tmp/T_invoke_virtual_6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/ATest.jar", "/data/local/tmp/ATest.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE4.jar:/data/local/tmp/T_invoke_virtual_6.jar:/data/local/tmp/ATest.jar", "dot.junit.opcodes.invoke_virtual.Main_testE4");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_1.jar", "/data/local/tmp/T_invoke_virtual_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_invoke_virtual_1.jar", "dot.junit.opcodes.invoke_virtual.Main_testN1");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_7.jar", "/data/local/tmp/T_invoke_virtual_7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_invoke_virtual_7.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_virtual.Main_testN3");}

public void testN5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testN5.jar", "/data/local/tmp/Main_testN5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_14.jar", "/data/local/tmp/T_invoke_virtual_14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN5.jar:/data/local/tmp/T_invoke_virtual_14.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_virtual.Main_testN5");}

public void testN6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testN6.jar", "/data/local/tmp/Main_testN6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_17.jar", "/data/local/tmp/T_invoke_virtual_17.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN6.jar:/data/local/tmp/T_invoke_virtual_17.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_virtual.Main_testN6");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_8.jar", "/data/local/tmp/T_invoke_virtual_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_invoke_virtual_8.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_5.jar", "/data/local/tmp/T_invoke_virtual_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/T_invoke_virtual_5.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE10");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_15.jar", "/data/local/tmp/T_invoke_virtual_15.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/T_invoke_virtual_15.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_18.jar", "/data/local/tmp/T_invoke_virtual_18.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_invoke_virtual_18.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE13");}

public void testVFE14() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE14.jar", "/data/local/tmp/Main_testVFE14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_20.jar", "/data/local/tmp/T_invoke_virtual_20.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE14.jar:/data/local/tmp/T_invoke_virtual_20.jar:/data/local/tmp/TestStubs.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE14");}

public void testVFE15() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE15.jar", "/data/local/tmp/Main_testVFE15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_19.jar", "/data/local/tmp/T_invoke_virtual_19.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE15.jar:/data/local/tmp/T_invoke_virtual_19.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE15");}

public void testVFE16() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE16.jar", "/data/local/tmp/Main_testVFE16.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_13.jar", "/data/local/tmp/T_invoke_virtual_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE16.jar:/data/local/tmp/T_invoke_virtual_13.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE16");}

public void testVFE17() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE17.jar", "/data/local/tmp/Main_testVFE17.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_9.jar", "/data/local/tmp/T_invoke_virtual_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE17.jar:/data/local/tmp/T_invoke_virtual_9.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE17");}

public void testVFE18() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE18.jar", "/data/local/tmp/Main_testVFE18.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_24.jar", "/data/local/tmp/T_invoke_virtual_24.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE18.jar:/data/local/tmp/T_invoke_virtual_24.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE18");}

public void testVFE19() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE19.jar", "/data/local/tmp/Main_testVFE19.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_25.jar", "/data/local/tmp/T_invoke_virtual_25.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE19.jar:/data/local/tmp/T_invoke_virtual_25.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE19");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_10.jar", "/data/local/tmp/T_invoke_virtual_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_invoke_virtual_10.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_11.jar", "/data/local/tmp/T_invoke_virtual_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_invoke_virtual_11.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE4");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_12.jar", "/data/local/tmp/T_invoke_virtual_12.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_invoke_virtual_12.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_16.jar", "/data/local/tmp/T_invoke_virtual_16.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_invoke_virtual_16.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE6");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_22.jar", "/data/local/tmp/T_invoke_virtual_22.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TPlain.jar", "/data/local/tmp/TPlain.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/T_invoke_virtual_22.jar:/data/local/tmp/TPlain.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/T_invoke_virtual_23.jar", "/data/local/tmp/T_invoke_virtual_23.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper2.jar", "/data/local/tmp/TSuper2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_virtual/d/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/T_invoke_virtual_23.jar:/data/local/tmp/TSuper2.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_virtual.Main_testVFE9");}


}
