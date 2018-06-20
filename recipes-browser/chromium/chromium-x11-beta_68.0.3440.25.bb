require chromium-x11.inc

SRC_URI[md5sum] = "32065d3b874bd8709b6c1c415a96fae6"
SRC_URI[sha256sum] = "d3f963d8790e2c86a1fec1c9725a854b2b35720cb3635bb679703023a2f26d59"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/angle/LICENSE;md5=7abdb66a6948f39c2f469140db5184e2 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=9b082148f9953258347788edb83e401b \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=fc70a2842a197fbb05a1fd3a90b47148 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=e021dd6dda6ff1e6b1044002fc662b9b \
  file://${S}/third_party/icu/LICENSE;md5=63752c57bd0b365c9af9f427ef79c819 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/v8/LICENSE;md5=bda6d3b7be87052ff181da3ed9fd5501 \
"

SRC_URI += " \
 file://v8-6.8.14-qemu-wrapper.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-CORS-legacy-add-missing-string-include.patch \
 file://0001-GCC-do-not-std-move-unique-ptr-of-forward-declared-U.patch \
"
