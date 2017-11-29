require chromium-lge.inc

SRC_URI[md5sum] = "10b2d8c7f0799aa34ba1e55a54085316"
SRC_URI[sha256sum] = "d98f07939ccb69a8298d1f8fc02dc30463e7df2a8a9ddbb28a02e01dfe3f4d7a"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
  file://v8-qemu-wrapper.patch \
"
