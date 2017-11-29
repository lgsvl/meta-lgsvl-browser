require chromium-lge.inc

SRC_URI[md5sum] = "80107b020f39d5c1d3036b8f34623f46"
SRC_URI[sha256sum] = "f6da6f4f249f6841d2704d008937458a7f8a742dba273284f4e04fded7ffac16"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/libva/COPYING;md5=2e48940f94acb0af582e5ef03537800f \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=26c9f3d11f88911950f9ff62189d3d4f \
"

SRC_URI += " \
  file://v8-qemu-wrapper.patch \
"
