SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-ozone-wayland-dev-${PV}.tar.xz"
S = "${WORKDIR}/chromium-ozone-wayland-dev-${PV}"

require chromium-ozone-igalia.inc

SRC_URI[md5sum] = "dd631eb5160a9a9e76672b78f4c5e4d2"
SRC_URI[sha256sum] = "b0c84bda47b990d6fdf33af7b39dfc885000326cef3131c897047329cbf7b327"

LIC_FILES_CHKSUM += "\
  file://${S}/buildtools/third_party/libunwind/trunk/LICENSE.TXT;md5=f1a6f38bb5a8dabe8e3ec33557112dc9 \
  file://${S}/ios/third_party/material_internationalization_ios/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/ios/third_party/motion_animator_objc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/ios/third_party/motion_interchange_objc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/ios/third_party/motion_transitioning_objc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=63fc48094a8843e39d999e30954b7773 \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=fc70a2842a197fbb05a1fd3a90b47148 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/icu/LICENSE;md5=675f2d069434d8a1e4e6b0dcf4379226 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/v8/third_party/inspector_protocol/LICENSE;md5=db90dcb101891a7285d25f2fbceca752 \
  file://${S}/v8/LICENSE.valgrind;md5=df3b3d49700e781f7508895abd114277 \
"

SRC_URI += " \
 file://v8-6.4.336-qemu-wrapper.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
"
