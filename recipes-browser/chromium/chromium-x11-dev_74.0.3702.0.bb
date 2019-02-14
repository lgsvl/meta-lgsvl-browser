require chromium-x11.inc

SRC_URI[md5sum] = "b179cce32bd0e6ab1472ac1cb1046839"
SRC_URI[sha256sum] = "67ad09b7b523a95416837783c169abc0b1c45b8dc0fd239bf603a0fd0b87dffb"

LIC_FILES_CHKSUM += "\
  file://${S}/buildtools/third_party/libc++abi/trunk/LICENSE.TXT;md5=3600117b7c18121ab04c53e4615dc36e \
  file://${S}/third_party/SPIRV-Tools/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/angle/LICENSE;md5=7abdb66a6948f39c2f469140db5184e2 \
  file://${S}/third_party/blink/LICENSE_FOR_ABOUT_CREDITS;md5=11e90d553b211de885f245900c4ccf89 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=9b082148f9953258347788edb83e401b \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/chromevox/LICENSE;md5=45739090b454125d851ac7bb1bbd23a2 \
  file://${S}/third_party/d3/src/LICENSE;md5=0679931d76eb2f1dd1915249da84a722 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=005e77d67b51bc0b90c80d469d5e7a0e \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=e021dd6dda6ff1e6b1044002fc662b9b \
  file://${S}/third_party/icu/LICENSE;md5=63752c57bd0b365c9af9f427ef79c819 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/v8/LICENSE;md5=bda6d3b7be87052ff181da3ed9fd5501 \
"

SRC_URI += " \
 file://0001-Wrap-mksnapshot-and-torque-calls-on-Yocto-building-w.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-zlib-GCC-Disable-CRC32-optimizations-on-ARM.patch \
 file://0001-Add-missing-limits-header-to-crashpad.patch;patchdir=third_party/crashpad/crashpad \
 file://0001-IceTransportWithTransportChannel-Initialize-thread_c.patch;patchdir=third_party/webrtc \
 file://0001-Remove-invalid-noexcept-in-CastActivitymanager-DoLau.patch \
 file://0001-IWYU-ExtensionRegistry-in-BookmarkAppTabHelper.patch \
 file://0001-GCC-fix-canvas2d-rendering-context-type-conversion.patch \
 file://0001-FileSystemURL.-do-not-declare-noexcept-in-move-const.patch \
"
