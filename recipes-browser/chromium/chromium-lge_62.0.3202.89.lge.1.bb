require chromium-lge.inc

SRC_URI[md5sum] = "3fcb081eb28cd96cce9d62a5b8464773"
SRC_URI[sha256sum] = "09d23546f51206d856f770d3ec25bcc9e27facc0b755b3cc7c3336f49ab7fee7"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"
