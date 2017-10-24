require chromium-x11.inc

SRC_URI[md5sum] = "bf0629c03b3e3b957a9ee99c10b28210"
SRC_URI[sha256sum] = "4135968cac6623c1d2b224494600cd274098cce41c298f8c3908b354a34c281b"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
"

SRC_URI += " \
 file://0001-Make-base-numerics-build-with-GCC.patch \
 file://0001-Fix-compilation-for-ATK-accessibility.patch \
 file://0001-Fix-compilation-failures-for-arm64.patch \
"