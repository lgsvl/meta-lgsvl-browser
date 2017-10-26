require chromium-lge.inc

SRC_URI[md5sum] = "9fe9af85faeaf617cb61997c431a02e2"
SRC_URI[sha256sum] = "0bfb6318af1c3cf82e8ac872e3da34cd3c013aadaab446d5097228101cec065e"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/libva/COPYING;md5=2e48940f94acb0af582e5ef03537800f \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=26c9f3d11f88911950f9ff62189d3d4f \
"
