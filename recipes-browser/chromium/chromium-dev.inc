require chromium-upstream-tarball.inc

PV = "87.0.4252.0"

SRC_URI[sha256sum] = "5ea43fa7c79061f8fa5ce9f9f1e1776f1e639dad8fdfdd613af00f136dd3b4d3"

LIC_FILES_CHKSUM += "\
  file://${S}/base/third_party/double_conversion/LICENSE;md5=1ea35644f0ec0d9767897115667e901f \
  file://${S}/buildtools/third_party/libc++/trunk/LICENSE.TXT;md5=55d89dd7eec8d3b4204b680e27da3953 \
  file://${S}/buildtools/third_party/libc++abi/trunk/LICENSE.TXT;md5=7b9334635b542c56868400a46b272b1e \
  file://${S}/third_party/SPIRV-Tools/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/angle/LICENSE;md5=7abdb66a6948f39c2f469140db5184e2 \
  file://${S}/third_party/blink/LICENSE_FOR_ABOUT_CREDITS;md5=11e90d553b211de885f245900c4ccf89 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=9b082148f9953258347788edb83e401b \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/chromevox/LICENSE;md5=45739090b454125d851ac7bb1bbd23a2 \
  file://${S}/third_party/d3/src/LICENSE;md5=0679931d76eb2f1dd1915249da84a722 \
  file://${S}/third_party/expat/src/expat/COPYING;md5=9e2ce3b3c4c0f2670883a23bbd7c37a9 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=28c3eb351f68aa1d038e0e299dad5637 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=8f787620b7d3866d9552fd1924c07572 \
  file://${S}/third_party/icu/LICENSE;md5=a3808a5b70071b07f87ff2205e4d75a0 \
  file://${S}/third_party/libjpeg_turbo/LICENSE.md;md5=26d6491346496a57f75f00a78199122e \
  file://${S}/third_party/libpng/LICENSE;md5=b0085051bf265bac2bfc38bc89f50000 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/pdfium/LICENSE;md5=efe815679251504905d0f2c88a77c886 \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/skia/LICENSE;md5=822f02cc7736281816581cd064afbb1c \
  file://${S}/third_party/wtl/Ms-PL.txt;md5=1d2c3cdd7e748a6bc4213321d9157c5a \
  file://${S}/v8/LICENSE;md5=6611673a9587a522034a4be8f4df564c \
"

SRC_URI += " \
  file://0001-GCC-do-not-enable-CFI-in-any-case.patch \
  file://0001-IWYU-memcpy-required-cstring-in-byte_array.h.patch;patchdir=third_party/nearby/src \
  file://0001-Remove-explicit-keyword-in-AtomicReference-construct.patch;patchdir=third_party/nearby/src \
  file://0001-GCC-initialize-kImageMemoryBarrierData-with-initiali.patch;patchdir=third_party/angle \
  file://0001-GCC-make-begin-end-empty-methods-of-StringPiece-cons.patch \
  file://0001-GCC-do-not-use-namespace-linux-in-system-memory-pres.patch \
  file://0001-libstdc-usage-of-std-floorf-in-NG-out-of-flow-layout.patch \
  file://0001-IWYU-math.h-required-to-use-floor-in-QR-code-generat.patch \
  file://0001-GCC-do-not-use-template-specialization-in-namespace-.patch \
  file://0001-IWYU-usage-of-std-bitset-in-ui-AXEventGenerator-requ.patch \
"

do_install_append() {
        install -m 0755 crashpad_handler ${D}${libdir}/chromium/crashpad_handler
}

# Crashpad uses zlib internally, but it still does not handle properly the
# NEON codepath for GCC.
GN_ARGS_append_armv7ve += 'arm_use_neon=false'
