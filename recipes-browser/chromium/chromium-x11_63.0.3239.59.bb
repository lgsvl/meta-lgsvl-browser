require chromium-x11.inc

SRC_URI[md5sum] = "d6ae8eefd8301542c521caa088948d49"
SRC_URI[sha256sum] = "62aec842b706d7240e86f2a46d852ae1e6d521be69295615d778af595af3467a"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=740fe57c4bba4c18b3a3bafd39cb70f8 \
  file://${S}/third_party/libpng/LICENSE;md5=b3edd1241cafd9e736d04c08d5017ff4 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=c2c05f9bdd5fc0b458037c2d1fb8d95e \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://0001-IWYU-Include-math.h-for-round-3.patch;patchdir=third_party/webrtc \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
"
