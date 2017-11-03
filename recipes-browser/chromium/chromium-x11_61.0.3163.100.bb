require chromium-x11.inc

SRC_URI[md5sum] = "bf0629c03b3e3b957a9ee99c10b28210"
SRC_URI[sha256sum] = "4135968cac6623c1d2b224494600cd274098cce41c298f8c3908b354a34c281b"

LIC_FILES_CHKSUM += "\
  file://${S}/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/sdch/open-vcdiff/COPYING;md5=ff820d4ddc1ba05b6fd37b41a21506f9 \
  file://${S}/third_party/expat/files/COPYING;md5=9c3ee559c6f9dcee1043ead112139f4f \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/libva/COPYING;md5=2e48940f94acb0af582e5ef03537800f \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=26c9f3d11f88911950f9ff62189d3d4f \
"

SRC_URI += " \
 file://0001-Make-base-numerics-build-with-GCC.patch \
 file://0001-Fix-compilation-for-ATK-accessibility.patch \
 file://0001-Fix-compilation-failures-for-arm64.patch \
"