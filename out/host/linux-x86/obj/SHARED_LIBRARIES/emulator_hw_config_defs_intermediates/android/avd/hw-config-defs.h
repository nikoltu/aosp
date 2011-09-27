/* this file is automatically generated from 'hardware-properties.ini'
 * DO NOT EDIT IT. To re-generate it, use android/tools/gen-hw-config.py'
 */
#ifndef HWCFG_INT
#error  HWCFG_INT not defined
#endif
#ifndef HWCFG_BOOL
#error  HWCFG_BOOL not defined
#endif
#ifndef HWCFG_DISKSIZE
#error  HWCFG_DISKSIZE not defined
#endif
#ifndef HWCFG_STRING
#error  HWCFG_STRING not defined
#endif
#ifndef HWCFG_DOUBLE
#error  HWCFG_DOUBLE not defined
#endif

HWCFG_STRING(
  hw_cpu_arch,
  "hw.cpu.arch",
  "arm",
  "CPU Architecture",
  "The CPU Architecture to emulator")

HWCFG_STRING(
  hw_cpu_model,
  "hw.cpu.model",
  "",
  "CPU model",
  "The CPU model (QEMU-specific string)")

HWCFG_INT(
  hw_ramSize,
  "hw.ramSize",
  0,
  "Device ram size",
  "The amount of physical RAM on the device, in megabytes.")

HWCFG_BOOL(
  hw_touchScreen,
  "hw.touchScreen",
  "yes",
  "Touch-screen support",
  "Whether there is a touch screen or not on the device.")

HWCFG_BOOL(
  hw_trackBall,
  "hw.trackBall",
  "yes",
  "Track-ball support",
  "Whether there is a trackball on the device.")

HWCFG_BOOL(
  hw_keyboard,
  "hw.keyboard",
  "yes",
  "Keyboard support",
  "Whether the device has a QWERTY keyboard.")

HWCFG_BOOL(
  hw_keyboard_lid,
  "hw.keyboard.lid",
  "yes",
  "Keyboard lid support",
  "Whether the QWERTY keyboard can be opened/closed.")

HWCFG_STRING(
  hw_keyboard_charmap,
  "hw.keyboard.charmap",
  "qwerty2",
  "Keyboard charmap name",
  "Name of the system keyboard charmap file.")

HWCFG_BOOL(
  hw_dPad,
  "hw.dPad",
  "yes",
  "DPad support",
  "Whether the device has DPad keys")

HWCFG_BOOL(
  hw_gsmModem,
  "hw.gsmModem",
  "yes",
  "GSM modem support",
  "Whether there is a GSM modem in the device.")

HWCFG_BOOL(
  hw_camera,
  "hw.camera",
  "no",
  "Camera support",
  "Whether the device has a camera.")

HWCFG_INT(
  hw_camera_maxHorizontalPixels,
  "hw.camera.maxHorizontalPixels",
  640,
  "Maximum horizontal camera pixels",
  "")

HWCFG_INT(
  hw_camera_maxVerticalPixels,
  "hw.camera.maxVerticalPixels",
  480,
  "Maximum vertical camera pixels",
  "")

HWCFG_BOOL(
  hw_gps,
  "hw.gps",
  "yes",
  "GPS support",
  "Whether there is a GPS in the device.")

HWCFG_BOOL(
  hw_battery,
  "hw.battery",
  "yes",
  "Battery support",
  "Whether the device can run on a battery.")

HWCFG_BOOL(
  hw_accelerometer,
  "hw.accelerometer",
  "yes",
  "Accelerometer",
  "Whether there is an accelerometer in the device.")

HWCFG_BOOL(
  hw_audioInput,
  "hw.audioInput",
  "yes",
  "Audio recording support",
  "Whether the device can record audio")

HWCFG_BOOL(
  hw_audioOutput,
  "hw.audioOutput",
  "yes",
  "Audio playback support",
  "Whether the device can play audio")

HWCFG_BOOL(
  hw_sdCard,
  "hw.sdCard",
  "yes",
  "SD Card support",
  "Whether the device supports insertion/removal of virtual SD Cards.")

HWCFG_STRING(
  hw_sdCard_path,
  "hw.sdCard.path",
  "",
  "SD Card image path",
  "")

