require chromium-upstream-tarball.inc

PV = "90.0.4408.0"

SRC_URI[sha256sum] = "640eeedcba37d1884c5c44237ffe3a903edae2aaf3e7df345223c862be35e12d"

LIC_FILES_CHKSUM += "\
  file://${S}/base/third_party/double_conversion/LICENSE;md5=1ea35644f0ec0d9767897115667e901f \
  file://${S}/buildtools/third_party/libc++/trunk/LICENSE.TXT;md5=55d89dd7eec8d3b4204b680e27da3953 \
  file://${S}/buildtools/third_party/libc++abi/trunk/LICENSE.TXT;md5=7b9334635b542c56868400a46b272b1e \
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
  file://${S}/third_party/icu/LICENSE;md5=002d2fdc32d17f0ec06e9a47f2c0c8d0 \
  file://${S}/third_party/libjpeg_turbo/LICENSE.md;md5=26d6491346496a57f75f00a78199122e \
  file://${S}/third_party/libpng/LICENSE;md5=b0085051bf265bac2bfc38bc89f50000 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/pdfium/LICENSE;md5=efe815679251504905d0f2c88a77c886 \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/skia/LICENSE;md5=822f02cc7736281816581cd064afbb1c \
  file://${S}/third_party/woff2/LICENSE;md5=027c71da9e4664fdf192e6ec615f4d18 \
  file://${S}/third_party/wtl/Ms-PL.txt;md5=1d2c3cdd7e748a6bc4213321d9157c5a \
  file://${S}/v8/LICENSE;md5=6611673a9587a522034a4be8f4df564c \
"

SRC_URI += " \
  file://0001-GCC-only-set-is_cfi-for-Clang-builds.patch \
  file://0001-GCC-workaround-on-make_visitor-visibility-issue-in-Q.patch;patchdir=net/third_party/quiche/src \
  file://0001-libstdc-fix-incomplete-type-for-DelegatedInkTrailDat.patch \
  file://0001-IWYU-add-ctime-for-std-time.patch \
  file://0001-IWYU-add-missing-include-for-std-unique_ptr.patch \
  file://0001-PCScan-Make-gcc-compile-avx2-and-sse3-intrinsics.patch \
  file://0001-IWYU-include-memory-for-std-unique_ptr.patch \
  file://0001-GCC-make-base-InSeconds-F-constexpr.patch \
"

do_install_append() {
        install -m 0755 crashpad_handler ${D}${libdir}/chromium/crashpad_handler
}

# Crashpad uses zlib internally, but it still does not handle properly the
# NEON codepath for GCC.
GN_ARGS_append_armv7ve += 'arm_use_neon=false'
