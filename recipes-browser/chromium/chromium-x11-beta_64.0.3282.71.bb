require chromium-x11.inc

SRC_URI[md5sum] = "82a95a51ded9a8230f7e0ec37df31508"
SRC_URI[sha256sum] = "4b93fe0047134203477c00dd360684db08a37f50b04f9cc01976d82631647ad6"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/boringssl/src/LICENSE;md5=4b1ad67f3a4b5a2346e6616c1268b0fb \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=d26a0653073e1d98c9bf58a1beddc1df \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=13b25413274c9b3b09b63e4028216ff4 \
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
 file://0001-Fix-use_cups-false-build.patch \
 file://0001-Mark-StaticType-related-functions-as-constexpr.patch;patchdir=third_party/angle \
"

GN_ARGS += "\
 use_jumbo_build = true \
"