HWCFG_BOOL(
  disk_cachePartition,
  "disk.cachePartition",
  "yes",
  "Cache partition support",
  "Whether we use a /cache partition on the device.")

HWCFG_STRING(
  disk_cachePartition_path,
  "disk.cachePartition.path",
  "",
  "Cache partition",
  "Cache partition to use on the device. Ignored if disk.cachePartition is not 'yes'.")

HWCFG_DISKSIZE(
  disk_cachePartition_size,
  "disk.cachePartition.size",
  "66MB",
  "Cache partition size",
  "")

HWCFG_INT(
  hw_lcd_width,
  "hw.lcd.width",
  320,
  "LCD pixel width",
  "")

HWCFG_INT(
  hw_lcd_height,
  "hw.lcd.height",
  640,
  "LCD pixel height",
  "")

HWCFG_INT(
  hw_lcd_depth,
  "hw.lcd.depth",
  16,
  "LCD color depth",
  "Must be 16 or 32. Color bit depth of emulated framebuffer.")

HWCFG_INT(
  hw_lcd_density,
  "hw.lcd.density",
  160,
  "Abstracted LCD density",
  "Must be one of 120 / 160 / 240 / 213/ 320. A value used to roughly describe the density of the LCD screen for automatic resource/asset selection.")

HWCFG_BOOL(
  hw_lcd_backlight,
  "hw.lcd.backlight",
  "yes",
  "LCD backlight",
  "Enable/Disable LCD backlight simulation,yes-enabled,no-disabled.")

HWCFG_INT(
  vm_heapSize,
  "vm.heapSize",
  0,
  "Max VM application heap size",
  "The maximum heap size a Dalvik application might allocate before being killed by the system. Value is in megabytes.")

HWCFG_BOOL(
  hw_sensors_proximity,
  "hw.sensors.proximity",
  "yes",
  "Proximity support",
  "Whether there is an proximity in the device.")

HWCFG_STRING(
  kernel_path,
  "kernel.path",
  "",
  "Path to the kernel image",
  "Path to the kernel image.")

HWCFG_STRING(
  kernel_parameters,
  "kernel.parameters",
  "",
  "kernel boot parameters string.",
  "")

HWCFG_STRING(
  disk_ramdisk_path,
  "disk.ramdisk.path",
  "",
  "Path to the ramdisk image",
  "Path to the ramdisk image.")

HWCFG_STRING(
  disk_systemPartition_path,
  "disk.systemPartition.path",
  "",
  "Path to runtime system partition image",
  "")

HWCFG_STRING(
  disk_systemPartition_initPath,
  "disk.systemPartition.initPath",
  "",
  "Initial system partition image",
  "")

HWCFG_DISKSIZE(
  disk_systemPartition_size,
  "disk.systemPartition.size",
  "0",
  "Ideal size of system partition",
  "")

HWCFG_STRING(
  disk_dataPartition_path,
  "disk.dataPartition.path",
  "<temp>",
  "Path to data partition file",
  "Path to data partition file. Cannot be empty. Special value <temp> means using a temporary file. If disk.dataPartition.initPath is not empty, its content will be copied to the disk.dataPartition.path file at boot-time.")

HWCFG_STRING(
  disk_dataPartition_initPath,
  "disk.dataPartition.initPath",
  "",
  "Initial data partition",
  "If not empty, its content will be copied to the disk.dataPartition.path file at boot-time.")

HWCFG_DISKSIZE(
  disk_dataPartition_size,
  "disk.dataPartition.size",
  "0",
  "Ideal size of data partition",
  "")

HWCFG_STRING(
  disk_snapStorage_path,
  "disk.snapStorage.path",
  "",
  "Path to snapshot storage",
  "Path to a 'snapshot storage' file, where all snapshots are stored.")

HWCFG_STRING(
  avd_name,
  "avd.name",
  "<build>",
  "Name of the AVD being run",
  "")

#undef HWCFG_INT
#undef HWCFG_BOOL
#undef HWCFG_DISKSIZE
#undef HWCFG_STRING
#undef HWCFG_DOUBLE
/* end of auto-generated file */