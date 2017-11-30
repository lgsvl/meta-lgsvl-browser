SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-ozone-wayland-dev-${PV}.tar.xz"
S = "${WORKDIR}/chromium-ozone-wayland-dev-${PV}"

require chromium-ozone-igalia.inc

SRC_URI[md5sum] = "450ddf29143f0b0f0ae60fbd79f635eb"
SRC_URI[sha256sum] = "7398e608262614a17e42f24ebcc00889790103ca039ce6d3c6807fc0d1936875"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/boringssl/src/LICENSE;md5=4b1ad67f3a4b5a2346e6616c1268b0fb \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=d26a0653073e1d98c9bf58a1beddc1df \
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
 file://0001-Build-fix-for-GCC-conflicting-declaration-of-ax_plat.patch \
 file://0001-Build-fix-for-GCC-conflicting-declarations-of-Secure.patch \
 file://0001-GCC-build-fix-access-from-global-function-to-private.patch;patchdir=third_party/pdfium \
"
