require chromium-x11.inc

SRC_URI[md5sum] = "c754e1f63065d487fb134881de4932cd"
SRC_URI[sha256sum] = "49cdfe457bcb941b56c13a75bbe2ff394fcb5baa8a49c9b470835fad60dd904c"

LIC_FILES_CHKSUM += "\
  file://${S}/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/sdch/open-vcdiff/COPYING;md5=ff820d4ddc1ba05b6fd37b41a21506f9 \
  file://${S}/third_party/expat/files/COPYING;md5=9c3ee559c6f9dcee1043ead112139f4f \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"
