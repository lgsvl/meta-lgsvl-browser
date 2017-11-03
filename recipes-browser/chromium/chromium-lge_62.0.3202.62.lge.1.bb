require chromium-lge.inc

SRC_URI[md5sum] = "aa2294d1737e7adbd8417939498236a2"
SRC_URI[sha256sum] = "613bdd3960adaf01d050b9160202ee8be0406370b6a6a2e8f7e5ce6aec779200"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"
