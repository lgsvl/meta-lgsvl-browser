require chromium-upstream-tarball.inc

PV = "75.0.3770.90"

SRC_URI[md5sum] = "9188549b97adb8f6410a223f2f376941"
SRC_URI[sha256sum] = "b1b59abbe19ecb88c17d99fa68f5c1c5585a5d66c100858f944aa3b93b943839"

LIC_FILES_CHKSUM += "\
  file://${S}/buildtools/third_party/libc++/trunk/LICENSE.TXT;md5=55d89dd7eec8d3b4204b680e27da3953 \
  file://${S}/buildtools/third_party/libc++abi/trunk/LICENSE.TXT;md5=7b9334635b542c56868400a46b272b1e \
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
  file://${S}/third_party/icu/LICENSE;md5=8bc5d32052a96f214cbdd1e53dfc935d \
  file://${S}/third_party/libjpeg_turbo/LICENSE.md;md5=843854939fbe775b4faaf7517f95b091 \
  file://${S}/third_party/libpng/LICENSE;md5=b0085051bf265bac2bfc38bc89f50000 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/openmax_dl/LICENSE;md5=3c999c621badfd6937bcfef14f4528ce \
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/v8/LICENSE;md5=6611673a9587a522034a4be8f4df564c \
"

SRC_URI += " \
 file://0001-Wrap-mksnapshot-and-torque-calls-on-Yocto-building-w.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-Add-missing-limits-header-to-crashpad.patch;patchdir=third_party/crashpad/crashpad \
 file://0001-NEON-do-not-use-certain-calls-that-would-break-GCC-b.patch;patchdir=third_party/skia \
 file://0001-GCC-do-not-use-COMPILER_GCC.patch;patchdir=third_party/angle \
 file://0001-omnibox-AutocompleteMatch-constructor-cannot-be-noex.patch \
 file://0001-libstdc-do-not-assume-unique_ptr-has-ostream-operato.patch \
 file://0001-zlib-fix-ARMv8-CRC32-compilation-in-GCC.patch \
 file://0001-Avoid-pure-virtual-crash-destroying-RenderProcessUse.patch \
"
