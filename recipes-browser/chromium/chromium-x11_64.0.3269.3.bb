require chromium-x11.inc

SRC_URI[md5sum] = "24202e7fffcb09383079be9390979883"
SRC_URI[sha256sum] = "14a64bc25b48309566a0e9a9016336b53ae0443da500f2933292773a90b7542a"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=cfda07280f2f13fd8390a60b719c442a \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/icu/LICENSE;md5=675f2d069434d8a1e4e6b0dcf4379226 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://0001-IWYU-Include-math.h-for-round-3.patch;patchdir=third_party/webrtc \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-Cannot-compile-gen-blink-bindings-modules-v8-V8Windo.patch \
 file://0001-jumbo-avoid-ToBrowserAccessibilityAuraLinux-redefini.patch \
 file://0001-Fix-ATK-hyperlink-action-castings.patch \
"

GN_ARGS += "\
 use_jumbo_build = true \
"
