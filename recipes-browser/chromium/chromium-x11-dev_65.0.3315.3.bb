require chromium-x11.inc

SRC_URI[md5sum] = "be6d66e09e0424c22c41ba9e1c60a9ff"
SRC_URI[sha256sum] = "850b0c8ca1646f7ba94816ce2a47d21f454ce9aff00bf994d9143d475249314c"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/boringssl/src/LICENSE;md5=4b1ad67f3a4b5a2346e6616c1268b0fb \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=d26a0653073e1d98c9bf58a1beddc1df \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/icu/LICENSE;md5=675f2d069434d8a1e4e6b0dcf4379226 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://v8-6.4.336-qemu-wrapper.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-Vulkan-Allow-for-no-.git-directory-in-build.patch;patchdir=third_party/angle \
 file://0001-GCC-fixes-avoid-symbol-collision-between-Element-Com.patch \
"

GN_ARGS += "\
 use_jumbo_build = true \
"
