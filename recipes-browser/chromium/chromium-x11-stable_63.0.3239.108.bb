require chromium-x11.inc

SRC_URI[md5sum] = "71a8f5f1591e5b924e10c1cc4041dc08"
SRC_URI[sha256sum] = "47d80798194da78bdd519b7ce012425b13cf89d6eb287e22a34342a245c31a2b"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/boringssl/src/LICENSE;md5=7707289753aa39daf59ecd93d0164faf \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/cld/LICENSE;md5=d8b32ba83f8b11e4badd979f4319e706 \
  file://${S}/third_party/cld_2/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=13b25413274c9b3b09b63e4028216ff4 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=740fe57c4bba4c18b3a3bafd39cb70f8 \
  file://${S}/third_party/icu/LICENSE;md5=fe9e1f2c500466d8f18df2cd068e4b74 \
  file://${S}/third_party/libpng/LICENSE;md5=b3edd1241cafd9e736d04c08d5017ff4 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=c2c05f9bdd5fc0b458037c2d1fb8d95e \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://v8-qemu-wrapper.patch \
 file://0001-IWYU-Include-math.h-for-round-3.patch;patchdir=third_party/webrtc \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
"
