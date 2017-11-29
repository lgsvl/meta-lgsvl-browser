SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-ozone-wayland-dev-${PV}.tar.xz"
S = "${WORKDIR}/chromium-ozone-wayland-dev-${PV}"

require chromium-ozone-igalia.inc

SRC_URI[md5sum] = "1015ec7534923178edb61502b4d4ec34"
SRC_URI[sha256sum] = "9b5098ab9989a0d0df975f74ed7e65bd922fac593c74de9887450643047756c6"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=cf41b19a4171fd9fb94480fcbf1f99f2 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/icu/LICENSE;md5=675f2d069434d8a1e4e6b0dcf4379226 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://v8-qemu-wrapper.patch \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-Rotate-gcc-toolchain-s-build-flags.patch \
 file://0001-GCC-fix-lambda-expression-cannot-reach-this-scope.patch \
"
