require chromium-x11.inc

SRC_URI[md5sum] = "42ae49df02cdfec28a4f78c6784ee9a6"
SRC_URI[sha256sum] = "58d7db786e8504de52ba5113461f9015d743d906ff6dad743b90f4f5443e2994"

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
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=a8aee8de6dd702fa798fa8c7b6812a58 \
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
 file://0001-NEON-do-not-use-certain-calls-that-would-break-GCC-b.patch;patchdir=third_party/skia \
 file://0001-GCC-do-not-delete-move-constructor-of-QuicStreamSend.patch;patchdir=net/third_party/quiche/src \
 file://0001-crc32c-reenable-crc-and-crypto-extensions-to-arm64-c.patch \
 file://0001-base-Fix-Value-layout-for-GCC.patch \
 file://0001-Sampling-profiler-Move-NO_SANITIZE-before-function-d.patch \
 file://0001-GCC-replace-sequence_checker.h-__has_feature-with-HA.patch \
 file://0001-GCC-do-not-use-COMPILER_GCC.patch;patchdir=third_party/angle \
 file://0001-GCC-do-not-use-WARN_UNUSED-in-suffix-of-declaration-.patch \
 file://0001-Cast-MRP-Fix-GCC-build-because-of-invalid-default-co.patch \
 file://0001-FluentLanguageModel-IWYU-for-std-unique_ptr.patch \
 file://0001-IWYU-std-unique_ptr-of-NativeTheme-needs-full-declar.patch \
 file://0001-IWYU-missing-std-string-include-in-language_prefs.cc.patch \
 file://0001-LanguagePrefs-std-set-of-const-is-forbidden-in-libst.patch \
"
